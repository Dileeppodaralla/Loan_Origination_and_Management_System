package com.loms.loms.controller;

import com.loms.loms.model.LoanApplication;
import com.loms.loms.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/loan-applications")
public class LoanApplicationController {

    @Autowired
    private LoanApplicationService loanApplicationService;

    @PostMapping
    public LoanApplication submitApplication(@RequestBody LoanApplication application) {
        return loanApplicationService.submitApplication(application);
    }

    @GetMapping("/{id}/status")
    public Optional<LoanApplication> getApplicationStatus(@PathVariable int id) {
        return loanApplicationService.getApplicationStatus(id);
    }

    @PostMapping("/{id}/upload-documents")
    public LoanApplication uploadDocuments(@PathVariable int id) {
        return loanApplicationService.uploadDocuments(id);
    }
}
