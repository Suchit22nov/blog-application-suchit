package com.codewithdurgesh.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithdurgesh.blog.payloads.PostDto;
import com.codewithdurgesh.blog.services.PostService;

@RestController
@RequestMapping("/api/")
public class PostController {
	@Autowired
	private PostService postService;
	
	//Create
	@PostMapping("/user/{userId}/category/{categoryId}")
	public ResponseEntity<PostDto> createPost(
			@RequestBody PostDto postDto,
			@PathVariable Integer userId,
			@PathVariable Integer categoryId){
		PostDto createPost = this.postService.createPost(postDto,userId,categoryId);
		return new ResponseEntity<PostDto>(createPost,HttpStatus.OK);
	}
	
	

}
