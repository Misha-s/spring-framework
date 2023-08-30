package com.tomato.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
      PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }
}
