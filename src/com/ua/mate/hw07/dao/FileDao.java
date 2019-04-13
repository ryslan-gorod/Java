package com.ua.mate.hw07.dao;

import com.ua.mate.hw07.di.Component;

import java.io.*;

@Component
public class FileDao<T> implements Dao<T> {

    public void save(T obj) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(getName(obj)))) {
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            System.out.println("Could not write to database");
        }
    }

    public T get(String name, T obj) {
        try (ObjectInputStream inputObjectStream = new ObjectInputStream(new FileInputStream(getName(obj)))) {
            return (T) inputObjectStream.readObject();
        } catch (Exception e) {
            System.out.println(name + " not found in the system");
            return null;
        }
    }

    private String getName(T obj) {
        if (obj.getClass().toString().equals("Human")) {
            return "storageHuman.dat";
        } else {
            return "storage.dat";
        }
    }
}
