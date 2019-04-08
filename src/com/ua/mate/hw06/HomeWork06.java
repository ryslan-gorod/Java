package com.ua.mate.hw06;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class HomeWork06 {
    public static void main(String[] args) throws IOException {

        //Task 5.4 from Stepik
        Animal[] animal = {new Animal("Dog"), new Animal("Pig"), new Animal("Cat"),
                new Animal("Hourse"), new Animal("Wolf"), new Animal("Goat")};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        //objectOutputStream.writeInt(animal.length);
        objectOutputStream.writeInt(-65);
        //objectOutputStream.writeChar(65);
        for (int i = 0; i < animal.length; i++) {
            objectOutputStream.writeObject(animal[i]);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        Animal[] animalDeserialized = Animal.deserializeAnimalArray(byteArrayOutputStream.toByteArray());
        System.out.println(Arrays.toString(animalDeserialized));

        //Task 6.1 Generics from Stepik
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        //Task 6.2
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(5);
        integerSet1.add(3);
        integerSet1.add(9);
        integerSet1.add(1);
        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(0);
        integerSet2.add(4);
        integerSet2.add(7);
        integerSet2.add(1);
        integerSet2.add(5);
        Set<Integer> integerSetResult = symmetricDifference(integerSet1, integerSet2);
        System.out.println(Arrays.toString(integerSetResult.toArray()));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        SortedSet<T> result = new TreeSet<>();
        Set<T> tmpSet1 = new HashSet<>(set1);
        Set<T> tmpSet2 = new HashSet<>(set2);
        tmpSet1.removeAll(set2);
        result.addAll(tmpSet1);
        tmpSet2.removeAll(set1);
        result.addAll(tmpSet2);
        return result;
    }
}
