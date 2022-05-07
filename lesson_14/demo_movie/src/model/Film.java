package model;

import java.text.Normalizer;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Film {
    private int id;
    private String name;
    private String slug;
    private String description;
    private String[] category;
    private LocalDate premiereDate;
    private long views;

    public Film() {
    }

    public Film(int id, String name, String description, String[] category, LocalDate premiereDate, long views) {
        this.id = id;
        this.name = name;
        this.slug = covertToSlug(name);
        this.description = description;
        this.category = category;
        this.premiereDate = premiereDate;
        this.views = views;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(LocalDate premiereDate) {
        this.premiereDate = premiereDate;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                ", name: " + name +
                ", slug: " + slug +
                ", description: " + description +
                ", category: " + Arrays.toString(category) +
                ", premiereDate: " + premiereDate +
                ", views: " + views;
    }

    public static String covertToSlug(String value) {
        try {
            String temp = Normalizer.normalize(value, Normalizer.Form.NFD);
            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            return pattern.matcher(temp).replaceAll("").toLowerCase().replaceAll(" ", "-").replaceAll("đ", "d");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
