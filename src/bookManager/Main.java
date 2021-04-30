package bookManager;

public class Main {

    public static void main(String[] args) {
    Menu menu = new Menu();
    BookManager bookManager = new BookManager();
        do {
            menu.showAction(bookManager);
        } while (!menu.endOrContinue());

    }
}
