package dev.pomyharry.stocksimulator.back.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.pomyharry.stocksimulator.back.model.dto.AccountDTO;
import dev.pomyharry.stocksimulator.back.service.AccountService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/createaccount")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping()
    public void insertAccount(@RequestBody AccountDTO accountDTO) {
        accountService.insertAccount(accountDTO);
        System.out.println(accountDTO);
    }
    
}
