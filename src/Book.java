public class Book extends Item{
    String author;
    int numberOfPages;
    String genre;

    public Book(String name, String ID, int price, String author, int numberOfPages, String genre) {
        super(name, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
}

