package controller;

import model.Account;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountController {

    public static void admin(){
        ArrayList<Account> list = new ArrayList<>();
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        userService.createUser(list);

        while (flag){
            mainmenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    userService.login(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
            }
        }
    }

    public static void mainmenu(){
        System.out.println("========= MENU =========");
        System.out.println("1. Login");
        System.out.println("0. Exit");
        System.out.println("Select [0 or 1]: ");
    }
}
