package homeWork6.work1;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {
    public static List<Book> catalogOfBooks = new ArrayList<>();
    public static void main(String[] args) {
        ControlCentreImpl controlCentre = new ControlCentreImpl();

        Book book1 = new Book(1,"Game of thrones",500,"JRR Martin");
        Book book2 = new Book(2,"Steel Rat",600,"Harry Harrison");
        Book book3 = new Book(3,"1984",300,"Oriel");
        Book book4 = new Book(4,"fight club",250,"Chuck Pallanik");
        catalogOfBooks.add(book1);
        catalogOfBooks.add(book2);
        catalogOfBooks.add(book3);
        catalogOfBooks.add(book4);
        System.out.println(controlCentre.getAllBooks());
       //controlCentre.getBookById(5);
       controlCentre.deleteBookById(5);
        System.out.println(controlCentre.getAllBooks());

    }
}
