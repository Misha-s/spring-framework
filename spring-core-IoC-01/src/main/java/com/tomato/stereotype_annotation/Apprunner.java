package com.tomato.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Apprunner {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigPolicyType.class, Config.class);

       Umbrella umb = container.getBean(Umbrella.class);
       umb.bindUmbrellaPolicy();

       Auto auto = container.getBean(Auto.class);
       auto.bindAutoPolicy();
       container.getBean(Auto.class).bindAutoPolicy();


        String str = container.getBean(String.class);
        System.out.println(str);

    }
}
