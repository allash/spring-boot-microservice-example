package com.microhome.account.api;

import com.microhome.account.api.dto.request.DtoCreateAccountRequest;
import com.microhome.account.api.dto.response.DtoCreateAccountResponse;
import com.microhome.account.api.dto.response.DtoGetAccountResponse;
import com.microhome.account.client.AuthServiceClient;
import com.microhome.account.client.dto.request.DtoCreateUserRequest;
import com.microhome.account.db.repositories.AccountRepository;
import com.microhome.account.db.entities.DbAccount;
import com.microhome.account.exceptions.AccountAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AuthServiceClient authServiceClient;

    @Override
    public DtoGetAccountResponse getCurrentAccount() {
        DbAccount account = accountRepository.getAccounts().get(0);
        if (account == null)
            throw new RuntimeException();

        return new DtoGetAccountResponse(account.getId(), account.getName(), account.getCreatedAt());
    }

    @Override
    public DtoCreateAccountResponse create(DtoCreateAccountRequest body) {

        DbAccount account = accountRepository.getByName(body.getName());
        if (account != null) {
            throw new AccountAlreadyExistsException(body.getName());
        }

        DtoCreateUserRequest request = new DtoCreateUserRequest();
        request.setName(body.getName());

        authServiceClient.createUser(request);

        DbAccount newAccount = new DbAccount(body.getName());
        newAccount.setTasks(new ArrayList<>());
        accountRepository.create(newAccount);

        return new DtoCreateAccountResponse(newAccount.getId());
    }
}
