package com.example.beans;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.infomodels.AuditTrail;
import com.example.infomodels.HeaderInfo;
import com.example.infomodels.PrimaryInfo;
import com.example.infomodels.ReportInfo;
import com.example.models.Questions;

@Document(collection = "Assessment")
public class Assessment {
	
	@Id
	public ObjectId _id;
	
	PrimaryInfo primaryInfo;
	HeaderInfo headerInfo;
	List<Object> questions;
	ReportInfo reportInfo;
	boolean isActive;
	AuditTrail auditTrail;
	
	
	public Assessment(ObjectId _id, PrimaryInfo primaryInfo, HeaderInfo headerInfo, List<Object> questions,
			ReportInfo reportInfo, boolean isActive, AuditTrail auditTrail) {
		super();
		this._id = _id;
		this.primaryInfo = primaryInfo;
		this.headerInfo = headerInfo;
		this.questions = questions;
		this.reportInfo = reportInfo;
		this.isActive = isActive;
		this.auditTrail = auditTrail;
	}
	
	
	public PrimaryInfo getPrimaryInfo() {
		return primaryInfo;
	}
	public void setPrimaryInfo(PrimaryInfo primaryInfo) {
		this.primaryInfo = primaryInfo;
	}
	public HeaderInfo getHeaderInfo() {
		return headerInfo;
	}
	public void setHeaderInfo(HeaderInfo headerInfo) {
		this.headerInfo = headerInfo;
	}
	public List<Object> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Object> questions) {
		this.questions = questions;
	}
	public ReportInfo getReportInfo() {
		return reportInfo;
	}
	public void setReportInfo(ReportInfo reportInfo) {
		this.reportInfo = reportInfo;
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
