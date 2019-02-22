package com.youxinjinrong.converter;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class BooleanAndIntConverter extends BaseTypeHandler<Boolean> {
	
	/*
	 * ps:PreparedStatement对象
	 * i：PreparedStatement对象操作参数的位置
	 * parameter:java值
	 * jdbcType：jdbc操作的数据库类型
	 */
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
			throws SQLException {
		// TODO Auto-generated method stub
		
		if (parameter) {
			ps.setInt(i, 1);
		}else {
			ps.setInt(i, 0);
		}
		
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		int i =  rs.getInt(columnName);
		return i==1?true:false;
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		
		int i = rs.getInt(columnIndex);
		return i==1?true:false;
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int i = cs.getInt(columnIndex);
		return i==1?true:false;
	}

}
