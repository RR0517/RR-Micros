package com.example.user.repository;

import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.user.entity.User;
import com.mongodb.client.MongoDatabase;

public interface UserRepository extends MongoRepository<User, String>{

	
}
