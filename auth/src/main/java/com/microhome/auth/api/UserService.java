package com.microhome.auth.api;

import com.microhome.auth.api.dto.request.DtoCreateUserRequest;

interface UserService {
    void create(DtoCreateUserRequest body);
}
