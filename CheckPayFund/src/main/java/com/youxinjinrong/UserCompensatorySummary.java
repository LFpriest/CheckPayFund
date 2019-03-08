package com.youxinjinrong;

import java.io.Serializable;
import java.util.List;

public class UserCompensatorySummary implements Serializable {
	
	private int applyid;
	private int loan_pay;
	
	//一对多
	private List<CarHalfPay> paylists;
	
	public List<CarHalfPay> getPaylists() {
		return paylists;
	}
	public void setPaylists(List<CarHalfPay> paylists) {
		this.paylists = paylists;
	}
	public int getApplyid() {
		return applyid;
	}
	public void setApplyid(int applyid) {
		this.applyid = applyid;
	}
	public int getLoan_pay() {
		return loan_pay;
	}
	public void setLoan_pay(int loan_pay) {
		this.loan_pay = loan_pay;
	}
	
	public String toString() {
		return this.applyid+"+"+this.loan_pay;
	}

}
