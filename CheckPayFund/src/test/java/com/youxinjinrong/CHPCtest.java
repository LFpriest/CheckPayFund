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
		//获取动态代理对象
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
		//使用业务扩展类一对一查询
//		CarHalfPayChecklistbusiness checklistbusiness = chpcMapper.selectdbOO(1);
//		System.out.println(checklistbusiness);
		//使用resultMap一对一查询
//		CarHalfPayChecklist checklist = chpcMapper.selectdbOOMap(1);
//		System.out.println(checklist);
		
		//使用resultMap一对多查询；
//		UserCompensatorySummary summary = chpcMapper.selectOTMMap(1590223560);
//		System.out.println(summary);
//		List<CarHalfPay> pays = summary.getPaylists();
//		System.out.println(pays);
//		
//		for(CarHalfPay pay:pays){
//			System.out.println(pay);
//		}
		
		//一对一查询使用延迟加载
//		List<CarHalfPayChecklist> checklists = chpcMapper.selectdbOOMapLazyloading();
//		
//		for(CarHalfPayChecklist checklist : checklists){
//			System.out.println(checklist);
//			UserCompensatorySummary summary = checklist.getSummary();
//			if (summary != null) {
//				System.out.println(summary);
//			}else {
//				continue;
//			}
//		}
		
		
		/**
		 * 实验一级缓存，mybatis默认开启一级缓存；如果用同样的SqlSession对象查询相同的数据，
		 * 则只会在第一次 查询时 向数据库发送SQL语句，并将查询的结果 放入到SQLSESSION中（作为缓存在）；
		 * 后续再次查询该同样的对象时，则直接从缓存中查询该对象即可（即省略了数据库的访问）；
		 * */
//		List<CarHalfPayChecklist> checklists = chpcMapper.selectdbOOMapLazyloading();
//		System.out.println(checklists);
//		
//		//commit()会清楚缓存中的数据,如果再查，需要再次查询数据库；
//		session.commit();
//		
//		List<CarHalfPayChecklist> checklists2 = chpcMapper.selectdbOOMapLazyloading();
//		System.out.println(checklists2);
		session.close();
		
		/**
		 * 实验二级缓存
		 * 
		 * */
		SqlSession session1 = sessionFactory.openSession();
		CHPCMapper chpcMapper1 = session1.getMapper(CHPCMapper.class);
		List<CarHalfPayChecklist> checklists1 = chpcMapper1.selectdbOOMapLazyloading();
		System.out.println(checklists1);

		session1.close();//触发将对象写入二级缓存的时机：SqlSession对象的close()方法。
		
		SqlSession session2 = sessionFactory.openSession();
		CHPCMapper chpcMapper2 = session2.getMapper(CHPCMapper.class);
		List<CarHalfPayChecklist> checklists2 = chpcMapper2.selectdbOOMapLazyloading();
		System.out.println(checklists2);
		session2.close();
		

		
		
		
		
	}
	
}
