package homeWork6.work1;

import java.util.List;

public interface ControlCentre {
    void getBookById(int id);
    List<Book> getAllBooks();
    List<Book> getBookByAuthor(String author);
    List<Book> getBookByPrice(int price);
    List<Book> getBookByName(String name);
    Book createNewBook(Book book);
    void deleteBookById(int id);
    }

