package com.tomatos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments")
public class Departments extends BaseEntity {

    private String department;
    private String division;

}
