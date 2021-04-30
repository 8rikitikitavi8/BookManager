package bookManager;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void showAction(BookManager bookManager) {
        String result;
        System.out.println("Вы находитесь в основном меню менеджера книг");
        System.out.println();
        System.out.println("Выберите нужное вам действие(напишите букву):");
        System.out.println("а) добавить новую книгу");
        System.out.println("б) посмотреть инфо по существующей.");
        System.out.println("в) посмотреть все книги");
        while (true) {
        result = scanner.nextLine();
            if (result.equalsIgnoreCase("а")) {
                newBook(bookManager);
                return;
            }
            if (result.equalsIgnoreCase("б")) {
                InfoBook(bookManager);
                return;
            }
            if (result.equalsIgnoreCase("в")) {
                bookManager.showAll();
                return;
            } else {
                System.out.println("Похоже вы ввели не верную букву. Нужно ввести либо а, либо б, либо в.");
            }
        }
    }

    public void newBook(BookManager bookManager) {
        System.out.println("Что бы добавить новую книгу введите её название");
        String bookname = scanner.nextLine();
        System.out.println("Введите имя автора");
        String authorname = scanner.nextLine();
        bookManager.addBook(bookname,authorname);
    }

    public void InfoBook(BookManager bookManager) {
        System.out.println("Введите номер интересующей вас книги");
        int id = scanner.nextInt();
        bookManager.showInfo(id);
        scanner.nextLine();
    }

    public boolean endOrContinue() {
        System.out.println("Если желаете закончить работу с менеджером книг нажмите цифру 0 или любую другую, если хотите продолжить");
        String s = scanner.nextLine();
        if (s.equalsIgnoreCase("0")) {
            System.out.println("Надеемся, что вы еще вернетесь");
            return true;
        }
        return false;
    }





}
