package model;

import java.time.LocalDate;

public class Movie extends Film{
    private int time;

    public Movie(int id, String name, String description, String[] category, LocalDate premiereDate, long views, int time) {
        super(id, name, description, category, premiereDate, views);
        this.time = time;
    }

    public Movie() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", time: " + time +
                " (Movie)";
    }
}
