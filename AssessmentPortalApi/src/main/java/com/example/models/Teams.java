package com.example.models;

import java.util.List;

public class Teams {
	String teamId;
	String teamName;
	String teamCode;
	String scrumMasterId;
	String scrumMasterEmail;
	String scrumMasterName;
	String isDigitalScrumMaster;
	String sprintDuration;
	String productOwnerName;
	List<String> practices;
	List<TeamMembers> teamMembers;
	boolean isActive;
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCode() {
		return teamCode;
	}
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
	public String getScrumMasterId() {
		return scrumMasterId;
	}
	public void setScrumMasterId(String scrumMasterId) {
		this.scrumMasterId = scrumMasterId;
	}
	public String getScrumMasterEmail() {
		return scrumMasterEmail;
	}
	public void setScrumMasterEmail(String scrumMasterEmail) {
		this.scrumMasterEmail = scrumMasterEmail;
	}
	public String getScrumMasterName() {
		return scrumMasterName;
	}
	public void setScrumMasterName(String scrumMasterName) {
		this.scrumMasterName = scrumMasterName;
	}
	public String getIsDigitalScrumMaster() {
		return isDigitalScrumMaster;
	}
	public void setIsDigitalScrumMaster(String isDigitalScrumMaster) {
		this.isDigitalScrumMaster = isDigitalScrumMaster;
	}
	public String getSprintDuration() {
		return sprintDuration;
	}
	public void setSprintDuration(String sprintDuration) {
		this.sprintDuration = sprintDuration;
	}
	public String getProductOwnerName() {
		return productOwnerName;
	}
	public void setProductOwnerName(String productOwnerName) {
		this.productOwnerName = productOwnerName;
	}
	public List<String> getPractices() {
		return practices;
	}
	public void setPractices(List<String> practices) {
		this.practices = practices;
	}
	public List<TeamMembers> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<TeamMembers> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	} 
}
