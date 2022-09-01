package com.anderson.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.course.entities.Users;
import com.anderson.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<Users>findAll() {
		return repository.findAll();
	}
	public Users findById(Long id) {
		Optional<Users> obj = repository.findById(id);
		return obj.get();
	}
	
	public Users insert(Users obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
