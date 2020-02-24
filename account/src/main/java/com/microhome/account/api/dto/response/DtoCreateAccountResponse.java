package com.microhome.account.api.dto.response;

import java.util.UUID;

public class DtoCreateAccountResponse {
    private UUID id;

    public DtoCreateAccountResponse(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
