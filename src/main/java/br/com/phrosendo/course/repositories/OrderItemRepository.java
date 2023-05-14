package br.com.phrosendo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phrosendo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{
	
}