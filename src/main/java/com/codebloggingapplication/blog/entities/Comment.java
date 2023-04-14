package com.codebloggingapplication.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@Data
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String content;

	@ManyToOne
	private Post post;
}
