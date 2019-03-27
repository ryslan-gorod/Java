package com.ua.mate.hw01;

public class Book implements Cloneable {
    String name;
    String autor;
    int countPages;

    public Book(String name, String autor, int countPages) {
        this.name = name;
        this.autor = autor;
        this.countPages = countPages;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", countPages=" + countPages +
                '}';
    }

}
