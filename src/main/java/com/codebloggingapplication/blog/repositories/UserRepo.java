package com.codebloggingapplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebloggingapplication.blog.entities.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer > {

    Optional<User> findByEmail(String email);
}
