class book_details {
    String title;
    String author;
    
    book_details() {
        this.title = "";
        this.author = "";
    }

    void setTitle(String title) {
        this.title = title;
    }
    
    String getTitle() {
        return this.title;
    }
    
    void setAuthor(String author) {
        this.author = author;
    }
    
    String getAuthor() {
        return this.author;
    }
}

public class Book {
    public static void main(String[] args) {
        book_details book = new book_details();
        book.setTitle("Data Structures");
        book.setAuthor("David Brown");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}