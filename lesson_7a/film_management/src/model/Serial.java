package model;

import java.time.LocalDate;

public class Serial extends Film{
    private int episodes;
    private int averageTime;

    public Serial() {
    }

    public Serial(int id, String title, String category, String director, LocalDate date, int episodes, int averageTime) {
        super(id, title, category, director, date);
        this.episodes = episodes;
        this.averageTime = averageTime;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(int averageTime) {
        this.averageTime = averageTime;
    }

    @Override
    public String toString() {
        return "Serial{" +
                super.toString() + + '\'' +
                ", episodes=" + episodes +
                ", averageTime=" + averageTime +
                '}';
    }
}
