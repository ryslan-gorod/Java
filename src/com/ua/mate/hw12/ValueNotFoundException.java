package com.ua.mate.hw12;

public class ValueNotFoundException extends Throwable {
    public ValueNotFoundException(String value_not_found) {
        System.out.println(value_not_found);
    }
}
