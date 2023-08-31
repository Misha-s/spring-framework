package com.tomato.repository;

import com.tomato.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
