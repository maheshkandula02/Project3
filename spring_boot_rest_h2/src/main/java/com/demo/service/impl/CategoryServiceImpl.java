package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryRepository;
import com.demo.model.Category;
import com.demo.service.CategoryService;
@Service

public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository dao;

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return dao.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return dao.save(category);
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategoryById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub

		return dao.findAll();
	}

	@Override
	public List<Category> getCategoryByName(String name) {
		// TODO Auto-generated method stub
		
		return dao.findByName(name);
	}

}
