package LibraryWork;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List <Book> books = new ArrayList<>();

    public Library() {
    }

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Добавьте книгу: " + book);
    }
    public void removeBook(Book book){
        books.remove(book);
        System.out.println("Удалена книга: "+ book);
    }
    public void bookIN(){
        System.out.println("Книга в " + name + ": ");
        for (Book book : books){
            System.out.println(book);
        }
    }

}
