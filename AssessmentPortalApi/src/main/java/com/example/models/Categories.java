package com.example.models;

public class Categories {
	public Categories(String categoryId, String categoryLabel, Topic topic) {
		super();
		this.categoryId = categoryId;
		this.categoryLabel = categoryLabel;
		this.topic = topic;
	}
	String categoryId;
	String categoryLabel;
	Topic topic;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryLabel() {
		return categoryLabel;
	}
	public void setCategoryLabel(String categoryLabel) {
		this.categoryLabel = categoryLabel;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	} 
}
