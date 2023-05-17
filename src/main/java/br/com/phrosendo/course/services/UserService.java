package br.com.phrosendo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phrosendo.course.entities.User;
import br.com.phrosendo.course.repositories.UserRepository;
import br.com.phrosendo.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer id){
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete (Integer id) {
		repository.deleteById(id);
	}
	
	//
	/**
	 * A função getReferenceById prepara um objeto monitorado para que se possa mexer
	 * e somente depois fazer uma alteração no banco de dados.
	 * @param obj
	 * @param id
	 * @return
	 */
	public User update (User obj, Integer id) {
		User entity = repository.getReferenceById(id); 
		updateData(entity, obj);
		return repository.save(entity);
	}

	/**
	 * Método para atribuir a entidade as atualizações solicitadas
	 * apenas para os atributos permitidos.
	 * @param entity
	 * @param obj
	 */
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
