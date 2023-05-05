package br.com.phrosendo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phrosendo.course.entities.User;
import br.com.phrosendo.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
