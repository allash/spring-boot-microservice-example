package com.microhome.account.exceptions;

public abstract class AlreadyExistsException extends RuntimeException {

    private DtoError error;

    public AlreadyExistsException(String message) {
        this.error = new DtoError(message);
    }

    public DtoError getError() {
        return error;
    }
}
