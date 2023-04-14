package com.codebloggingapplication.blog.payloads;

import java.util.Date;

import com.codebloggingapplication.blog.entities.Category;
import com.codebloggingapplication.blog.entities.Comment;
import com.codebloggingapplication.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	private Integer postId;

	private String title;

	private String content;

	private String imageName;

	private Date addedDate;

	private CategoryDto category;

	private UserDto user;

	private Set<CommentDto> comments = new HashSet<>();

}  
