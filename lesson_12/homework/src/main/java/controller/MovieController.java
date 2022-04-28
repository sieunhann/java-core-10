package controller;

import model.Movie;
import service.MovieService;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieController {
    public static void admin(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Movie> list = new ArrayList<>();
        MovieService service = new MovieService();
        list = service.getListMovie();

        while (flag){
            mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    service.getAllMovies(list);
                    break;
                case 2:
                    service.sortByTitle(list);
                    service.getAllMovies(list);
                    break;
                case 3:
                    service.sortByLength(list);
                    service.getAllMovies(list);
                    break;
                case 4:
                    service.sortByView(list);
                    service.getAllMovies(list);
                    break;
                case 5:
                    service.countByCategory(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
            }
        }
    }
    public static void mainMenu(){
        System.out.println("============ Menu ============");
        System.out.println("1. Get all movies");
        System.out.println("2. Sort by title");
        System.out.println("3. Sort by length");
        System.out.println("4. Sort by view");
        System.out.println("5. Count by category");
        System.out.println("0. Exit");
        System.out.println("Please select [0 - 5]");
    }
}
