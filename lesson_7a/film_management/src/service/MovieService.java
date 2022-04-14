package service;

import model.Movie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MovieService {
    Scanner sc = new Scanner(System.in);

    public Movie addMovie(){
        Movie movie = new Movie();

        System.out.println("Nhập id: ");
        movie.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tiêu đề: ");
        movie.setTitle(sc.nextLine());
        System.out.println("Nhập thể loại: ");
        movie.setCategory(sc.nextLine());
        System.out.println("Nhập đạo diễn: ");
        movie.setDirector(sc.nextLine());
        System.out.println("Nhập ngày công chiếu(dd/MM/yyyy): ");
        String date = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);;
        movie.setDate(localDate);
        System.out.println("Nhập thời lượng phim: ");
        movie.setTime(sc.nextInt());
        sc.nextLine();

        return movie;
    }

    public void getAllMovie(Movie[] arrMovie){
        System.out.println("Movie: ");
        for(Movie i : arrMovie){
            System.out.println(i);
        }
    }

    public void getMovieByName(Movie[] arrMovie){
        System.out.println("Nhập tên phim cần tìm: ");
        String title = sc.nextLine();
        for(Movie i : arrMovie){
            if(i.getTitle().contains(title)){
                System.out.println(i);
            }
        }
    }

}
