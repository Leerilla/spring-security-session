package com.ohgiraffers.layered.menu.domain.exception;

public class MoneyNegativeException extends IllegalArgumentException {

    public MoneyNegativeException(String msg) {
        super(msg);
    }
}
