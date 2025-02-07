package io.github.nicolasyazman.simplebank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.github.nicolasyazman.simplebank.model.User;
import io.github.nicolasyazman.simplebank.model.UserComment;

import java.util.List;

@Repository
public interface UserCommentRepository extends CrudRepository<UserComment, Integer> {
    
    List<UserComment> findByUser(User user);

    List<UserComment> findByUserUserId(Integer userId);

    List<User> findDistinctUserBy();
}
