package com.codebloggingapplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebloggingapplication.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

	
}
