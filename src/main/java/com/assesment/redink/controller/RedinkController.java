package com.assesment.redink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.redink.entity.Posts;
import com.assesment.redink.service.PostService;

@RestController
@RequestMapping("/redink")
public class RedinkController {
	
	@Autowired
	private PostService postService;

	@PostMapping(value = "/add/post")
	public Posts savePost(@RequestBody Posts post) {
		return postService.savePost(post);
	}
	
}
