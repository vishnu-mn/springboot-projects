package com.example.bankapp.bankapplication.service;

import com.example.bankapp.bankapplication.dto.AccountDto;

import java.math.BigDecimal;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double amount);
}
