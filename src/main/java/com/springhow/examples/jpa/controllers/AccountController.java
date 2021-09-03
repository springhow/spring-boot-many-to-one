package com.springhow.examples.jpa.controllers;

import com.springhow.examples.jpa.domain.entities.Account;
import com.springhow.examples.jpa.services.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {

        this.accountService = accountService;
    }

    @GetMapping(path = "/accounts/{accountNumber}")
    public Account getAccount(@PathVariable("accountNumber") String accountNumber) {
        return accountService.getAccount(accountNumber);
    }

    @GetMapping(path = "/accounts")
    public List<Account> getAccounts(@RequestParam("branchCode") String branchCode) {
        return accountService.getAccounts(branchCode);
    }
}
