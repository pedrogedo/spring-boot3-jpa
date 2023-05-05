package br.com.phrosendo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phrosendo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	
}