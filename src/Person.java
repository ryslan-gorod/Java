import java.util.Arrays;

public class Person implements Cloneable {
    String firstName;
    String lastName;
    int age;

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
        return (this.firstName==((Person)obj).firstName) &&
                (this.lastName==((Person)obj).lastName) &&
                (this.age==((Person)obj).age);
    }

    public boolean equals(Object o1, Object o2) {
        return o1.hashCode() == o2.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmpPerson = new Person(this.firstName,this.lastName,this.age);
            tmpPerson.books = new Book[this.books.length];
            for(int i = 0; i < this.books.length; i++){
                tmpPerson.books[i] = (Book)this.books[i].clone();
            }
        return tmpPerson;
    }

}

