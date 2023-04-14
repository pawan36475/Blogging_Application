package com.codebloggingapplication.blog.repositories;

import com.codebloggingapplication.blog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {
}
