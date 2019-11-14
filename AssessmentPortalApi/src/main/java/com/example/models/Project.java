package com.example.models;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.infomodels.AuditTrail;

@Document(collection = "Project")
public class Project {
	
	@Id
	public ObjectId _id;
	
	String projectName;
	String projectCode;
	String businessUnit;
	String accountName;
	String deliveryMgrId;
	String deliveryMgrEmail;
	String deliveryMgrName;
	Date startDate;
	Date endDate;
	String projectStatus;
	List<ProjMembers> projMembers;
	List<Teams> teams;
	boolean isActive;
	AuditTrail auditTrail;
	
	public Project(ObjectId _id, String projectName, String projectCode, String businessUnit, String accountName,
			String deliveryMgrId, String deliveryMgrEmail, String deliveryMgrName, Date startDate, Date endDate,
			String projectStatus, List<ProjMembers> projMembers, List<Teams> teams, boolean isActive,
			AuditTrail auditTrail) {
		super();
		this._id = _id;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.businessUnit = businessUnit;
		this.accountName = accountName;
		this.deliveryMgrId = deliveryMgrId;
		this.deliveryMgrEmail = deliveryMgrEmail;
		this.deliveryMgrName = deliveryMgrName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectStatus = projectStatus;
		this.projMembers = projMembers;
		this.teams = teams;
		this.isActive = isActive;
		this.auditTrail = auditTrail;
	}
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getDeliveryMgrId() {
		return deliveryMgrId;
	}
	public void setDeliveryMgrId(String deliveryMgrId) {
		this.deliveryMgrId = deliveryMgrId;
	}
	public String getDeliveryMgrEmail() {
		return deliveryMgrEmail;
	}
	public void setDeliveryMgrEmail(String deliveryMgrEmail) {
		this.deliveryMgrEmail = deliveryMgrEmail;
	}
	public String getDeliveryMgrName() {
		return deliveryMgrName;
	}
	public void setDeliveryMgrName(String deliveryMgrName) {
		this.deliveryMgrName = deliveryMgrName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public List<ProjMembers> getProjMembers() {
		return projMembers;
	}
	public void setProjMembers(List<ProjMembers> projMembers) {
		this.projMembers = projMembers;
	}
	public List<Teams> getTeams() {
		return teams;
	}
	public void setTeams(List<Teams> teams) {
		this.teams = teams;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public AuditTrail getAuditTrail() {
		return auditTrail;
	}
	public void setAuditTrail(AuditTrail auditTrail) {
		this.auditTrail = auditTrail;
	}
}
