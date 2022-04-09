package model;

public class Book {
    public int id;
    public String title;
    public String description;
    public String author;
    public String category;
    public int pageNumber;
    public int pulishingYear;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", pageNumber=" + pageNumber +
                ", pulishingYear=" + pulishingYear +
                '}';
    }
}
