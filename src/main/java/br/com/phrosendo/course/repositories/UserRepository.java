package br.com.phrosendo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phrosendo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
