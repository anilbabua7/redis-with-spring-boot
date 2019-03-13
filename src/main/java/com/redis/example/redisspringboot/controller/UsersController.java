package com.redis.example.redisspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redis.example.redisspringboot.entity.Users;
import com.redis.example.redisspringboot.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	UsersService usersService;
	
	@RequestMapping(value="/getUsers")
	public List<Users> getAllUsers(){
		return usersService.getAllUsers();
	}
	
	@Cacheable(value = "users", key = "#userId")
	@RequestMapping(value="/getUsers/{userId}")
	public Optional<Users> getUser(@PathVariable String userId){
		System.out.println("Hitting getUser API : "+userId);
		return usersService.getUser(userId);
	}
	
	
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public void saveUser(@RequestBody Users user){
		usersService.saveUser(user);;
	}

}
