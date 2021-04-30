package bookManager;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> listBook = new ArrayList<>();

    public BookManager() {
        listBook.add(new Book("Поющие в терновнике", "Колин Маккалоу"));
        listBook.add(new Book("Одиночество в Сети", "Януш Вишневский"));
        listBook.add(new Book("Гордость и предубеждение", "Джейн Остен"));
        listBook.add(new Book("Парфюмер. История одного убийцы", "Патрик Зюскинд"));
        listBook.add(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        listBook.add(new Book("Похороните меня за плинтусом...", "Павел Санаев"));
        listBook.add(new Book("Граф Монте-Кристо", "Александр Дюма"));
        listBook.add(new Book("Крестный отец", "Марио Пьюзо"));
        listBook.add(new Book("Одиннадцать минут", "Пауло Коэльо"));
        listBook.add(new Book("Преступление и наказание", "Федор Достоевский"));
    }

    public void addBook(String name, String author) {
        listBook.add(new Book(name, author));
    }
    public void showInfo(int id) {
        for (Book book : listBook) {
            if (book.id == id) {
                System.out.println(book);
            }
        }
    }

    public void showAll() {
        for (Book book : listBook) {
            System.out.println(book.id + " " + book.name);
        }
    }
}
