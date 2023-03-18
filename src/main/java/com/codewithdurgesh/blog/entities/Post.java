package com.codewithdurgesh.blog.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PostId;
	@Column(name="Post_title",length=100,nullable=false)
	private String title;
	@Column(name="Post_Content",length=1000)
	private String content;
	private String imageName;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(Integer postId, String title, String content, String imageName, Date addedDate, Category category,
			User user) {
		super();
		PostId = postId;
		this.title = title;
		this.content = content;
		this.imageName = imageName;
		this.addedDate = addedDate;
		this.category = category;
		this.user = user;
	}
	public Integer getPostId() {
		return PostId;
	}
	public void setPostId(Integer postId) {
		PostId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private Date addedDate;
	@ManyToOne
	private Category category;
	@ManyToOne
	private User user;

}
