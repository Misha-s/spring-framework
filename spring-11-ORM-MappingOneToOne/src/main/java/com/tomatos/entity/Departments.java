package com.tomatos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "departments")
public class Departments extends BaseEntity {

    @OneToOne(mappedBy = "departments")
    private Employees employees;
    private String department;
    private String division;
    public Departments(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
