package com.cg.onlinesweetmartapplication.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlinesweetmartapplication.entity.Category;
import com.cg.onlinesweetmartapplication.exceptions.CategoryNotFoundException;

public interface CategoryService  {

	public Category addCategory(Category Category);
	
	public Category updateCategory(Category Category) throws CategoryNotFoundException;
	
	public Category deleteCategory(int CategoryId) throws CategoryNotFoundException;
	
	//  public List<Category> showAllCategory() throws CategoryNotFoundException;
	
	//public double calculateTotalCost(int categoryId) throws CategoryNotFoundException;

	String deleteCategoryById(int categoryId) throws CategoryNotFoundException;

	List<Category> showAllCategories() throws CategoryNotFoundException;

	Optional<Category> findByCategoryId(int categoryId) throws CategoryNotFoundException;

}
