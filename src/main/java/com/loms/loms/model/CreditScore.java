package com.loms.loms.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class CreditScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scoreId;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    private int creditScore;

    private LocalDate evaluationDate;

    // Constructors
    public CreditScore() {}

    public CreditScore(Customer customer, int creditScore, LocalDate evaluationDate) {
        this.customer = customer;
        this.creditScore = creditScore;
        this.evaluationDate = evaluationDate;
    }

    // Getters and Setters
    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public LocalDate getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(LocalDate evaluationDate) {
        this.evaluationDate = evaluationDate;
    }
}
