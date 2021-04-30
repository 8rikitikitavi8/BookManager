package bookManager;

public class Book {
    static int counter = 0;
    int id;
    String name;
    String author;


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        counter++;
        id = counter;
    }



    @Override
    public String toString() {
        return "номер " + id + ": " + "название "+'\''
                + name + '\'' +
                " автор " + author;
    }
}
