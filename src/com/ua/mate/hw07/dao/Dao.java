package com.ua.mate.hw07.dao;

import com.ua.mate.hw07.model.Client;

import java.util.List;

public interface Dao<T> {
    void save(T obj);
    T get(String name, T obj);
}
