package com.example.bankapp.bankapplication.service.impl;

import com.example.bankapp.bankapplication.dto.AccountDto;
import com.example.bankapp.bankapplication.entity.Account;
import com.example.bankapp.bankapplication.mapper.AccountMapper;
import com.example.bankapp.bankapplication.repository.AccountRepository;
import com.example.bankapp.bankapplication.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        return AccountMapper.mapToAccountDto(account);
    }
}
