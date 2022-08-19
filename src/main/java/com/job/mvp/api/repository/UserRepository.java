package com.job.mvp.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.job.mvp.api.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	Optional<User> findByUserName(String userName);

	Boolean existsByUserName(String userName);

	Boolean existsByEmail(String email);
}
