package com.tomato.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerAddress;
    private String customerEmail;
    private String customerName;
    private String customerSurName;
    private String customerUserName;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Payment> paymentList;

    public Customer(String customerAddress, String customerEmail, String customerName, String customerSurName, String customerUserName) {
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerSurName = customerSurName;
        this.customerUserName = customerUserName;
    }


}
