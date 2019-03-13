package com.redis.example.redisspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redis.example.redisspringboot.entity.Users;
import com.redis.example.redisspringboot.repo.UsersRepo;

@Service
public class UsersService {
	
	@Autowired
	UsersRepo userRepo;
	
	public List<Users> getAllUsers(){
		return userRepo.findAll();
	}
	
	public Optional<Users> getUser(String id) {
		return userRepo.findById(id);
	}
	
	public void saveUser(Users user) {
		userRepo.save(user);
	}
	
	public void updateUser(Users user) {
		userRepo.save(user);
	}
	
	public void delete(Users user) {
		userRepo.delete(user);
	}

}
