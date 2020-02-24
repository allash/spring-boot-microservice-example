package com.microhome.account.api;

import com.microhome.account.api.dto.request.DtoCreateAccountRequest;
import com.microhome.account.api.dto.response.DtoCreateAccountResponse;
import com.microhome.account.api.dto.response.DtoGetAccountResponse;

public interface AccountService {
    DtoGetAccountResponse getCurrentAccount();
    DtoCreateAccountResponse create(DtoCreateAccountRequest body);
}
