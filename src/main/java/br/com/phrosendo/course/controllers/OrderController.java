package br.com.phrosendo.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phrosendo.course.entities.Order;
import br.com.phrosendo.course.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderController {
	
	@Autowired
	OrderService userService = new OrderService();
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		Order user = userService.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
