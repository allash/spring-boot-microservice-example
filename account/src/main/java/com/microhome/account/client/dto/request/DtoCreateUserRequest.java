package com.microhome.account.client.dto.request;

public class DtoCreateUserRequest {
    private String name;

    public DtoCreateUserRequest() {
    }

    public DtoCreateUserRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
