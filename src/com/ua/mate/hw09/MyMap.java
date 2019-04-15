package com.ua.mate.hw09;


import java.util.*;

public class MyMap<T> implements Map<String, List<T>> {

    private Map<String,List<T>> myMap;

    public MyMap() {
        myMap = new HashMap<>();
    }

    @Override
    public int size() {
        return myMap.size();
    }

    @Override
    public boolean isEmpty() {
        return myMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return myMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return myMap.containsValue(value);
    }

    @Override
    public List<T> get(Object key) {
        List<T> defaultList = new ArrayList<>();
        return myMap.getOrDefault(key, defaultList);
    }

    @Override
    public List<T> put(String key, List<T> value) {
        return myMap.put(key,value);
    }

    @Override
    public List<T> remove(Object key) {
        return myMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends List<T>> m) {
        myMap.putAll(m);
    }

    @Override
    public void clear() {
        myMap.clear();
    }

    @Override
    public Set<String> keySet() {
        return myMap.keySet();
    }

    @Override
    public Collection<List<T>> values() {
        return myMap.values();
    }

    @Override
    public Set<Entry<String, List<T>>> entrySet() {
        return myMap.entrySet();
    }
}
