package LibraryWork;

public class Service {
    private Library library;

    public Service() {
    }

    public Service(Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    public void addBook(String title, String author){
        Book book = new Book(title, author);
        library.addBook(book);
    }
    public void editsABook(String OldTitle, String NewTitle, String NewAuthor){
        for (Book book : library.getBooks()){
            if (book.getTitle().equals(OldTitle)){
                book.setTitle(NewTitle);
                book.setAuthor(NewAuthor);
                System.out.println("Измененная книга: " + book);
                return;
            }
        }
        System.out.println("Ошибка! Такой книги нет " + OldTitle);
    }
    public void bookIN(){
        if (library != null){
            library.bookIN();
        }else {
            System.out.println("Ошибка!");
        }
    }
    public void deleteBook(String title){
        Book bookToRemove = null;
        for (Book book : library.getBooks()){
            if (book.getTitle().equals(title)){
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null){
            library.removeBook(bookToRemove);
        }else {
            System.out.println("Ошибка! Такой книги нет" + " - " + title);
        }
    }
}
