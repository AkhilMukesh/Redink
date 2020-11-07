package com.assesment.redink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assesment.redink.entity.Authors;
import com.assesment.redink.entity.Posts;

@Repository
public interface PostRepository extends JpaRepository<Posts,Long> {

	
	
}
