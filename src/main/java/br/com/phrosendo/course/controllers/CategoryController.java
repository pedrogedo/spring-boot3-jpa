package br.com.phrosendo.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phrosendo.course.entities.Category;
import br.com.phrosendo.course.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {

	@Autowired
	CategoryService userService = new CategoryService();
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id){
		Category category = userService.findById(id);
		return ResponseEntity.ok().body(category);
	}
}
