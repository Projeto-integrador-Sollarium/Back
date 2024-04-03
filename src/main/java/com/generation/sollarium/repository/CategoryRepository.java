package com.generation.sollarium.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.sollarium.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	 public List<Category> findAllByNameContainingIgnoreCase(String name);

}
