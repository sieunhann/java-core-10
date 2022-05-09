package controller;

import model.Account;
import service.ActionsService;

import java.util.Scanner;

public class ActionsController {
    public static void action(Account account){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    ActionsService.balance(account);
                    break;
                case 2:
                    ActionsService.transfer(account);
                    break;
                case 3:
                    ActionsService.alert(account.getAlert());
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

    public static void menu(){
        System.out.println("============== Actions Menu ==============");
        System.out.println("1. Inquiry account balance");
        System.out.println("2. Transfer");
        System.out.println("3. Balance alert");
        System.out.println("0. Exit");
        System.out.println("Select [0 - 3]");
    }
}
