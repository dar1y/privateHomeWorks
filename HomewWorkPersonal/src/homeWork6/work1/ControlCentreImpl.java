package homeWork6.work1;

import java.util.ArrayList;
import java.util.List;

import static homeWork6.work1.LibraryMain.catalogOfBooks;

public class ControlCentreImpl implements ControlCentre{
    @Override
    public void getBookById(int id)  {
        {
            Book targetBook = new Book();
            for (Book b : catalogOfBooks) {
                if (b.getId() == id) {
                    targetBook = b;
                }
            }
            if (targetBook.getAuthor()!=null) {
                System.out.println(targetBook);
            } else {
                System.out.println("no such book");
            }
        }
    }

    @Override
    public void getAllBooks() {
        for(Book b: catalogOfBooks){
            System.out.println(b);
        }
        }


    @Override
    public void getBookByAuthor(String author) {
        {
            List<Book> listByAuthor = new ArrayList<>();

            for (Book b : catalogOfBooks) {
                if (b.getAuthor() == author) {
                     listByAuthor.add(b);
                }
            }
            if (listByAuthor.isEmpty()) {
                System.out.println("no books of this author :" + author);
            } else {
                for(Book b: listByAuthor){
                    System.out.println(b);
                }
            }
        }
    }

    @Override
    public void getBookByPrice(int price) {
        {
            List<Book> listByPrice = new ArrayList<>();

            for (Book b : catalogOfBooks) {
                if (b.getPrice() == price) {
                    listByPrice.add(b);
                }
            }
            if (listByPrice.isEmpty()) {
                System.out.println("no books of this price :" + price);
            } else {
                for(Book b: listByPrice){
                    System.out.println(b);
                }
            }
        }
    }

    @Override
    public void getBookByName(String name) {
        {
            List<Book> listByName = new ArrayList<>();

            for (Book b : catalogOfBooks) {
                if (b.getName() == name) {
                    listByName.add(b);
                }
            }
            if (listByName.isEmpty()) {
                System.out.println("no books of this price :" + name);
            } else {
                for(Book b: listByName){
                    System.out.println(b);
                }
            }
        }
    }

    @Override
    public void createNewBook(Book book) {
        Book createdBook = new Book();
        createdBook.setId(book.getId());
        createdBook.setName(book.getName());
        createdBook.setAuthor(book.getAuthor());
        createdBook.setPrice(book.getPrice());
        catalogOfBooks.add(createdBook);
    }

    @Override
    public void deleteBookById(int id) {
        boolean deleted=false;
        for(int i=0; i<catalogOfBooks.size();i++){
            if(catalogOfBooks.get(i).getId()==id){
                System.out.println("the book has been removed");
                catalogOfBooks.remove(i);
                deleted=true;
            }
        }
        if(!deleted){
            System.out.println("no such book");
        }
    }
}
