package com.loms.loms.controller;

import com.loms.loms.model.LoanDisbursal;
import com.loms.loms.service.LoanDisbursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loan-disbursal")
public class LoanDisbursalController {

    @Autowired
    private LoanDisbursalService loanDisbursalService;

    @PostMapping("/approve/{applicationId}")
    public LoanDisbursal approveLoan(@PathVariable int applicationId, @RequestParam String approvedBy) {
        return loanDisbursalService.approveLoan(applicationId, approvedBy);
    }

    @GetMapping("/{disbursalId}")
    public LoanDisbursal getDisbursalDetails(@PathVariable int disbursalId) {
        return loanDisbursalService.getDisbursalDetails(disbursalId);
    }
}
