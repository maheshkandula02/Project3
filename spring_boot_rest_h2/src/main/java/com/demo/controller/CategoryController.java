package com.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.service.CategoryService;


@RestController

public class CategoryController {
	
	@Autowired
 private CategoryService service;

	@PostMapping("/category")
	public Category addCategory(@RequestBody Category category) {
		// TODO Auto-generated method stub
		return service.addCategory(category);
	}

	@PutMapping("/category")
	public Category updateCategory(@RequestBody Category category) {
		// TODO Auto-generated method stub
		return service.updateCategory(category);
	}
	@GetMapping("/category/{id}")

	public Category getCategoryById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getCategoryById(id);
	}

	@DeleteMapping("/category/{id}")
	public void deleteCategoryById(@PathVariable int id) {
		// TODO Auto-generated method stub

		service.deleteCategoryById(id);
		
	}


	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return service.getAllCategories();
	}

	@GetMapping("/categories/name/{name}")
	public List<Category> getCategoryByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return service.getCategoryByName(name);
	}

}
