package com.example.infomodels;

import java.util.Date;

public class HeaderInfo {
	public HeaderInfo(String sprintNo, String assmntFilledById, String assmntFilledByEmail, String assmntFilledByName,
			String agileCoach, String assmntStatus, Date assmntStartDate, Date assmntExpiryDate, Date assmntSubmitDate,
			Date assmntCloseDate, boolean isFirstAssmnt) {
		super();
		this.sprintNo = sprintNo;
		this.assmntFilledById = assmntFilledById;
		this.assmntFilledByEmail = assmntFilledByEmail;
		this.assmntFilledByName = assmntFilledByName;
		this.agileCoach = agileCoach;
		this.assmntStatus = assmntStatus;
		this.assmntStartDate = assmntStartDate;
		this.assmntExpiryDate = assmntExpiryDate;
		this.assmntSubmitDate = assmntSubmitDate;
		this.assmntCloseDate = assmntCloseDate;
		this.isFirstAssmnt = isFirstAssmnt;
	}
	String sprintNo;
	String assmntFilledById;
	String assmntFilledByEmail;
	String assmntFilledByName;
	String agileCoach;
	String assmntStatus;
	Date assmntStartDate;
	Date assmntExpiryDate;
	Date assmntSubmitDate;
	Date assmntCloseDate;
	boolean isFirstAssmnt;
	public String getSprintNo() {
		return sprintNo;
	}
	public void setSprintNo(String sprintNo) {
		this.sprintNo = sprintNo;
	}
	public String getAssmntFilledById() {
		return assmntFilledById;
	}
	public void setAssmntFilledById(String assmntFilledById) {
		this.assmntFilledById = assmntFilledById;
	}
	public String getAssmntFilledByEmail() {
		return assmntFilledByEmail;
	}
	public void setAssmntFilledByEmail(String assmntFilledByEmail) {
		this.assmntFilledByEmail = assmntFilledByEmail;
	}
	public String getAssmntFilledByName() {
		return assmntFilledByName;
	}
	public void setAssmntFilledByName(String assmntFilledByName) {
		this.assmntFilledByName = assmntFilledByName;
	}
	public String getAgileCoach() {
		return agileCoach;
	}
	public void setAgileCoach(String agileCoach) {
		this.agileCoach = agileCoach;
	}
	public String getAssmntStatus() {
		return assmntStatus;
	}
	public void setAssmntStatus(String assmntStatus) {
		this.assmntStatus = assmntStatus;
	}
	public Date getAssmntStartDate() {
		return assmntStartDate;
	}
	public void setAssmntStartDate(Date assmntStartDate) {
		this.assmntStartDate = assmntStartDate;
	}
	public Date getAssmntExpiryDate() {
		return assmntExpiryDate;
	}
	public void setAssmntExpiryDate(Date assmntExpiryDate) {
		this.assmntExpiryDate = assmntExpiryDate;
	}
	public Date getAssmntSubmitDate() {
		return assmntSubmitDate;
	}
	public void setAssmntSubmitDate(Date assmntSubmitDate) {
		this.assmntSubmitDate = assmntSubmitDate;
	}
	public Date getAssmntCloseDate() {
		return assmntCloseDate;
	}
	public void setAssmntCloseDate(Date assmntCloseDate) {
		this.assmntCloseDate = assmntCloseDate;
	}
	public boolean isFirstAssmnt() {
		return isFirstAssmnt;
	}
	public void setFirstAssmnt(boolean isFirstAssmnt) {
		this.isFirstAssmnt = isFirstAssmnt;
	}
	
	

}
