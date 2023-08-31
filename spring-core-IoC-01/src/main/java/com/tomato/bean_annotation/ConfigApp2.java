package com.tomato.bean_annotation;

import org.springframework.context.annotation.Bean;

public class ConfigApp2 {
    @Bean
    String str(){
        return " Mentor is created ";
    }

    @Bean
    Integer number(){
        return 100;
    }
}
