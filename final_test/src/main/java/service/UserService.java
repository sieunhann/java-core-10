package service;

import controller.ActionsController;
import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    Scanner sc = new Scanner(System.in);

    public void createUser(ArrayList<Account> list){
        list.add(new Account("0933001997", "helloworld", 15000000));
        list.add(new Account("0902172309", "helloanhem", 35000000));
        list.add(new Account("0912255021", "hiword", 6000000));
        list.add(new Account("0986392356", "hianhem", 55000000));
        list.add(new Account("0912305769", "hihihaha", 4000000));
        list.add(new Account("0903695632", "hehehihi", 8000000));
    }

    public void login(ArrayList<Account> list){
        checkPhone(list);
    }

    //Check id
    public Account checkPhone(ArrayList<Account> list){
        Account account = new Account();
        String phoneType = "^0[0-9]{9}$";
        boolean flag = true;
        while (flag){
            System.out.println("Phone: ");
            String phone = sc.nextLine();
            if(phone.matches(phoneType)){
                int count = 0;
                for (Account i : list) {
                    if (i.getPhone().equals(phone)) {
                        account = i;
                        checkPassword(account);
                        flag = false;
                        count = 1;
                        break;
                    }
                }
                if(count == 0){
                    System.out.println("Phone does not exist");
                }
            } else {
                System.out.println("Wrong!");
            }
        }
        return account;
    }

    //Check password
    public static void checkPassword(Account account){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Password: ");
            String pass = sc.nextLine();
            if(account.getPassword().equals(pass)){
                ActionsController.action(account);
                flag = false;
            } else {
                System.out.println("Incorrect password!");
            }
        }
    }

}
