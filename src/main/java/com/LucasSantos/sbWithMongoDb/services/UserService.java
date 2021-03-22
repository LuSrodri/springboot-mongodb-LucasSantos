package com.LucasSantos.sbWithMongoDb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LucasSantos.sbWithMongoDb.domain.User;
import com.LucasSantos.sbWithMongoDb.dto.UserDTO;
import com.LucasSantos.sbWithMongoDb.repository.UserRepository;
import com.LucasSantos.sbWithMongoDb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO userDto) {
		return new User(userDto.getId(),userDto.getName(),userDto.getEmail());
	}
	
}
