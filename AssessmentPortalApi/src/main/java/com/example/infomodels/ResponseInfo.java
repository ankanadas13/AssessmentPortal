package com.example.infomodels;

public class ResponseInfo {
	public ResponseInfo(String respStatus, String respMsg, String respAddOnMsg, String respOutcome) {
		super();
		RespStatus = respStatus;
		RespMsg = respMsg;
		RespAddOnMsg = respAddOnMsg;
		RespOutcome = respOutcome;
	}
	String RespStatus;
	String RespMsg;
	String RespAddOnMsg;
	String RespOutcome;
	public String getRespStatus() {
		return RespStatus;
	}
	public void setRespStatus(String respStatus) {
		RespStatus = respStatus;
	}
	public String getRespMsg() {
		return RespMsg;
	}
	public void setRespMsg(String respMsg) {
		RespMsg = respMsg;
	}
	public String getRespAddOnMsg() {
		return RespAddOnMsg;
	}
	public void setRespAddOnMsg(String respAddOnMsg) {
		RespAddOnMsg = respAddOnMsg;
	}
	public String getRespOutcome() {
		return RespOutcome;
	}
	public void setRespOutcome(String respOutcome) {
		RespOutcome = respOutcome;
	}
}
