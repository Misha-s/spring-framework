package com.tomato;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
public class Java {
    //field injection
//    @Autowired
//OfficeHours officeHours;


    OfficeHours officeHours;
    //Constructor injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : "+ (20 + officeHours.getHours()));
    }
}
