package com.cherry;

import com.cherry.model.Comment;
import com.cherry.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CherryApp {

    public static void main(String[] args) {
      ApplicationContext appContext =  SpringApplication.run(CherryApp.class, args);


        Comment comment = new Comment();
        comment.setAuthor("Jensen");
        comment.setText("Text text text!!");

       CommentService comService = appContext.getBean(CommentService.class);
        comService.publishComment(comment);
    }
}
