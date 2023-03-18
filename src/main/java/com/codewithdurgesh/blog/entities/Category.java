package com.codewithdurgesh.blog.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer categoryId; 
	
	@Column(name="title",length=100,nullable=false)
	private String categoryTitle;

	@Column(name="description")
	private String categorydescription;
	
	@OneToMany(mappedBy="category")
	private List<Post> posts = new ArrayList<>();
	

	public List<Post> getPosts() {
		return posts;
	}
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer categoryId, String categoryTitle, String categorydescription, List<Post> posts) {
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
		this.categorydescription = categorydescription;
		this.posts = posts;
	}
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategorydescription() {
		return categorydescription;
	}

	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}


}
