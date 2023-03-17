package com.codewithdurgesh.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithdurgesh.blog.entities.Category;
import com.codewithdurgesh.blog.exceptions.ResourceNotFoundException;
import com.codewithdurgesh.blog.payloads.CategoryDto;
import com.codewithdurgesh.blog.repositories.CategoryRepo;
import com.codewithdurgesh.blog.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category cat = this.modelMapper.map(categoryDto, Category.class);
		Category addedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(addedCat, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Category ID", categoryId));
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategorydescription(categoryDto.getCategorydescription());
		Category updatedcat = this.categoryRepo.save(cat);
		return this.modelMapper.map(updatedcat, CategoryDto.class);
	}

	@Override
	public CategoryDto getCategoryById(Integer categoryId) {
		Category getCat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "Category ID", categoryId));
		return this.modelMapper.map(getCat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getAllCategorys() {
		List<Category> getcat = this.categoryRepo.findAll();
		List<CategoryDto> catDto = getcat.stream().map((cat)-> this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
		return catDto;
		
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Category ID", categoryId));
		this.categoryRepo.delete(cat);
		
	}

}
