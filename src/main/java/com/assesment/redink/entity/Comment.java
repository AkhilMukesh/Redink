package com.assesment.redink.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table
public class Comment {

	@Id
	@Column(name = "CommentID")
	private Long id;
	
	@Column(name = "Comments")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "PostID",nullable = false)
	@NotNull
	private Posts posts;
	
	@ManyToOne
	@JoinColumn(name = "AuthorID")
	private Authors author;
	
	
}
