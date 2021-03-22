package com.LucasSantos.sbWithMongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.LucasSantos.sbWithMongoDb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	
}
