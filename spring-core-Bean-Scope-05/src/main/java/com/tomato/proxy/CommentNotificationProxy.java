package com.tomato.proxy;

import com.tomato.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
