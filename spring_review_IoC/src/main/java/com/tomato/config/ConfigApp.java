package com.tomato.config;

import com.tomato.model.FullTimeEmployee;
import com.tomato.model.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    @Primary
    PartTimeEmployee partTimeMentor1(){
        return new PartTimeEmployee();
    }

    @Bean(name="pt")
    PartTimeEmployee partTimeMentor2(){
        return new PartTimeEmployee();
    }



    @Bean
    @Primary
    FullTimeEmployee fullTimeMentor1(){
        return new FullTimeEmployee();
    }
    @Bean(name ="John")
    FullTimeEmployee fullTimeMentor2(){
        return new FullTimeEmployee();
    }
}
