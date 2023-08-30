package com.tomato.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TomatoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigApp2.class);

           FullTimeMentor ftm = container.getBean(FullTimeMentor.class);
           ftm.createAccount();

       String str = container.getBean(String.class);
        System.out.println(str);




    }
}
