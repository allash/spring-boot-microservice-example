package com.microhome.account.exceptions;

public class DtoError {
    private String message;

    public DtoError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
