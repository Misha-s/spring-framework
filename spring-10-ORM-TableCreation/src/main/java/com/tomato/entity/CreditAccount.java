package com.tomato.entity;

import jakarta.persistence.Entity;

import java.beans.BeanInfo;
import java.math.BigDecimal;
@Entity
public class CreditAccount extends Account{
    private BigDecimal creditLimit;
}
