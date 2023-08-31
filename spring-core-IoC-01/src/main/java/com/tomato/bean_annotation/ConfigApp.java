package com.tomato.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    @Primary
      PartTimeMentor partTimeMentor1(){
        System.out.println("primary mentor 1");
        return new PartTimeMentor();
    }

    @Bean(name="pt")
    PartTimeMentor partTimeMentor2(){
        System.out.println("Mentor 2 with name pt");
        return new PartTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor3(){
        System.out.println("Mentor 3");
        return new PartTimeMentor();
    }

    @Bean
    FullTimeMentor fullTimeMentor1(){
        return new FullTimeMentor();
    }
    @Bean(name ="John")
    FullTimeMentor fullTimeMentor2(){
        return new FullTimeMentor();
    }
}
