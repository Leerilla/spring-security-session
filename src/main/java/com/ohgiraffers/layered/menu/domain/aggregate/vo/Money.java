package com.ohgiraffers.layered.menu.domain.aggregate.vo;

import com.ohgiraffers.layered.menu.domain.exception.MoneyNegativeException;

import java.util.Objects;

public class Money {

    private final int value;

    public Money(int value) {

        if(value < 0) {
            throw new MoneyNegativeException("돈은 음수일 수 없습니다.");
        }

        this.value = value;
    }

    public int getValue() {

        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
