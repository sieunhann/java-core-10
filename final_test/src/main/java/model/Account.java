package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Account {
    private String phone;
    private String password;
    private long balance;
    private ArrayList<BalanceAlert> alert;

    public Account(String phone, String password, long balance) {
        this.phone = phone;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return phone + " - " + password + " - " + balance ;
    }
}
