package com.accp.vo;

import java.util.Date;

public class PutforwardrecordVo {
private Integer pfrID;
private Integer userID;
private String userName;
private String bankName;
private Date submitTime;
private Date completeTime;
private Integer money;
private String adminOpinion;
public Integer getPfrID() {
	return pfrID;
}
public void setPfrID(Integer pfrID) {
	this.pfrID = pfrID;
}
public Integer getUserID() {
	return userID;
}
public void setUserID(Integer userID) {
	this.userID = userID;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Date getSubmitTime() {
	return submitTime;
}
public void setSubmitTime(Date submitTime) {
	this.submitTime = submitTime;
}
public Date getCompleteTime() {
	return completeTime;
}
public void setCompleteTime(Date completeTime) {
	this.completeTime = completeTime;
}
public Integer getMoney() {
	return money;
}
public void setMoney(Integer money) {
	this.money = money;
}
public String getAdminOpinion() {
	return adminOpinion;
}
public void setAdminOpinion(String adminOpinion) {
	this.adminOpinion = adminOpinion;
}
public PutforwardrecordVo(Integer pfrID, Integer userID, String userName, String bankName, Date submitTime,
		Date completeTime, Integer money, String adminOpinion) {
	super();
	this.pfrID = pfrID;
	this.userID = userID;
	this.userName = userName;
	this.bankName = bankName;
	this.submitTime = submitTime;
	this.completeTime = completeTime;
	this.money = money;
	this.adminOpinion = adminOpinion;
}
public PutforwardrecordVo() {
	super();
}


}
