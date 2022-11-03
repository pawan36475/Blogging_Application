package com.codebloggingapplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebloggingapplication.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
