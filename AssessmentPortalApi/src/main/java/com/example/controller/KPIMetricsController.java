package com.example.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Assessment;
import com.example.models.Project;
import com.example.services.KPIMetricsSrv;
@RestController
@RequestMapping("/api/KPIMetrics")
public class KPIMetricsController {
	String RespMsg;
	String ErrorMsg;
	
	@Autowired
	KPIMetricsSrv kpi;
	
	@RequestMapping(value = "/GetKPIMetricsForAssmnt", method = RequestMethod.POST)
	public Project getKPIMetricsForAssmntApi(@RequestParam("assmntId") ObjectId assmntId,@RequestParam("emailId") String emailId) {
		
		if(assmntId==null || assmntId.toString().isEmpty())
		{
			ErrorMsg="Assessment Id is not set";
		}
		if(emailId == null || emailId.isEmpty())
		{
			ErrorMsg="EmailId Id is not set";
		}
		
	
		Project users=kpi.getKPIMetricsForAssmnt(assmntId);
		
		
		return users;
	  
	}

}
