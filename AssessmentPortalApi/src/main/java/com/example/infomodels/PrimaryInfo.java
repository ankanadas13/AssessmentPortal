package com.example.infomodels;

import java.util.List;

public class PrimaryInfo {
	public PrimaryInfo(String assmntBldrId, String status, String projectId, String projectName, String projectCode,
			String teamId, String teamName, String teamCode, List<String> pratices, String assmentCode) {
		super();
		this.assmntBldrId = assmntBldrId;
		this.status = status;
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamCode = teamCode;
		this.pratices = pratices;
		this.assmentCode = assmentCode;
	}
	String assmntBldrId;
	String status;
	String projectId;
	String projectName;
	String projectCode;
	String teamId;
	String teamName;
	String teamCode;
	List<String> pratices;
	String assmentCode;
	public String getAssmntBldrId() {
		return assmntBldrId;
	}
	public void setAssmntBldrId(String assmntBldrId) {
		this.assmntBldrId = assmntBldrId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
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
	public List<String> getPratices() {
		return pratices;
	}
	public void setPratices(List<String> pratices) {
		this.pratices = pratices;
	}
	public String getAssmentCode() {
		return assmentCode;
	}
	public void setAssmentCode(String assmentCode) {
		this.assmentCode = assmentCode;
	}
}
