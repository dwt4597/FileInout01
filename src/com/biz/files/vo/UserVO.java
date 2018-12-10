package com.biz.files.vo;

public class UserVO {
	private String strId;
	private String strPassword;
	private String strName;
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	@Override
	public String toString() {
		return "UserVO [strId=" + strId + ", strPassword=" + strPassword + ", strName=" + strName + ", getStrId()="
				+ getStrId() + ", getStrName()=" + getStrName() + ", getStrPassword()=" + getStrPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
