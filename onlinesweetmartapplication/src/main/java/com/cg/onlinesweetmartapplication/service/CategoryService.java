package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.entity.Category;
import com.cg.onlinesweetmartapplication.exceptions.CategoryNotFoundException;

public interface CategoryService  {

	public Category addCategory(Category Category);
	public Category updateCategory(Category Category) throws CategoryNotFoundException;
	public Category cancelCategory(int CategoryId) throws CategoryNotFoundException;
	public List<Category> showAllCategorys();
	public double calculateTotalCost(int categoryId);

}
