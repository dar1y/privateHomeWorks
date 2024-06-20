package homeWork6.work1;

import java.util.List;

public interface ControlCentre {
    void getBookById(int id);
    void getAllBooks();
    void getBookByAuthor(String author);
    void getBookByPrice(int price);
    void getBookByName(String name);
    void createNewBook(Book book);
    void deleteBookById(int id);
    }

