package com.ua.mate.hw06;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AnimalTest extends TestCase {

    public void testDeserializeAnimalArray() throws IOException {

        Animal[] animal = {new Animal("Dog"), new Animal("Pig"), new Animal("Cat"),
                new Animal("Hourse"), new Animal("Wolf"), new Animal("Goat")};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(animal.length);
        for (int i = 0; i < animal.length; i++) {
            objectOutputStream.writeObject(animal[i]);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        Animal[] animalDeserialized = Animal.deserializeAnimalArray(byteArrayOutputStream.toByteArray());
        for (int i = 0 ;i>animal.length;i++){
            assertEquals(animal[i],animalDeserialized[i]);
        }
    }
}