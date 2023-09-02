package com.tomato.config;

import org.springframework.context.annotation.Bean;

public class ConfigApp2 {
    @Bean(name="Fulltime")
    String getFullTime(){
        return " Full Time Employee is created";
    }

    @Bean
    String getPartTime(){
        return " Part Time Employee is created";
    }
}
