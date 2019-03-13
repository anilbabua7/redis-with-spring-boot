package com.redis.example.redisspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.example.redisspringboot.entity.Users;

public interface UsersRepo extends JpaRepository<Users, String>{
	
}
