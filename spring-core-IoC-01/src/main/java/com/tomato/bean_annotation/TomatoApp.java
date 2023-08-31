package com.tomato.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TomatoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigApp2.class);

           PartTimeMentor pt = container.getBean("pt",PartTimeMentor.class);
           PartTimeMentor primary = container.getBean(PartTimeMentor.class);
           pt.createAccount();
           primary.createAccount();

           FullTimeMentor ft1 = container.getBean("John",FullTimeMentor.class);
           ft1.createAccount();
           // throws .NoUniqueBeanDefinitionException cause bean without name nor primary tagged
          // FullTimeMentor ft2 = container.getBean(FullTimeMentor.class);

           String str = container.getBean(String.class);
           System.out.println(str);




    }
}
