package service;

import model.Movie;
import model.Serial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {
    Scanner sc = new Scanner(System.in);

    public void createList(ArrayList<Movie> list){
        list.add(new Movie(1, "Batman and Robin", "Phim siêu anh hùng của DC",
                new String[]{"Siêu anh hùng", "Trinh thám"}, LocalDate.of(2022,6,17), 19653, 180));
        list.add(new Movie(2, "Spiderman 3", "Phim siêu anh hùng của Marvel",
                new String[]{"Siêu anh hùng", "Hành động"}, LocalDate.of(2021,6,29), 50630, 190));
        list.add(new Movie(3, "Lilo and Stitch movie 0", "Phim hoạt hình dành cho trẻ em",
                new String[]{"Hoạt hình", "Hài hước"}, LocalDate.of(2016,10,27), 75369, 150));
        list.add(new Movie(4, "Tom and Jerry movie 2", "Phim hoạt hình dành cho trẻ em",
                new String[]{"Hoạt hình", "Hài hước", "Hành động"}, LocalDate.of(2009,12,9), 521369, 180));
        list.add(new Movie(5, "Dr.Strange", "Phim Marvel",
                new String[]{"Giải trí", "Hài hước", "Hành động"}, LocalDate.of(22,5,4), 175369, 180));
        list.add(new Movie(6, "One Piece gold", "Phim hoạt hình dành cho trẻ em",
                new String[]{"Hoạt hình", "Hành động"}, LocalDate.of(2022,2,9), 21369, 90));
    }

    public void getListMovie(ArrayList<Movie> list){
        list.forEach(i -> System.out.println(i));
    }

    public ArrayList<Movie> getByName(ArrayList<Movie> list, String name){
        ArrayList<Movie> arrList = new ArrayList<>();
        list.stream().filter(i -> i.getName().contains(name)).forEach(i-> arrList.add(i));
        return arrList;
    }

    public ArrayList<Movie> getByCategory(ArrayList<Movie> list, String cate){
        ArrayList<Movie> arrList = new ArrayList<>();
        list.forEach(i -> {
            for(String a : i.getCategory()){
                if(a.contains(cate)){
                    arrList.add(i);
                    break;
                }
            }
        });

        return arrList;
    }

    public void getMaxViews(ArrayList<Movie> list){
        list.stream().sorted((m1,m2) -> {
            return m1.getViews() > m2.getViews() ? -1 : 1;
        }).limit(3).forEach(i-> System.out.println(i));
    }

    public void getByYear(ArrayList<Movie> list){
        list.stream().filter(i -> i.getPremiereDate().getYear() == LocalDate.now().getYear()).forEach(i -> System.out.println(i));
    }

    public ArrayList<Movie> getByCategory2(ArrayList<Movie> list, String[]cate ){
        ArrayList<Movie> arrList = new ArrayList<>();
        list.forEach(i -> {
            boolean flag = false;
            for(String j : cate){
                for(String k : i.getCategory()){
                    if(j.equals(k)){
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if(flag == false){
                    break;
                }
            }
            if(flag == true){
                arrList.add(i);
            }
        });
        return arrList;
    }
}
