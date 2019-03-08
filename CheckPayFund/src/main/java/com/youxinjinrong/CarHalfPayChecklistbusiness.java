package com.youxinjinrong;

import java.io.Serializable;

public class CarHalfPayChecklistbusiness extends CarHalfPayChecklist  {
	private int applyid;
	private int loan_pay;
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
	
	public String toString(){
		return super.toString() + "+" + this.applyid + "+" + this.loan_pay;
	}

	
}
