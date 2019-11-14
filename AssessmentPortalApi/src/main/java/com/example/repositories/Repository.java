package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.beans.Assessment;

public interface Repository extends MongoRepository<Assessment, String>{
	
}
