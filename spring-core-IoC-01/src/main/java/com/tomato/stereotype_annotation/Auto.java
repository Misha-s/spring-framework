package com.tomato.stereotype_annotation;

import org.springframework.stereotype.Component;

@Component
public class Auto {

    public void bindAutoPolicy(){
        System.out.println("Auto policy bound");
    }
}
