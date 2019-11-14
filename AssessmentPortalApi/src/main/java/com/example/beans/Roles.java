package com.example.beans;

public class Roles {
	public Roles(String matRoleId, String matRoleLabel) {
		super();
		this.matRoleId = matRoleId;
		this.matRoleLabel = matRoleLabel;
	}
	String matRoleId;
	String matRoleLabel;
	public String getMatRoleId() {
		return matRoleId;
	}
	public void setMatRoleId(String matRoleId) {
		this.matRoleId = matRoleId;
	}
	public String getMatRoleLabel() {
		return matRoleLabel;
	}
	public void setMatRoleLabel(String matRoleLabel) {
		this.matRoleLabel = matRoleLabel;
	}
}
