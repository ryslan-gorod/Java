package com.ua.mate.hw04;

public interface MyList<T> {
    void add(T value);

    void add(T value, int index);

    void addAll(MyList<T> myList);

    T get(int index);

    void set(T value, int index);

    T remove(int index); // return deleted item

    T remove(T item); // the first item found

    int size();

    boolean isEmpty();
}
