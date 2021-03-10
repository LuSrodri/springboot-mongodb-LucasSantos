package com.LucasSantos.sbWithMongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.LucasSantos.sbWithMongoDb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	
}
