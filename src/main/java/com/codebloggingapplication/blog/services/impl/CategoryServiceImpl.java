package com.codebloggingapplication.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codebloggingapplication.blog.entities.Category;
import com.codebloggingapplication.blog.entities.User;
import com.codebloggingapplication.blog.exceptions.ResourceNotFoundException;
import com.codebloggingapplication.blog.payloads.CategoryDto;
import com.codebloggingapplication.blog.payloads.UserDto;
import com.codebloggingapplication.blog.repositories.CategoryRepo;
import com.codebloggingapplication.blog.services.CategoryService;
import java.util.*;
import java.util.stream.Collectors;

@Component
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
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Category Id", categoryId));
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		//cat.setCategoryId(categoryDto.getCategoryId());
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		Category updatedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(updatedCat, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {

		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Category Id", categoryId));
		this.categoryRepo.delete(cat);

	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {

		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Category Id", categoryId));
		return this.modelMapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> allCat = this.categoryRepo.findAll();
		List<CategoryDto> catDtos = allCat.stream().map(cat -> this.modelMapper.map(cat, CategoryDto.class))
				.collect(Collectors.toList());
		Iterator<Category> itr = allCat.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getCategoryDescription());
		}
		return catDtos;
	}

}
