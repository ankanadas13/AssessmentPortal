package com.example.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.beans.Assessment;

@Repository
public interface AssessmentRepository extends MongoRepository<Assessment,String> 
{

	Assessment findBy_id(ObjectId assmntId);
}
