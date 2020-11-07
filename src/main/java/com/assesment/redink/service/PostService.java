package com.assesment.redink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.redink.entity.Posts;
import com.assesment.redink.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Posts savePost(Posts post) {
		return postRepository.save(post);
	}
	
	
}
