package com.microhome.account.client;

import com.microhome.account.client.dto.request.DtoCreateUserRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceClientFallback implements AuthServiceClient {

    private Logger logger = LoggerFactory.getLogger(AuthServiceClientFallback.class);

    @Override
    public void createUser(DtoCreateUserRequest dto) {
        logger.error("Error during create user: " + dto.getName());
    }
}
