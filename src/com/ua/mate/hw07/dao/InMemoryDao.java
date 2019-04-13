package com.ua.mate.hw07.dao;

import com.ua.mate.hw07.di.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryDao<T> implements Dao<T> {

    private final List<T> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(T obj) {
        inMemoryStorage.add(obj);
    }

    @Override
    public T get(String name,T obj) {
        return inMemoryStorage.get(0);
    }
}
