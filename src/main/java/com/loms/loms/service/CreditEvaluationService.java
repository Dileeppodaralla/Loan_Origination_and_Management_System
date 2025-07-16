package com.loms.loms.service;

import com.loms.loms.model.CreditScore;
import com.loms.loms.model.Customer;
import com.loms.loms.repository.CreditScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

@Service
public class CreditEvaluationService {

    @Autowired
    private CreditScoreRepository creditScoreRepository;

    public CreditScore evaluateCreditScore(Customer customer) {
        // Simulate credit score calculation
        int score = new Random().nextInt(301) + 500; // Generates score between 500–800
        CreditScore creditScore = new CreditScore(customer, score, LocalDate.now());
        return creditScoreRepository.save(creditScore);
    }

    public CreditScore getCreditReport(int scoreId) {
        return creditScoreRepository.findById(scoreId).orElse(null);
    }
}
