package com.tomato.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.tomato")
@ComponentScan(basePackages = {"com.tomato.proxy","com.tomato.service","com.tomato.repository"})
public class ProjectConfig {
}
