package com.youxinjinrong;

import java.io.Serializable;

public class CarHalfPay implements Serializable {
	
	private int applyid;
	private int pay_id;
	private int refund_status;
	
	public int getApplyid() {
		return applyid;
	}
	public void setApplyid(int applyid) {
		this.applyid = applyid;
	}
	public int getPay_id() {
		return pay_id;
	}
	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}
	public int getRefund_status() {
		return refund_status;
	}
	public void setRefund_status(int refund_status) {
		this.refund_status = refund_status;
	}
	
	public String toString(){
		return this.pay_id+"+"+this.refund_status;
	}

}
