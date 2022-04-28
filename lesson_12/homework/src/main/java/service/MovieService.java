package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class MovieService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Movie> getListMovie(){
        Gson gson = new Gson();

        ArrayList<Movie> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");;
        }
        return list;
    }

    public void getAllMovies(ArrayList<Movie> list){
        for(Movie i : list){
            System.out.println(i);
        }
    }

    public void sortByTitle(ArrayList<Movie> list){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }
    public void sortByLength(ArrayList<Movie> list){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength() > o2.getLength() ? -1 : 1;
            }
        });
    }
    public void sortByView(ArrayList<Movie> list){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() > o2.getView() ? -1 : 1;
            }
        });
    }

    public void countByCategory(ArrayList<Movie> list){
        TreeMap<String, Integer> map = new TreeMap<>();
        for(Movie i : list){
            for (String s : i.getCategory())
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
        }
        System.out.println(map);
    }
}
