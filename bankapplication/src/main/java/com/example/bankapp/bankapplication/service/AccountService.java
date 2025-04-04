package com.example.bankapp.bankapplication.service;

import com.example.bankapp.bankapplication.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
}
