package com.loms.loms.service;

import com.loms.loms.model.Repayment;
import com.loms.loms.repository.RepaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RepaymentService {

    @Autowired
    private RepaymentRepository repaymentRepository;

    public Repayment recordRepayment(Repayment repayment) {
        return repaymentRepository.save(repayment);
    }

    public List<Repayment> getRepaymentHistory(int loanId) {
        return repaymentRepository.findByLoan_DisbursalId(loanId);
    }

    public List<Repayment> handleOverdueAccounts() {
        LocalDate today = LocalDate.now();
        return repaymentRepository.findByDueDateBeforeAndPaymentDateIsNull(today);
    }
}
