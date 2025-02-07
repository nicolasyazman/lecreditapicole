package io.github.nicolasyazman.simplebank.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "usercomments")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserComment {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer comment_id;
	
	@ManyToOne
	@JoinColumn (name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_usercomments_users"))
	private User user;
	
	@Column ( name = "comment", length = 1000, nullable = false) 
	private String comment;

	@Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
	
	// Constructors
	public UserComment() {}
	
	public UserComment(User user, String comment) {
        this.user = user;
        this.comment = comment;
        this.createdAt = LocalDateTime.now();
    }
	
	public Integer getCommentId() {
        return comment_id;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}
