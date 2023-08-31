package com.tomato.service;

import com.tomato.model.Comment;
import com.tomato.proxy.CommentNotificationProxy;
import com.tomato.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // opposite of prototype is singleton which is default mode
//@Scope(BeanDefinition.SCOPE_PROTOTYPE) // allow us to create multiple objects, in singleton mode only one obj created
@Lazy // by default its eager instantiation. @lazy does not work with Scope("prototype")
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
        System.out.println("test");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
