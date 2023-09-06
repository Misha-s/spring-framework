package com.cherry.service;


import com.cherry.model.Comment;
import com.cherry.proxy.CommentNotificationProxy;
import com.cherry.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

//    public CommentService(CommentRepository commentRepository,@Qualifier("commentPushNotification") CommentNotificationProxy commentNotificationProxy) {
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = commentNotificationProxy;
//    }

    public CommentService(CommentRepository commentRepository, @Qualifier("push") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
