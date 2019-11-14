package com.example.models;

import java.util.List;

public class Options {
	public Options(String optnId, String optnSeqId, String optnLabel, int weightage, boolean selected,
			List<Recomnendation> recomn) {
		super();
		this.optnId = optnId;
		this.optnSeqId = optnSeqId;
		this.optnLabel = optnLabel;
		this.weightage = weightage;
		this.selected = selected;
		this.recomn = recomn;
	}
	String optnId;
	String optnSeqId;
	String optnLabel;
	int weightage;
	boolean selected;
	List<Recomnendation> recomn;
	public String getOptnId() {
		return optnId;
	}
	public void setOptnId(String optnId) {
		this.optnId = optnId;
	}
	public String getOptnSeqId() {
		return optnSeqId;
	}
	public void setOptnSeqId(String optnSeqId) {
		this.optnSeqId = optnSeqId;
	}
	public String getOptnLabel() {
		return optnLabel;
	}
	public void setOptnLabel(String optnLabel) {
		this.optnLabel = optnLabel;
	}
	public int getWeightage() {
		return weightage;
	}
	public void setWeightage(int weightage) {
		this.weightage = weightage;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public List<Recomnendation> getRecomn() {
		return recomn;
	}
	public void setRecomn(List<Recomnendation> recomn) {
		this.recomn = recomn;
	}
}
