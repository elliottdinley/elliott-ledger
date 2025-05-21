package com.elliott.elliottledger.repository;

import com.elliott.elliottledger.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
