package com.ua.mate.hw05;

import java.util.HashMap;
import java.util.Map;

public class HomeWork05 {
    public static void main(String[] args) {
        MyHashMap<String,String> stringMap = new MyHashMap<>();
        stringMap.put("one","first");
        stringMap.put("two","second");
        stringMap.put("three","three");
        stringMap.put("one","one1");
        System.out.println(stringMap);
        System.out.println(stringMap.size());
        stringMap.remove("one");
        System.out.println(stringMap);
        System.out.println(stringMap.size());
        stringMap.put("one","one");
        System.out.println(stringMap);
        System.out.println(stringMap.size());
        System.out.println(stringMap.get("two"));
        stringMap.clear();
        System.out.println(stringMap);
    }
}
