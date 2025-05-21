package com.elliott.elliottledger.repository;

import com.elliott.elliottledger.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
