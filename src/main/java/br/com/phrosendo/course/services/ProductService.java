package br.com.phrosendo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phrosendo.course.entities.Product;
import br.com.phrosendo.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Integer id){
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
