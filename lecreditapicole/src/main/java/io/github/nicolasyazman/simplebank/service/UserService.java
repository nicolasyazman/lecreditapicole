package io.github.nicolasyazman.simplebank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.nicolasyazman.simplebank.repository.UserCommentRepository;
import io.github.nicolasyazman.simplebank.repository.UserRepository;
import io.github.nicolasyazman.simplebank.model.User;
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	private final UserCommentRepository userCommentRepository;

    public UserService(UserCommentRepository userCommentRepository) {
        this.userCommentRepository = userCommentRepository;
    }

    public List<User> getUsersWhoLeftComments() {
        return userCommentRepository.findDistinctUserBy();
    }
    
    
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    

}
