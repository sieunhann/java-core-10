package service;

import model.Account;
import model.BalanceAlert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ActionsService {

    public static void balance(Account account){
        System.out.println(account.getBalance());
    }

    public static void transfer(Account account){
        Scanner sc = new Scanner(System.in);
        BalanceAlert alert = new BalanceAlert();
        String balanceType = "^[0-9]{8,16}$";
        boolean typeFlag = true;
        boolean amountFlag = true;

        while (typeFlag){
            System.out.println("Balance: ");
            String balance = sc.nextLine();
            if(balance.matches(balanceType)){
                alert.setBalance(balance);
                typeFlag = false;
            } else {
                System.out.println("Balance is wrong!");
            }
        }

        while (amountFlag){
            System.out.println("Amount: ");
            long amount = sc.nextLong();
            sc.nextLine();

            if((account.getBalance() - amount) >= 50000){
                alert.setAmount(amount);
                account.setBalance(account.getBalance() - amount);
                amountFlag = false;
            } else {
                System.out.println("Balance is not enough");
            }
        }

        System.out.println("Description: ");
        String description = sc.nextLine();
        alert.setDescription(description);

        alert.setDate(LocalDate.now());

        if(account.getAlert() == null){
            alert.setId(1);
            ArrayList<BalanceAlert> arrayList = new ArrayList<>();
            arrayList.add(alert);
            account.setAlert(arrayList);
        } else {
            int index = account.getAlert().size() - 1;
            alert.setId(account.getAlert().get(index).getId() + 1);
            account.getAlert().add(alert);
        }


    }

    public static void alert(ArrayList<BalanceAlert> list){
        list.forEach(i -> System.out.println(i));
    }
}
