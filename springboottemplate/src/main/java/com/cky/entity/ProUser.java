package com.cky.entity;

public class ProUser extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9136302358517328896L;

	private String uId;
	private String uPassword;
	private int uLvl;
	private int uStatus;
	private int uFailNum;
	private String uFreezeDate;
	private int uGroup;

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public int getuLvl() {
		return uLvl;
	}

	public void setuLvl(int uLvl) {
		this.uLvl = uLvl;
	}

	public int getuStatus() {
		return uStatus;
	}

	public void setuStatus(int uStatus) {
		this.uStatus = uStatus;
	}

	public int getuFailNum() {
		return uFailNum;
	}

	public void setuFailNum(int uFailNum) {
		this.uFailNum = uFailNum;
	}

	public String getuFreezeDate() {
		return uFreezeDate;
	}

	public void setuFreezeDate(String uFreezeDate) {
		this.uFreezeDate = uFreezeDate;
	}

	public int getuGroup() {
		return uGroup;
	}

	public void setuGroup(int uGroup) {
		this.uGroup = uGroup;
	}

}
