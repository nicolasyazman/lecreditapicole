package io.github.nicolasyazman.simplebank.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.github.nicolasyazman.simplebank.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	Optional<User> findByEmail(String email);
	    
	Optional<User> findByPhone(String phone);
	    
	boolean existsByEmail(String email);
	    
	boolean existsByPhone(String phone);
	    
}
