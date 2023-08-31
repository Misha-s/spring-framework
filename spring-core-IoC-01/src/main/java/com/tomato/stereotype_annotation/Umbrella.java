package com.tomato.stereotype_annotation;

import org.springframework.stereotype.Component;

@Component
public class Umbrella {

    public void bindUmbrellaPolicy(){
        System.out.println("Umbrella policy bound");
    }
}
