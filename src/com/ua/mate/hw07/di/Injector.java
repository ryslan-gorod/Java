package com.ua.mate.hw07.di;

import com.ua.mate.hw07.dao.*;
import com.ua.mate.hw07.factory.DaoFactory;
import com.ua.mate.hw07.handler.ConsoleHandler;

import java.io.IOException;
import java.lang.reflect.Field;

public class Injector<T> {

    public void injectDependency(T obj, String property) throws IllegalAccessException, IOException {
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileDaoClass = FileDao.class;
        Class inMemoryDaoClass = InMemoryDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                boolean fileDao = fileDaoClass.isAnnotationPresent(Component.class);
                if (fileDao) {
                    System.out.println("File handling allowed");
                }
                boolean inMemoryDao = inMemoryDaoClass.isAnnotationPresent(Component.class);
                if (inMemoryDao) {
                    System.out.println("Work with RAM is allowed");
                }
                Dao clientDao = new DaoFactory().getDao(property);
                field.set(null, clientDao);
            }
        }
    }
}
