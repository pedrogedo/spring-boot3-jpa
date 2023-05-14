package br.com.phrosendo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phrosendo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}