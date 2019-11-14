package com.example.services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.example.beans.Assessment;
import com.example.models.Project;
import com.example.repositories.AssessmentRepository;
import com.example.repositories.ProjectRepository;

@Service
public class KPIMetricsSrv {
	
	@Autowired
	private AssessmentRepository assmntRepo;
	
	@Autowired
	private ProjectRepository projRepo; 
	String ErrorMsg;
	
	public Project getKPIMetricsForAssmnt(ObjectId assmntId)
	{
		System.out.println("AssessmentRepository-->"+assmntRepo);
		boolean isReport=false;
		Assessment assmntEnt = assmntRepo.findBy_id(assmntId);
		
		if(assmntEnt==null)
		{
			ErrorMsg="Assessment Id "+assmntId+" not exists";
		}
		Project projEnt= projRepo.findBy_id(assmntEnt.getPrimaryInfo().getProjectId());
		if(projEnt==null)
		{
			ErrorMsg="Project "+projEnt.getProjectName()+" not exists";
		}
		System.out.println(projEnt.getProjectName());
		
		return projEnt;
		
	}
}
