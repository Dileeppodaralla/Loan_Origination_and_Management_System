package com.loms.loms.repository;


import com.loms.loms.model.Repayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;


import java.util.List;

@Repository
public interface RepaymentRepository extends JpaRepository<Repayment, Integer> {
    List<Repayment> findByLoan_DisbursalId(int loanId);
    List<Repayment> findByDueDateBeforeAndPaymentDateIsNull(LocalDate date);
}
