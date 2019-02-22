package com.youxinjinrong.mapper;

import java.util.List;
import java.util.Map;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;

import com.youxinjinrong.CarHalfPayChecklist;
import com.youxinjinrong.CarHalfPayChecklistbusiness;
import com.youxinjinrong.JiHeClass;

/**
 * 1，操作 Mybatis的接口；
 * 2，约定：接口全类名需要和mapper.xml的namespace值一致；
 * 
 * */
public interface CHPCMapper {
	
	/**
	 * 约定内容：
	 * 1，方法名需要和mapper.xml中的sql的id值相同；
	 * 2，入参需要和mapper.xml中的parameterType类型相同；
	 * 3，返回值类型需要和mapper.xmo中的resultType类型相同；
	 * 
	 * */
//	public abstract CarHalfPayChecklist selectCHPC(int id);
//	public abstractke 可以不写，默认如此；
	CarHalfPayChecklist selectCHPC(int id);
	
	CarHalfPayChecklist selectStatus(int id);
	
	CarHalfPayChecklist selectStatuswithHashMap(int id);
	
	List<CarHalfPayChecklist> CHPCorderbyColumn(String column);
	
	List<CarHalfPayChecklist> selectCHPClike(CarHalfPayChecklist ck);
	
	List<CarHalfPayChecklist> selectCHPClikeWithHashMap(Map<String, Object> ckMap);
	
	void selectCountperiod(Map<String, Object> countMap);
	
	HashMap<String, Object> selectBieming(int id);
	
	List<HashMap<String, Object>> selectBiemingList();
	
	CarHalfPayChecklist selectDongTai(CarHalfPayChecklist ck);
	
	List<CarHalfPayChecklist> selectDongtaiIN(JiHeClass jh);
	
	List<CarHalfPayChecklist> selectDongtaiWithArray(int[] ids);
	
	List<CarHalfPayChecklist> selectDongtaiWithlsit(List<Integer> ids);
	
	List<CarHalfPayChecklist> selectDongtaiWithObject(CarHalfPayChecklist[] ckids);
	
	CarHalfPayChecklistbusiness selectdbOO(int id);
}
