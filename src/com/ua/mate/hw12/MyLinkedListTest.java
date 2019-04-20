package com.ua.mate.hw12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    private MyLinkedList<String> stringMyLinkedList = new MyLinkedList<>();

    @Before
    public void setUp() throws Exception {
        stringMyLinkedList.add("One");
        stringMyLinkedList.add("Two");
        stringMyLinkedList.add("Three");
        stringMyLinkedList.add("Four");
        stringMyLinkedList.add("Five");
    }

    @Test
    public void add() {
        assertEquals(5,stringMyLinkedList.size());
        stringMyLinkedList.add("Six");
        assertEquals(6,stringMyLinkedList.size());
    }

    @Test
    public void addAtIndex() {
        stringMyLinkedList.add("Three new",3);
        assertEquals("Three new",stringMyLinkedList.get(3));

    }

    @Test
    public void addAll() {
        stringMyLinkedList.addAll(stringMyLinkedList);
        assertEquals("Three",stringMyLinkedList.get(7));
    }

    @Test
    public void get() {
        assertEquals("Three",stringMyLinkedList.get(2));
    }

    @Test
    public void set() {
        stringMyLinkedList.set("Three new",3);
        assertEquals("Three new",stringMyLinkedList.get(3));
    }

    @Test
    public void remove() {
        stringMyLinkedList.remove("Two");
        assertEquals("One",stringMyLinkedList.get(0));
        assertEquals("Three",stringMyLinkedList.get(1));
    }

    @Test
    public void removeAtIndex() {
        stringMyLinkedList.remove(1);
        assertEquals("One",stringMyLinkedList.get(0));
        assertEquals("Three",stringMyLinkedList.get(1));
    }

    @Test
    public void size() {
        assertEquals(5,stringMyLinkedList.size());
    }

    @Test
    public void isEmpty() {
        assertTrue(!stringMyLinkedList.isEmpty());
        assertFalse(stringMyLinkedList.isEmpty());
    }

    @Test
    public void toStringTest() {
        assertEquals("One, Two, Three, Four, Five",stringMyLinkedList.toString());
    }
}