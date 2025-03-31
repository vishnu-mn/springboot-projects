package com.example.bankapp.bankapplication.repository;

import com.example.bankapp.bankapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}