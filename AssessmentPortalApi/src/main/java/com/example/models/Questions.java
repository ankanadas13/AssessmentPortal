package com.example.models;

import java.util.List;

public class Questions {
	public Questions(String questnId, String questnSeqId, String questnLabel, String maturityPoint,
			List<String> practices, List<Options> options, List<Categories> categories, boolean isActive) {
		super();
		this.questnId = questnId;
		this.questnSeqId = questnSeqId;
		this.questnLabel = questnLabel;
		this.maturityPoint = maturityPoint;
		this.practices = practices;
		this.options = options;
		this.categories = categories;
		this.isActive = isActive;
	}
	String questnId;
	String questnSeqId;
	String questnLabel;
	String maturityPoint;
	List<String> practices;
	List<Options> options;
	List<Categories> categories;
	boolean isActive;
	
	public String getQuestnId() {
		return questnId;
	}
	public void setQuestnId(String questnId) {
		this.questnId = questnId;
	}
	public String getQuestnSeqId() {
		return questnSeqId;
	}
	public void setQuestnSeqId(String questnSeqId) {
		this.questnSeqId = questnSeqId;
	}
	public String getQuestnLabel() {
		return questnLabel;
	}
	public void setQuestnLabel(String questnLabel) {
		this.questnLabel = questnLabel;
	}
	public String getMaturityPoint() {
		return maturityPoint;
	}
	public void setMaturityPoint(String maturityPoint) {
		this.maturityPoint = maturityPoint;
	}
	public List<String> getPractices() {
		return practices;
	}
	public void setPractices(List<String> practices) {
		this.practices = practices;
	}
	public List<Options> getOptions() {
		return options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	}
	public List<Categories> getCategories() {
		return categories;
	}
	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
