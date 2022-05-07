package controller;

import model.Movie;
import model.Serial;
import service.MovieService;
import service.SerialService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static void admin(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        MovieService movieService = new MovieService();
        SerialService serialService = new SerialService();
        ArrayList<Movie> listMovie = new ArrayList<>();
        ArrayList<Serial> listSerial = new ArrayList<>();

        movieService.createList(listMovie);
        serialService.createList(listSerial);

        while (flag){
            mainMenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    movieService.getListMovie(listMovie);
                    serialService.getListSerial(listSerial);
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    movieService.getByName(listMovie, name);
                    serialService.getByName(listSerial, name);
                    break;
                case 3:
                    System.out.println("Enter category: ");
                    String cate = sc.nextLine();
                    movieService.getByCategory(listMovie, cate);
                    serialService.getByCategory(listSerial, cate);
                    break;
                case 4:
                    movieService.getMaxViews(listMovie);
                    serialService.getMaxViews(listSerial);
                    break;
                case 5:
                    serialService.getByStatus(listSerial);
                    break;
                case 6:
                    movieService.getByYear(listMovie);
                    serialService.getByYear(listSerial);
                    break;
                case 7:
                    String[] arr = {"Siêu anh hùng", "Hành động"};
                    movieService.getListMovie(movieService.getByCategory2(listMovie, arr));
                    serialService.getListSerial(serialService.getByCategory2(listSerial, arr));
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        }
    }
    public static void mainMenu(){
        System.out.println("============ MENU ============");
        System.out.println("1. Get all films");
        System.out.println("2. Search by name");
        System.out.println("3. Search by category");
        System.out.println("4. Get 3 max views's films");
        System.out.println("5. Get serials complete");
        System.out.println("6. Get all film premiere in this year");
        System.out.println("7. Search by multi categories");
        System.out.println("0. Exit");
        System.out.println("Select [0 - 7]: ");
    }

}
