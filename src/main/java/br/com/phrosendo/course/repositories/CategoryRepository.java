package br.com.phrosendo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phrosendo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}