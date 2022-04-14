package model;

import java.time.LocalDate;

public class Film {
    private int id;
    private String title;
    private String category;
    private String director;
    private LocalDate date;

    public Film() {
    }

    public Film(int id, String title, String category, String director, LocalDate date) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", date=" + date;
    }
}
