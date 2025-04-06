package com.example.bankapp.bankapplication.service;

import com.example.bankapp.bankapplication.dto.AccountDto;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double amount);
    AccountDto withdraw(Long id, double amount);
    List<AccountDto> getAllAccounts();
}
