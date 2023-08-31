package com.tomato;

import com.tomato.config.ProjectConfig;
import com.tomato.model.Comment;
import com.tomato.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("John");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);
        cs1.publishComment(comment);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1 == cs2);
    }
}
