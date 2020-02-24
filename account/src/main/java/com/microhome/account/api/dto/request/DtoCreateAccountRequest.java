package com.microhome.account.api.dto.request;

public class DtoCreateAccountRequest {
    private String name;

    public DtoCreateAccountRequest() {
    }

    public DtoCreateAccountRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
