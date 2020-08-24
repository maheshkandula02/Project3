package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	public List<Category> findByName(String name);
}