package com.cherry.repository;


import com.cherry.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
