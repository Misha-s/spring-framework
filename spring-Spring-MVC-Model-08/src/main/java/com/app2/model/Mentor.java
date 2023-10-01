package com.app2.model;

import com.app2.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    private String firsName;
    private String lastName;
    private int age;
    private Gender gender;

}
