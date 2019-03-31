package com.ua.mate.hw04;

import java.awt.*;

public class HomeWork04 {
    public static void main(String[] args) {
        // LinkedList

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println(myLinkedList.isEmpty());
        myLinkedList.add("zero");
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.add("insert 1", 1);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.isEmpty());
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);
        String remove = myLinkedList.remove(1);
        System.out.println("Remove  - " + remove);
        System.out.println(myLinkedList);
        myLinkedList.add("insert 1", 1);
        myLinkedList.add("insert 2", 2);
        System.out.println(myLinkedList);
        String remove2 = myLinkedList.remove("insert 2");
        System.out.println("Remove2  - " + remove2);
        System.out.println(myLinkedList);
        MyLinkedList<String> myLinkedList2 = new MyLinkedList<>();
        myLinkedList2.add("three");
        myLinkedList2.add("four");
        myLinkedList2.add("five");
        myLinkedList2.add("six");
        System.out.println(myLinkedList2);
        myLinkedList.addAll(myLinkedList2);
        System.out.println(myLinkedList);

        // ArrayList
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        System.out.println(stringMyArrayList);
        System.out.println(stringMyArrayList.isEmpty());
        stringMyArrayList.add("testZero");
        stringMyArrayList.add("testOne");
        stringMyArrayList.add("testTwo");
        stringMyArrayList.add("testThree");
        System.out.println(stringMyArrayList);
        System.out.println(stringMyArrayList.size());
        MyArrayList<String> stringMyArrayList2 = stringMyArrayList;
        stringMyArrayList.addAll(stringMyArrayList2);
        System.out.println(stringMyArrayList);
        System.out.println(stringMyArrayList.size());
        stringMyArrayList.addAll(stringMyArrayList2);
        System.out.println(stringMyArrayList);
        System.out.println(stringMyArrayList.size());
        stringMyArrayList.add("Insert", 0);
        System.out.println(stringMyArrayList);
        stringMyArrayList.add("Insert", 3);
        System.out.println(stringMyArrayList);
        stringMyArrayList.add("Insert", 25);
        System.out.println(stringMyArrayList);
        stringMyArrayList.addAll(myLinkedList);
        System.out.println(stringMyArrayList);
        System.out.println(stringMyArrayList.get(0));
        System.out.println(stringMyArrayList.get(18));
        stringMyArrayList.remove(1);
        System.out.println(stringMyArrayList);
        stringMyArrayList.remove("testThree");
        System.out.println(stringMyArrayList);
        stringMyArrayList.remove("test2 3");
        System.out.println(stringMyArrayList);
    }
}
