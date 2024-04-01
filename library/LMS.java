package library;

import library.Book;

import java.util.ArrayList;
import java.util.List;

public class LMS {

    List<Book> storage = new ArrayList<>();

    public void addBook(Book book) {
        storage.add(book);
        System.out.println("The book was added");
    }

    public boolean removeBook(Book book) {
        boolean removed = false;

        for (int i = 0; i < storage.size(); i++) {
            Book b = storage.get(i);
          if (book.getTitle().equals(b.getTitle()) && book.getAuthor().equals(b.getAuthor())) {
            storage.remove(i);
            removed = true;
            break;
          }
        }

        if (removed) {
            System.out.println("The book was removed");
        } else {
            System.out.println("The book was not removed");
        }

        return removed;
    }

    public void printBooks() {
        for (Book b: storage) {
            System.out.println("Title: " + b.getTitle() + "; Author: " + b.getAuthor() + "; " );
        }
    }
}
