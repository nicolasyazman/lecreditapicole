package io.github.nicolasyazman.simplebank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.nicolasyazman.simplebank.model.User;
import io.github.nicolasyazman.simplebank.model.UserComment;
import io.github.nicolasyazman.simplebank.repository.UserCommentRepository;
import io.github.nicolasyazman.simplebank.repository.UserRepository;

@Service
public class UserCommentService {

	@Autowired
	UserCommentRepository userCommentRepository;
	
	public List<UserComment> getAllComments() {
		return (List<UserComment>) userCommentRepository.findAll();
	}
	
	public Optional<UserComment> getUserCommentById(Integer commentId) {
		return userCommentRepository.findById(commentId);
	}
    public List<User> getUsersWhoLeftComments() {
        return userCommentRepository.findDistinctUserBy();
    }
    
}

