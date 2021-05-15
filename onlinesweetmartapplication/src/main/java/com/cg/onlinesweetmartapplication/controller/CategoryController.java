package com.cg.onlinesweetmartapplication.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlinesweetmartapplication.entity.Category;
import com.cg.onlinesweetmartapplication.exceptions.CategoryNotFoundException;
import com.cg.onlinesweetmartapplication.service.CategoryServiceImpl;

@RestController
public class CategoryController {

	 private CategoryServiceImpl CategoryService;
	 @PostMapping(path = "/category")
		public Category addCategory(@RequestBody @Valid Category category) {
			return CategoryService.addCategory(category);
		}
	 @PutMapping(path = "/category")
		public Category updateCategory(@RequestBody @Valid Category category) throws CategoryNotFoundException {
			return CategoryService.updateCategory(category);
		}
		
	 @DeleteMapping(path = "/category/{categoryId}")
		public Category deleteCategory(@PathVariable int categoryId) throws CategoryNotFoundException {
			return CategoryService.deleteCategory(categoryId);
		}
	 @GetMapping(path = "/category")
		public List<Category> showAllCategories() throws CategoryNotFoundException {
			return CategoryService.showAllCategories();
		}

		
		
		@GetMapping(path = "/caregory/{categoryId}")
		public Category findCategoryById(@PathVariable("categoryId") int categoryId) throws CategoryNotFoundException {
			Optional<Category> result = CategoryService.findCategoryById(categoryId);
			return result.get();

		}
		@GetMapping(path = "/ Category/name/{name}")
		public Category findCategoryByName(@PathVariable("name") String name) throws CategoryNotFoundException {
			return Category.get();
		}
}
