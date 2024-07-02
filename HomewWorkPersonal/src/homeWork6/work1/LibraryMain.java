package homeWork6.work1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryMain {
    public static List<Book> catalogOfBooks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControlCentreImpl controlCentre = new ControlCentreImpl();

        Book book1 = new Book(1, "Game of thrones", 500, "JRR Martin");
        Book book2 = new Book(2, "Steel Rat", 600, "Harry Harrison");
        Book book3 = new Book(3, "1984", 300, "Oriel");
        Book book4 = new Book(4, "fight club", 250, "Chuck Pallanik");
        catalogOfBooks.add(book1);
        catalogOfBooks.add(book2);
        catalogOfBooks.add(book3);
        catalogOfBooks.add(book4);

        boolean exit = false;

        while (!exit) {
            System.out.println("");
            System.out.println("welcome to our Book store");
            System.out.println("please choice the option by number");
            System.out.println();
            System.out.println("1. list all books in library");
            System.out.println("2. get book by id");
            System.out.println("3. get books by author");
            System.out.println("4. get books by price");
            System.out.println("5. get book by name");
            System.out.println("6. add new book to the store");
            System.out.println("7. delete book by id");
            System.out.println("8. exit from store");
            System.out.println("");

            int switchOption = sc.nextInt();
            switch (switchOption) {

                case 1:
                    controlCentre.getAllBooks();
                    break;

                case 2:
                    System.out.println("please enter the id");
                    int idOfBook = sc.nextInt();
                    controlCentre.getBookById(idOfBook);
                    break;

                case 3:
                    System.out.println("please enter the author for search");
                    String authorForSearch = sc.nextLine();
                    controlCentre.getBookByAuthor(authorForSearch);
                    break;

                case 4:
                    System.out.println("please enter the price for search");
                    int priceForSearch = sc.nextInt();
                    controlCentre.getBookByPrice(priceForSearch);
                    break;

                case 5:
                    System.out.println("please enter the name of the book for search");
                    String nameForSearch = sc.nextLine();
                    controlCentre.getBookByName(nameForSearch);
                    break;

                case 6:
                    System.out.println("please enter the id of new book");
                    int newId = sc.nextInt();
                    System.out.println("please enter the name of new book");
                    String newName = sc.nextLine();
                    System.out.println("please enter the Author of new book");
                    String newAuthor = sc.nextLine();
                    System.out.println("please enter the price of new book");
                    int newPrice = sc.nextInt();
                    controlCentre.createNewBook(new Book(newId, newName, newPrice, newAuthor));
                    System.out.println("the book was created");
                    break;

                case 7:
                    System.out.println("please enter the id of book for delete");
                    int idOfBookForDelete = sc.nextInt();
                    controlCentre.deleteBookById(idOfBookForDelete);
                    break;

                case 8:
                    System.out.println("bye bye");
                    System.out.println("thank you for coming");
                    exit = true;
                default:
                    System.out.println("incorrect input, try again");
            }
        }

    }
}
