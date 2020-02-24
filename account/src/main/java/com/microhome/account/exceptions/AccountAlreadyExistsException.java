package com.microhome.account.exceptions;

public class AccountAlreadyExistsException extends AlreadyExistsException {

    public AccountAlreadyExistsException(String message) {
        super("account_already_exists: " + message);
    }
}
