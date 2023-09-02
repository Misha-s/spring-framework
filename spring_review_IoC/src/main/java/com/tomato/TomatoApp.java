package com.tomato;

import com.tomato.config.ConfigApp;
import com.tomato.config.ConfigApp2;
import com.tomato.model.FullTimeEmployee;
import com.tomato.model.PartTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TomatoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigApp2.class);

           PartTimeEmployee pt = container.getBean("pt",PartTimeEmployee.class);
             PartTimeEmployee primary = container.getBean(PartTimeEmployee.class);
           pt.createAccount();
           primary.createAccount();

           // throws .NoUniqueBeanDefinitionException cause bean without name nor primary tagged
        FullTimeEmployee ft2 = container.getBean("John",FullTimeEmployee.class);
        FullTimeEmployee bean = container.getBean(FullTimeEmployee.class);
        bean.createAccount();

        String str = container.getBean("Fulltime",String.class);
       // String str1 = container.getBean("getPartTime",String.class);

        System.out.println(str);
       // System.out.println(str1);




    }
}
