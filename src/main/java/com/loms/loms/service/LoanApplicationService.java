package com.loms.loms.service;

import com.loms.loms.model.LoanApplication;
import com.loms.loms.model.ApplicationStatus;
import com.loms.loms.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanApplicationService {

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    public LoanApplication submitApplication(LoanApplication application) {
        application.setStatus(ApplicationStatus.PENDING);
        return loanApplicationRepository.save(application);
    }

    public Optional<LoanApplication> getApplicationStatus(int applicationId) {
        return loanApplicationRepository.findById(applicationId);
    }

    public LoanApplication uploadDocuments(int applicationId) {
        // Placeholder for document upload logic
        return loanApplicationRepository.findById(applicationId).orElse(null);
    }
}
