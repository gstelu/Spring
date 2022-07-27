package com.spring.mango.mongoApi.Service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mango.mongoApi.Entity.Employe;

public interface EmployeService extends MongoRepository<Employe,Integer> {

		

	}

