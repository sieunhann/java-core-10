package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Movie {
    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("category")
    private String[] category;

    @SerializedName("director")
    private String director;

    @SerializedName("length")
    private int length;

    @SerializedName("release")
    private String release;

    @SerializedName("view")
    private long view;

    @Override
    public String toString() {
        return id +
                " - " + title +
                " - " + Arrays.toString(category) +
                " - " + director +
                " - " + length +
                " - " + release +
                " - " + view;
    }

}
