package io.github.nicolasyazman.simplebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.nicolasyazman.simplebank.model.User;
import io.github.nicolasyazman.simplebank.model.UserComment;
import io.github.nicolasyazman.simplebank.service.UserCommentService;
import io.github.nicolasyazman.simplebank.service.UserService;

@RestController
@RequestMapping("/api/userscomment")
public class UsersCommentController {

	@Autowired
    private UserCommentService userCommentService;
	
    @GetMapping("/all")
    public ResponseEntity<List<UserComment>> getUsersWhoLeftComments() {
        List<UserComment> usersComments = userCommentService.getAllComments();
        return ResponseEntity.ok(usersComments);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<UserComment> getCommentById(@PathVariable Integer id) {
    	 return userCommentService.getUserCommentById(id)
                 .map(ResponseEntity::ok)
                 .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
