package com.codebloggingapplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

import com.codebloggingapplication.blog.entities.Category;
import com.codebloggingapplication.blog.entities.Post;
import com.codebloggingapplication.blog.entities.User;

//Post has to be used that is why we have put  JpaRepository<Post> and post id is of integer type 
public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);

	List<Post> findByTitleContaining(String title);
}
