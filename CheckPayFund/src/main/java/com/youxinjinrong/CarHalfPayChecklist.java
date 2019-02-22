package com.youxinjinrong;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.youxinjinrong.mapper.CHPCMapper;

public class CarHalfPayChecklist {
	
	private int id;
	private int pay_id;
	private int applyid;
	private int fund_channel;
	private int total_periods;
	private int current_period;
	private boolean status;
	

	public CarHalfPayChecklist() {

	}
	
	
	public CarHalfPayChecklist(int id, int pay_id, int applyid, int fund_channel, int total_periods,
			int current_period,boolean status) {
		super();
		this.id = id;
		this.pay_id = pay_id;
		this.applyid = applyid;
		this.fund_channel = fund_channel;
		this.total_periods = total_periods;
		this.current_period = current_period;
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPay_id() {
		return pay_id;
	}
	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}
	public int getApplyid() {
		return applyid;
	}
	public void setApplyid(int applyid) {
		this.applyid = applyid;
	}
	public int getFund_channel() {
		return fund_channel;
	}
	public void setFund_channel(int fund_channel) {
		this.fund_channel = fund_channel;
	}
	public int getTotal_periods() {
		return total_periods;
	}
	public void setTotal_periods(int total_periods) {
		this.total_periods = total_periods;
	}
	public int getCurrent_period() {
		return current_period;
	}
	public void setCurrent_period(int current_period) {
		this.current_period = current_period;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	public String toString(){
		return this.getPay_id()+"+"+this.getStatus();
	}
	
	
}
