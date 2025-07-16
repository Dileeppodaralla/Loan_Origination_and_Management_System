package com.loms.loms.controller;

import com.loms.loms.model.CreditScore;
import com.loms.loms.model.Customer;
import com.loms.loms.service.CreditEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/credit-evaluation")
public class CreditEvaluationController {

    @Autowired
    private CreditEvaluationService creditEvaluationService;

    @PostMapping("/evaluate")
    public CreditScore evaluateCreditScore(@RequestBody Customer customer) {
        return creditEvaluationService.evaluateCreditScore(customer);
    }

    @GetMapping("/report/{id}")
    public CreditScore getCreditReport(@PathVariable int id) {
        return creditEvaluationService.getCreditReport(id);
    }
}
