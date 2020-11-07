package com.assesment.redink.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table
public class Authors {
	
	@Id
	@Column(name = "AuthorID")
	private Long id;
	
	
	@Column(name = "FirstName")
	private String firstname;

	
	@Column(name = "LastName")
	private String secondName;
	
//	@OneToMany(mappedBy = "authors")
//	private Collection<Posts> posts;
	
}
