package br.com.phrosendo.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phrosendo.course.entities.Product;
import br.com.phrosendo.course.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {

	@Autowired
	ProductService userService = new ProductService();
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id){
		Product product = userService.findById(id);
		return ResponseEntity.ok().body(product);
	}
}
