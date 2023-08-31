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

//        CommentService cs = context.getBean(CommentService.class);
//        cs.publishComment(comment);
    }
}
