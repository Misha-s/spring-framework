package com.cherry.proxy;

import com.cherry.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("push")
public class CommentPushNotification implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: "+ comment.getText());
    }
}
