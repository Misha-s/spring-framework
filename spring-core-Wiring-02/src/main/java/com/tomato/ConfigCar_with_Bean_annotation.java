package com.tomato;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar_with_Bean_annotation {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Lexus");
        return c;
    }

    //Direct Wiring
//    @Bean()
//    Driver driver(){
//        Driver dr = new Driver();
//        dr.setName("Mike");
//        dr.setCar(car());
//        return dr;
//    }

    //Autowiring when we pass a bean as parameter
    @Bean()
    Driver driver(Car car){
        Driver dr = new Driver();
        dr.setName("Luke");
        dr.setCar(car);
        return dr;
    }
}
