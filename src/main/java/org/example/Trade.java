package org.example;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import  java.util.UUID;


// Класс трейда
@Entity
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "fromCurrency is required")
   private String fromCurrency;

    @NotNull(message = "toCurrency is required")
    private String toCurrency;

    @NotNull(message = "amount is required")
    private Double amount;

    @NotNull(message = "rate is required")
    private Double rate;


    private String uid; // Поле uid

    @PrePersist
    public void generateUid() {
        this.uid = UUID.randomUUID().toString(); // Генерация уникального идентификатора
    }

    // Getters and Setters
    // Геттер для id
    public Long getId() {
        return id;
    }

    // Сеттер для id
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для fromCurrency
    public String getFromCurrency() {
        return fromCurrency;
    }

    // Сеттер для fromCurrency
    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    // Геттер для toCurrency
    public String getToCurrency() {
        return toCurrency;
    }

    // Сеттер для toCurrency
    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    // Геттер для amount
    public Double getAmount() {
        return amount;
    }

    // Сеттер для amount
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    // Геттер для rate
    public Double getRate() {
        return rate;
    }

    // Сеттер для rate
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


}
