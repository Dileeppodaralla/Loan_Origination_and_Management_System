package com.loms.loms.controller;

import com.loms.loms.model.Repayment;
import com.loms.loms.service.RepaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repayments")
public class RepaymentController {

    @Autowired
    private RepaymentService repaymentService;

    @PostMapping("/record")
    public Repayment recordRepayment(@RequestBody Repayment repayment) {
        return repaymentService.recordRepayment(repayment);
    }

    @GetMapping("/history/{loanId}")
    public List<Repayment> getRepaymentHistory(@PathVariable int loanId) {
        return repaymentService.getRepaymentHistory(loanId);
    }

    @GetMapping("/overdue")
    public List<Repayment> handleOverdueAccounts() {
        return repaymentService.handleOverdueAccounts();
    }
}
