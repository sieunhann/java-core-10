package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Câu 1: ");
        String string = "Hello every one";
        int count = 0;
        System.out.println("Kí tự e xuất hiện tại vị trí: ");
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e') {
                count++;
                System.out.println("Index " + count + ": " + i);
            }
        }
        System.out.println("Số lần kí tự e xuất hiện là: " + count);

        System.out.println("\nCâu 2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String palin = sc.nextLine();

        boolean flag = true;

        for (int i = 0; i < palin.length() / 2; i++) {
            if (palin.charAt(i) != palin.charAt(palin.length() - (i + 1))) {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("Chuỗi palindrome");
        } else {
            System.out.println("Không phải chuỗi palindrome");
        }
    }
}
