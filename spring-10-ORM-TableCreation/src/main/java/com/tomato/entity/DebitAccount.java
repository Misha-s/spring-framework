package com.tomato.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.util.function.BiConsumer;
@Entity
public class DebitAccount extends Account {

    private BigDecimal overDraftFee;
}
