package com.ua.mate.hw12;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    MyArrayList<String> stringMyArrayList = new MyArrayList<>();

    @Before
    public void setUp() throws Exception {
        stringMyArrayList.add("One");
        stringMyArrayList.add("Two");
        stringMyArrayList.add("Three");
        stringMyArrayList.add("Four");
        stringMyArrayList.add("Five");
    }

    @org.junit.Test
    public void add() {
        assertEquals(5, stringMyArrayList.size());
        stringMyArrayList.add("Size");
        assertEquals(6, stringMyArrayList.size());
   }

    @org.junit.Test
    public void addAtIndex() {
        stringMyArrayList.add("Three new",3);
        assertEquals("Three new", stringMyArrayList.get(3));
    }

    @org.junit.Test
    public void addAll() {
        stringMyArrayList.addAll(stringMyArrayList);
    }

    @org.junit.Test
    public void addAllMyArrayList() {
        stringMyArrayList.addAll(stringMyArrayList);
        assertEquals("Three", stringMyArrayList.get(7));
    }

    @org.junit.Test
    public void get() {
        assertEquals("Three", stringMyArrayList.get(2));
    }

    @org.junit.Test
    public void set() {
        stringMyArrayList.set("Three new",3);
        assertEquals("Three new", stringMyArrayList.get(3));
    }

    @org.junit.Test
    public void remove() {
        stringMyArrayList.remove("Two");
        assertEquals("One", stringMyArrayList.get(0));
        assertEquals("Three", stringMyArrayList.get(1));
    }

    @org.junit.Test
    public void removeAtIndex() {
        stringMyArrayList.remove(1);
        assertEquals("One", stringMyArrayList.get(0));
        assertEquals("Three", stringMyArrayList.get(1));

    }

    @org.junit.Test
    public void size() {
        assertEquals(5, stringMyArrayList.size());
    }

    @org.junit.Test
    public void isEmpty() {
        assertTrue(!stringMyArrayList.isEmpty());
        assertFalse(stringMyArrayList.isEmpty());
    }

    @org.junit.Test
    public void toString1() {
        assertEquals("One, Two, Three, Four, Five",stringMyArrayList.toString());
    }
}