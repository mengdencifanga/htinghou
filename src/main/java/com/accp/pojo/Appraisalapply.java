package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Appraisalapply {
    private Integer applyid;

    private Integer userid;

    private Integer stid;
    @JSONField(format="yyyy-MM-dd")
    private Date submittime;
    @JSONField(format="yyyy-MM-dd")
    private Date audittime;

    private Integer auditstatus;

    private String adminopinion;


	public Integer getApplyid() {
		return applyid;
	}

	public void setApplyid(Integer applyid) {
		this.applyid = applyid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public Date getSubmittime() {
		return submittime;
	}

	public void setSubmittime(Date submittime) {
		this.submittime = submittime;
	}

	public Date getAudittime() {
		return audittime;
	}

	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}

	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}

	public String getAdminopinion() {
		return adminopinion;
	}

	public void setAdminopinion(String adminopinion) {
		this.adminopinion = adminopinion;
	}

	public Appraisalapply() {
		super();
	}

	@Override
	public String toString() {
		return "Appraisalapply [applyid=" + applyid + ", userid=" + userid + ", stid=" + stid + ", submittime="
				+ submittime + ", audittime=" + audittime + ", auditstatus=" + auditstatus + ", adminopinion="
				+ adminopinion + "]";
	}
}