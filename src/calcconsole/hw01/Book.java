package calcconsole.hw01;

public class Book implements Cloneable {
    String name;
    String autor;
    int countPages;

    public Book(String name, String autor, int countPages) {
        this.name = name;
        this.autor = autor;
        this.countPages = countPages;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(this.name, this.autor, this.countPages);
    }

    @Override
    public String toString() {
        return "calcconsole.hw01.Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", countPages=" + countPages +
                '}';
    }

}
