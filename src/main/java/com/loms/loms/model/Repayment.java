package com.loms.loms.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Repayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int repaymentId;

    @ManyToOne
    @JoinColumn(name = "loanId", nullable = false)
    private LoanDisbursal loan;

    private BigDecimal amountPaid;

    private LocalDate paymentDate;

    private LocalDate dueDate;

    // Constructors
    public Repayment() {}

    public Repayment(LoanDisbursal loan, BigDecimal amountPaid, LocalDate paymentDate, LocalDate dueDate) {
        this.loan = loan;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public int getRepaymentId() {
        return repaymentId;
    }

    public void setRepaymentId(int repaymentId) {
        this.repaymentId = repaymentId;
    }

    public LoanDisbursal getLoan() {
        return loan;
    }

    public void setLoan(LoanDisbursal loan) {
        this.loan = loan;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
