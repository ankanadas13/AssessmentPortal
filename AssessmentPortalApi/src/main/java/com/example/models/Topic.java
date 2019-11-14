package com.example.models;

public class Topic {
	public Topic(String topicId, String topicLabel) {
		super();
		this.topicId = topicId;
		this.topicLabel = topicLabel;
	}
	String topicId;
	String topicLabel;
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getTopicLabel() {
		return topicLabel;
	}
	public void setTopicLabel(String topicLabel) {
		this.topicLabel = topicLabel;
	}
}
