package com.codewithdurgesh.blog.payloads;

import java.util.List;

public class PostResponse {
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private long totalElement;
	private int totalPage;
	private boolean lastPage;
	
	
	public PostResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostResponse(List<PostDto> content, int pageNumber, int pageSize, long totalElement, int totalPage,
			boolean lastPage) {
		super();
		this.content = content;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.totalElement = totalElement;
		this.totalPage = totalPage;
		this.lastPage = lastPage;
	}
	public List<PostDto> getContent() {
		return content;
	}
	public void setContent(List<PostDto> content) {
		this.content = content;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalElement() {
		return totalElement;
	}
	public void setTotalElement(long totalElement) {
		this.totalElement = totalElement;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public boolean isLastPage() {
		return lastPage;
	}
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
}
