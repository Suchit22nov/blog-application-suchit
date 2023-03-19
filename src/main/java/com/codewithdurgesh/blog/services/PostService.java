package com.codewithdurgesh.blog.services;

import java.util.List;
import com.codewithdurgesh.blog.payloads.PostDto;

public interface PostService {
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	PostDto updatePost(PostDto postDto,Integer postId);
	void deletePost(Integer postId);
	PostDto getPostById(Integer postId);
	List<PostDto> getAllPost();
	List<PostDto> getPostByCategory(Integer CategoryId);
	List<PostDto> getPostByUser(Integer userId );
	PostDto createPost(PostDto postDto);

}
