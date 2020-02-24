package com.microhome.account.api.dto.response;

import java.time.Instant;
import java.util.UUID;

public class DtoGetAccountResponse {
    private UUID id;
    private String name;
    private Instant createdAt;

    public DtoGetAccountResponse() {
    }

    public DtoGetAccountResponse(UUID id, String name, Instant createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
