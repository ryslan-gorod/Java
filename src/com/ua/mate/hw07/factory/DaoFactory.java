package com.ua.mate.hw07.factory;

import com.ua.mate.hw07.dao.Dao;
import com.ua.mate.hw07.dao.FileDao;
import com.ua.mate.hw07.dao.InMemoryDao;
import com.ua.mate.hw07.service.PropertyLoader;

import java.io.IOException;

public class DaoFactory<T> {

    private final Dao<T> inMemoryDao = new InMemoryDao<>();
    private final Dao<T> fileDao = new FileDao<>();

    public Dao<T> getDao(String property) throws IOException {
        String dbName = PropertyLoader.getProperty(property);
        if (dbName.equals("memory")) {
            return inMemoryDao;
        } else {
            return fileDao;
        }
    }
}
