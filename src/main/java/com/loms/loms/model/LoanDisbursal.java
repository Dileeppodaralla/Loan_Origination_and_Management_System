package com.loms.loms.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class LoanDisbursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int disbursalId;

    @OneToOne
    @JoinColumn(name = "applicationId", nullable = false)
    private LoanApplication application;

    private BigDecimal disbursalAmount;

    private LocalDate disbursalDate;

    private String approvedBy;

    // Constructors
    public LoanDisbursal() {}

    public LoanDisbursal(LoanApplication application, BigDecimal disbursalAmount, LocalDate disbursalDate, String approvedBy) {
        this.application = application;
        this.disbursalAmount = disbursalAmount;
        this.disbursalDate = disbursalDate;
        this.approvedBy = approvedBy;
    }

    // Getters and Setters
    public int getDisbursalId() {
        return disbursalId;
    }

    public void setDisbursalId(int disbursalId) {
        this.disbursalId = disbursalId;
    }

    public LoanApplication getApplication() {
        return application;
    }

    public void setApplication(LoanApplication application) {
        this.application = application;
    }

    public BigDecimal getDisbursalAmount() {
        return disbursalAmount;
    }

    public void setDisbursalAmount(BigDecimal disbursalAmount) {
        this.disbursalAmount = disbursalAmount;
    }

    public LocalDate getDisbursalDate() {
        return disbursalDate;
    }

    public void setDisbursalDate(LocalDate disbursalDate) {
        this.disbursalDate = disbursalDate;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
}
