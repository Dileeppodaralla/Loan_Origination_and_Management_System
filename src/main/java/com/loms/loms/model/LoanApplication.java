package com.loms.loms.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applicationId;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private LoanType loanType;

    private BigDecimal amountRequested;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    // Constructors
    public LoanApplication() {}

    public LoanApplication(Customer customer, LoanType loanType, BigDecimal amountRequested, ApplicationStatus status) {
        this.customer = customer;
        this.loanType = loanType;
        this.amountRequested = amountRequested;
        this.status = status;
    }

    // Getters and Setters
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public BigDecimal getAmountRequested() {
        return amountRequested;
    }

    public void setAmountRequested(BigDecimal amountRequested) {
        this.amountRequested = amountRequested;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    // Optional: toString method
    @Override
    public String toString() {
        return "LoanApplication{" +
                "applicationId=" + applicationId +
                ", customer=" + customer +
                ", loanType=" + loanType +
                ", amountRequested=" + amountRequested +
                ", status=" + status +
                '}';
    }
}
