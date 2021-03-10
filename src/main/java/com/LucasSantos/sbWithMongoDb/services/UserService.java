package com.LucasSantos.sbWithMongoDb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LucasSantos.sbWithMongoDb.domain.User;
import com.LucasSantos.sbWithMongoDb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
