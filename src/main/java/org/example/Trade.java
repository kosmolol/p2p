package org.example;

import jakarta.persistence.*;

import  java.util.UUID;


// Класс трейда
@Entity
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fromCurrency;
    private String toCurrency;
    private Double amount;
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
