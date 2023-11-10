package com.tomatos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "regions")
public class Region extends BaseEntity{

    @OneToOne(mappedBy = "regions")
    private Employees employees;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }

    private String region;
    private String country;

}
