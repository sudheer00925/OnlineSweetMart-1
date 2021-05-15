package com.cg.onlinesweetmartapplication.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesweetmartapplication.entity.Category;
import com.cg.onlinesweetmartapplication.exceptions.CategoryNotFoundException;
import com.cg.onlinesweetmartapplication.repository.CategoryRepository;

@Service
public  class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;

	@override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}
	@Override
	public Category updateCategory(Category category) throws CategoryNotFoundException {
		int categoryId = category.getCategoryId();
		boolean found = categoryRepository.existsById(categoryId);
		if (found) {
			category.setName(category.getName());
			return categoryRepository.save(category);
		} else
			throw new CategoryNotFoundException("No such category found");

	}
	@Override
	public Category deleteCategory(int CategoryId) throws CategoryNotFoundException{
		Category category;
		if (categoryRepository.existsById(CategoryId)) {
			categoryRepository.deleteById(CategoryId);
			return category;
		} else
			throw new CategoryNotFoundException("No such category found with id: " + CategoryId);

	}
	public Category updateCustomer(@Valid Category customer) {
		// TODO Auto-generated method stub
		return null;
	}


	public Optional<Category> findCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	public Optional<Category> findCategoryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Category> showAllCategories() throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Category> findByCategoryId(int categoryId) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



}