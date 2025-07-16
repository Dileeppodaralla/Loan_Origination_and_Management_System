package com.loms.loms.repository;

import com.loms.loms.model.LoanDisbursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDisbursalRepository extends JpaRepository<LoanDisbursal, Integer> {
}
