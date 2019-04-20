package com.ua.mate.hw12;

import com.ua.mate.hw04.MyList;

public class MyArrayList<T> implements MyList<T> {
    private Object[] myArray;
    private int size;
    private final int START_LENGTH = 10;

    public MyArrayList() {
        this.myArray = new Object[START_LENGTH];
        this.size = 0;
    }

    @Override
    public void add(T value) {
        if (size < myArray.length) {
            myArray[size++] = value;
            return;
        }
        resizeMyArray(size * 2);
        myArray[size++] = value;
    }

    @Override
    public void add(T value, int index) {
        isBadIndex(index);
        if (size < myArray.length) {
            copyToArray(value, index);
            return;
        }
        resizeMyArray(size * 2);
        copyToArray(value, index);
    }

    @Override
    public void addAll(MyList<T> myList) {
        Object[] newArray = new Object[size + myList.size()];
        System.arraycopy(myArray, 0, newArray, 0, size);
        for (int i = 0; i < myList.size(); i++) {
            newArray[i + size] = myList.get(i);
        }
        myArray = newArray;
        size += myList.size();
    }

    public void addAll(MyArrayList<T> myList) {
        int newLength = size + myList.size();
        Object[] newArray = new Object[newLength];
        System.arraycopy(myArray, 0, newArray, 0, size);
        System.arraycopy(myList.myArray, 0, newArray, size, myList.size());
        myArray = newArray;
        size = newLength;
    }

    @Override
    public T get(int index) {
        isBadIndex(index);
        return (T) myArray[index];
    }

    @Override
    public void set(T value, int index) {
        isBadIndex(index);
        myArray[index] = value;
    }

    @Override
    public T remove(int index) {
        isBadIndex(index);
        for (int i = index; i < size - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        size--;
        myArray[size] = null;
        return (T) myArray[index];
    }

    @Override
    public T remove(T item) {
        int index = 0;
        while (index < size) {
            if (item == (T) myArray[index++]) {
                break;
            }
        }
        if (index > size - 1) {
            throw new NullPointerException("Item not found");
        }
        --index;
        for (int i = index; i < size - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        size--;
        myArray[size] = null;
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0 ? false : true;
    }

    @Override
    public String toString() {
        if (myArray[0] != null) {
            StringBuilder result = new StringBuilder(myArray[0].toString());
            for (int i = 1; i < size; i++) {
                if (myArray[i] != null) {
                    result.append(", ").append(myArray[i]);
                }
            }
            return result.toString();
        }
        return "";
    }

    private void resizeMyArray(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(myArray, 0, newArray, 0, size);
        myArray = newArray;
    }

    private void isBadIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Bad index");
        }
    }

    private void copyToArray(T value, int index) {
        Object[] newArray = new Object[size + 1];
        System.arraycopy(myArray, index, newArray, index + 1, size - index);
        System.arraycopy(myArray, 0, newArray, 0, index + 1);
        newArray[index] = value;
        myArray = newArray;
        size++;
    }
}
