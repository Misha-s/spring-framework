package com.tomato.stereotype_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    String str () { return "Hello"; }

}
