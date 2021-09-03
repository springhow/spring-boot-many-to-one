package com.springhow.examples.jpa.services;

import com.springhow.examples.jpa.domain.entities.Account;
import com.springhow.examples.jpa.domain.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){

        this.accountRepository = accountRepository;
    }
    public Account getAccount(String accountNumber){
        return  accountRepository.findAccount(accountNumber);
    }

    public List<Account> getAccounts(String branchCode){
      return  accountRepository.findAccountsByBranchCode(branchCode);
    }
}
