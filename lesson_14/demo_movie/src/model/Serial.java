package model;

import java.time.LocalDate;

public class Serial extends Film{
    private int episodes;
    private EnumStatus status;

    public Serial(int id, String name, String description, String[] category, LocalDate premiereDate, long views, int episodes, EnumStatus status) {
        super(id, name, description, category, premiereDate, views);
        this.episodes = episodes;
        this.status = status;
    }

    public Serial() {
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", episodes: " + episodes +
                ", status: " + status +
                " (Serial)";
    }
}
