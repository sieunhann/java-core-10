package Controller;

import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    private static ArrayList<User> list = new ArrayList<>();

    public static void admin(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        UserService service = new UserService();

        while (flag){
            mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    service.checkLogin(list);
                    flag = false;
                    break;
                case 2:
                    service.createUser(list);
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

    //Menu chính
    public static void mainMenu(){
        System.out.println("========== Menu ==========");
        System.out.println("1. Login");
        System.out.println("2. Sign up");
        System.out.println("0. Exit");
        System.out.println("Select [0 - 2]");
    }
}

