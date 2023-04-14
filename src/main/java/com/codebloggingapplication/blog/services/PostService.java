package com.codebloggingapplication.blog.services;

import com.codebloggingapplication.blog.entities.Post;
import com.codebloggingapplication.blog.payloads.PostDto;
import com.codebloggingapplication.blog.payloads.PostResponse;

import java.util.*;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update post

	PostDto updatePost(PostDto postDto, Integer postid);

	// delete
	void deletePost(Integer postId);

	// getAll posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

	// getPost by Id
	PostDto getPostById(Integer postId);

	// getAll posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);

	// getAll posts by User
	List<PostDto> getPostsByUser(Integer userId);

	//
	List<PostDto> searchPosts(String keyword);

}
