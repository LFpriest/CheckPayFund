package com.youxinjinrong;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.youxinjinrong.mapper.CHPCMapper;

public class CHPCtest {
	
	public static void main(String[] args) throws IOException {
		//加载Mybatis配置文件
		Reader reader = Resources.getResourceAsReader("conf.xml");
		//加载配置文件中的各项数据库配置，并建立数据库连接
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession  session = sessionFactory.openSession();
		
		CHPCMapper chpcMapper = session.getMapper(CHPCMapper.class);
		//使用自定义类型转换器查询；
//		CarHalfPayChecklist sqltest = chpcMapper.selectStatus(2);
		
//		//使用resultType+HashMap指定表的字段名和类的属性名；
//		CarHalfPayChecklist sqltest = chpcMapper.selectStatuswithHashMap(1);
//		System.out.println(sqltest);
		
		/**
		 *mapper.xml中 parameterType输入参数测试
		 * */
		//排序
//		List<CarHalfPayChecklist>  sqltest = chpcMapper.CHPCorderbyColumn("applyid");
//		System.out.println(sqltest);
		
//		//模糊查询,入参为对象
//		CarHalfPayChecklist checklist = new CarHalfPayChecklist();
//		checklist.setCurrent_period(2);
//		checklist.setPay_id(18);
//		List<CarHalfPayChecklist> likelist = chpcMapper.selectCHPClike(checklist);
//		System.out.println(likelist);
//		
//		//模糊查询，入参为HashMap；
//		Map<String, Object> ckMap = new HashMap<String, Object>();
//		ckMap.put("current_period", 2);
//		ckMap.put("pay_id", 18);
//		List<CarHalfPayChecklist> likemap = chpcMapper.selectCHPClikeWithHashMap(ckMap);
//		System.out.println(likemap);
		
//		//使用存储过程，使用Map指定存储过程的输入参数值；
//		Map<String, Object> countMap = new HashMap<String, Object>();
//		countMap.put("period", 1);
//		chpcMapper.selectCountperiod(countMap);
//		//获取存储过程输出参数的结果；
//	    int i = (Integer) countMap.get("scount");
//		System.out.println(i);
		
//		//输出结果为HashMap
//		Map<String, Object> result = new HashMap<String, Object>();
//		result = chpcMapper.selectBieming(1);
//		System.out.println(result);
//		System.out.println(result.get("orderid") + "+" + result.get("zifang"));
//		List<HashMap<String, Object>> resultlist = chpcMapper.selectBiemingList();
//		System.out.println(resultlist);
		
		
/*		//加载配置文件中的sql语句；
		String statement =  "com.youxinjinrong.CHPCMapper.selectCHPC";
		//执行select语句；
		CarHalfPayChecklist sqltest = session.selectOne(statement,1);
*/		
//		System.out.println(sqltest.toString());
		
		
		/**
		 * 动态SQL
		 * 
		 * */
		//多条件查询
//		CarHalfPayChecklist checklist = new CarHalfPayChecklist();
//		checklist.setApplyid(1234674817);
//		checklist.setFund_channel(1);
//		
//		CarHalfPayChecklist ck = chpcMapper.selectDongTai(checklist);
//		System.out.println(ck);
		
		//sql中使用in查多条数据(数组、集合、对象属性)
		//使用对象属性传递in中的元素
//		JiHeClass jiHe = new JiHeClass();
//		List<Integer> listint = new ArrayList<Integer>();
//		listint.add(1);
//		listint.add(2);
//		listint.add(3);
//		jiHe.setIds(listint);
//		List<CarHalfPayChecklist> checklists = chpcMapper.selectDongtaiIN(jiHe);
//		System.out.println(checklists);
		
		//使用数组传递in中的元素
//		int[] ids = {1,2,3};
//		List<CarHalfPayChecklist> checklists = chpcMapper.selectDongtaiWithArray(ids);
//		System.out.println(checklists);
		
		//使用集合传递in中元素
//		List<Integer> ids = new ArrayList<Integer>();
//		ids.add(1);
//		ids.add(2);
//		ids.add(3);
//		List<CarHalfPayChecklist> checklists = chpcMapper.selectDongtaiWithlsit(ids);
//		System.out.println(checklists);

		//使用对象数组传递in中的元素；
//		CarHalfPayChecklist id1 = new CarHalfPayChecklist();
//		CarHalfPayChecklist id2 = new CarHalfPayChecklist();
//		CarHalfPayChecklist id3 = new CarHalfPayChecklist();
//		
//		id1.setId(1);
//		id2.setId(2);
//		id3.setId(3);
//		
//		CarHalfPayChecklist[] ids = {id1,id2,id3};
//
//		List<CarHalfPayChecklist> checklists = chpcMapper.selectDongtaiWithObject(ids);
//		System.out.println(checklists);
		
		
		/**
		 * 多表查询
		 * */
		
		CarHalfPayChecklistbusiness checklistbusiness = chpcMapper.selectdbOO(1);
		System.out.println(checklistbusiness);
		
		
		session.close();
		
	}
	
}
