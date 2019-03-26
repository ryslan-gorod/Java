package com.ua.mate.hw01;

import java.util.Arrays;

public class Person implements Cloneable {
    private String firstName;
    private String lastName;
    int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    Book[] books;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, Book[] books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + age * 7;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.firstName == ((Person) obj).firstName) &&
                (this.lastName == ((Person) obj).lastName) &&
                (this.age == ((Person) obj).age);
    }

    public boolean equals(Object o1, Object o2) {
        return o1.hashCode() == o2.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmpPerson = (Person) super.clone();
        tmpPerson.books = new Book[this.books.length];
        for (int i = 0; i < this.books.length; i++) {
            tmpPerson.books[i] = (Book) this.books[i].clone();
        }
        return tmpPerson;
    }
}
