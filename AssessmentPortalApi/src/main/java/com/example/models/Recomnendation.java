package com.example.models;

public class Recomnendation {
	
	public Recomnendation(String recomnId, String recomnLabel) {
		super();
		this.recomnId = recomnId;
		this.recomnLabel = recomnLabel;
	}
	String recomnId;
	String recomnLabel;
	public String getRecomnId() {
		return recomnId;
	}
	public void setRecomnId(String recomnId) {
		this.recomnId = recomnId;
	}
	public String getRecomnLabel() {
		return recomnLabel;
	}
	public void setRecomnLabel(String recomnLabel) {
		this.recomnLabel = recomnLabel;
	}
}
