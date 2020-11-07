package com.assesment.redink.entity;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table
public class Posts {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PostID")
	private Long postid;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "PostedDate")
	private Date postedDate;
	
	
	@Column(name = "Body")
	private String body;
	
//	@ManyToOne
//	@JoinColumn(name = "AuthorID",nullable = false)
//	@NotNull
//	private Authors authors;
	
	@OneToMany(mappedBy = "posts", cascade = CascadeType.REMOVE)
	private Collection<Comment> comment;
	


}
