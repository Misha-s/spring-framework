package com.cherry.proxy;

import com.cherry.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
