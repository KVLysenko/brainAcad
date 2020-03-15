package Labs.Lab7;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private final String publisher = "Trojanda";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
    public void goTo(int page){
        System.out.println("Вы перешли на " + page + " страницу");
    }

    public void goTo(String chapter){
        System.out.println("Вы перешли в главу: " + chapter);
    }
}

