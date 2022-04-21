package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
@Setter
public class Book {

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("category")
    private String[] category;

    @SerializedName("author")
    private String author;

    @SerializedName("page_number")
    private int page_number;

    @SerializedName("release_year")
    private int release_year;

    @Override
    public String toString() {
        return  "id = " + id +
                ", title = " + title +
                ", category = " + Arrays.toString(category) +
                ", author = " + author +
                ", page_number = " + page_number +
                ", release_year = " + release_year ;
    }
}
