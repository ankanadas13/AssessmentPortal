package com.example.infomodels;

import java.util.Date;

public class AuditTrail {
	public AuditTrail(String createdById, Date createdOn, String modifiedById, Date modifiedOn, int versionNo) {
		super();
		this.createdById = createdById;
		this.createdOn = createdOn;
		this.modifiedById = modifiedById;
		this.modifiedOn = modifiedOn;
		this.versionNo = versionNo;
	}
	String createdById;
	Date createdOn;
	String modifiedById;
	Date modifiedOn;
	int versionNo;
	public String getCreatedById() {
		return createdById;
	}
	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getModifiedById() {
		return modifiedById;
	}
	public void setModifiedById(String modifiedById) {
		this.modifiedById = modifiedById;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public int getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(int versionNo) {
		this.versionNo = versionNo;
	}
}
