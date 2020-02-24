package com.microhome.account.api;

import com.microhome.account.api.dto.request.DtoCreateAccountRequest;
import com.microhome.account.api.dto.response.DtoCreateAccountResponse;
import com.microhome.account.api.dto.response.DtoGetAccountResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AccountController {

    private Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @GetMapping("/current")
    public DtoGetAccountResponse getCurrentAccount() {
        return accountService.getCurrentAccount();
    }

    @PostMapping("/new")
    public DtoCreateAccountResponse create(@Valid @RequestBody DtoCreateAccountRequest body) {
        logger.info("CREATE ACCOUNT: " + body.getName());
        return accountService.create(body);
    }

    @GetMapping("/ping")
    public String ping() {
        return "PONG ACCOUNT";
    }
}
