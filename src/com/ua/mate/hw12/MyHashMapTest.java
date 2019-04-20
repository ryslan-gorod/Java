package com.ua.mate.hw12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {
    MyHashMap<String, Integer> stringIntegerMyHashMap = new MyHashMap<>();

    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < 3; i++) {
            stringIntegerMyHashMap.put("One", 1);
            stringIntegerMyHashMap.put("Two", 2);
            stringIntegerMyHashMap.put("Three", 3);
            stringIntegerMyHashMap.put("Four", 4);
            stringIntegerMyHashMap.put("Five", 5);
        }
    }
    @Test
    public void put() throws ValueNotFoundException {
        stringIntegerMyHashMap.put("Six", 6);
        assertEquals(java.util.Optional.of(6),java.util.Optional.of(stringIntegerMyHashMap.get("Six")));
    }

    @Test(expected = ValueNotFoundException.class)
    public void remove() throws ValueNotFoundException {
        stringIntegerMyHashMap.remove("Three");
        assertEquals("Value not found",stringIntegerMyHashMap.get("Three"));
    }

    @Test
    public void clear() {
        stringIntegerMyHashMap.clear();
        assertEquals(0,stringIntegerMyHashMap.size());
        assertEquals("",stringIntegerMyHashMap.toString());
    }

    @Test
    public void size() {
        assertEquals(5,stringIntegerMyHashMap.size());
    }

    @Test
    public void get() throws ValueNotFoundException {
        assertEquals(java.util.Optional.of(2),java.util.Optional.of(stringIntegerMyHashMap.get("Two")));
    }

    @Test
    public void toStringTest() {
        String tmpString = "Node{key=Three, value=3}Node{key=Five, value=5}Node{key=One, value=1}Node{key=Two, value=2}Node{key=Four, value=4}";
        assertEquals(tmpString,stringIntegerMyHashMap.toString());
    }
}