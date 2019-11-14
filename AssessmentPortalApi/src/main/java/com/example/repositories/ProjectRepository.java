package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Project;

@Repository
public interface ProjectRepository extends MongoRepository<Project,String>{

	Project findBy_id(String projectId);

}
