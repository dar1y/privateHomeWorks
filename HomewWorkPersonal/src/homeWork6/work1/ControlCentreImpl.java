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
    public List<Book> getAllBooks() {
        return catalogOfBooks;
        }


    @Override
    public List<Book> getBookByAuthor(String author) {
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
                return listByAuthor;
            }
            return listByAuthor;
        }
    }

    @Override
    public List<Book> getBookByPrice(int price) {
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
                return listByPrice;
            }
            return listByPrice;
        }
    }

    @Override
    public List<Book> getBookByName(String name) {
        return null;
    }

    @Override
    public Book createNewBook(Book book) {
        return null;
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
