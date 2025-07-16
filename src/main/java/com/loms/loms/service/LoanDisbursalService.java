package com.loms.loms.service;

import com.loms.loms.model.LoanDisbursal;
import com.loms.loms.model.LoanApplication;
import com.loms.loms.repository.LoanDisbursalRepository;
import com.loms.loms.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class LoanDisbursalService {

    @Autowired
    private LoanDisbursalRepository loanDisbursalRepository;

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    public LoanDisbursal approveLoan(int applicationId, String approvedBy) {
        Optional<LoanApplication> applicationOpt = loanApplicationRepository.findById(applicationId);
        if (applicationOpt.isEmpty()) return null;

        LoanApplication application = applicationOpt.get();
        LoanDisbursal disbursal = new LoanDisbursal(application, application.getAmountRequested(), LocalDate.now(), approvedBy);
        return loanDisbursalRepository.save(disbursal);
    }

    public LoanDisbursal getDisbursalDetails(int disbursalId) {
        return loanDisbursalRepository.findById(disbursalId).orElse(null);
    }
}
