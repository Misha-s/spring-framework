package com.tomato;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RaceApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar_with_Bean_annotation.class);
        Car car = container.getBean(Car.class);
        Driver driver = container.getBean(Driver.class);

        System.out.println("Driver's name: " + driver.getName());
        System.out.println("Car's make: " + car.getMake());
        System.out.println("Driver's car: " + driver.getCar().getMake());
    }
}
