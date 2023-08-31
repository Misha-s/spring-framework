package com.tomato.stereotype_annotation;

import org.springframework.stereotype.Component;

@Component
public class Properties {
    public void bindPropertyPolicy(){
        System.out.println("Property policy bound");
    }
}
