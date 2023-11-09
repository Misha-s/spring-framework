package com.tomato.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private final String value;
}
