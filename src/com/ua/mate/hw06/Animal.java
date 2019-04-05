package com.ua.mate.hw06;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
            int lengthArray = objectInputStream.readInt();
            Animal[] animalResult = new Animal[lengthArray];
            for (int i = 0; i < lengthArray; i++) {
                animalResult[i] = (Animal) objectInputStream.readObject();
            }
            return animalResult;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
