package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1: ");
        System.out.println("a. Square: \n");
        question_01.square();
        System.out.println("b. Triangle: \n");
        question_01.triangle();

        System.out.println("Question 2: ");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("a. Đếm số từ: ");
        System.out.println("Số từ trong chuỗi là: " + question_02.countWords(str) + "\n");
        System.out.println("b. Đếm và in index kí tự o: ");
        question_02.checkCharacter(str);

        System.out.println("\nQuestion 3: ");
        Random rd = new Random();
        int rdNumber = rd.nextInt();
        System.out.println("Số random là: " + rdNumber);

        boolean flag = question_03.isPrimeNumber(rdNumber);
        if (flag) {
            System.out.println("Đó là số nguyên tố");
        } else {
            System.out.println("Đó không phải số nguyên tố");
        }

        System.out.println("\nQuestion 4: ");
        System.out.println("a. 10 số nguyên tố đầu tiên là: ");
        question_04.showPrimeNumbers();
        System.out.println("\nb. Các số nguyên tố nhỏ hơn 10 là: ");
        question_04.showPrimeNumber();


        System.out.println("\n\nQuestion 5: ");
        System.out.println("Nhập số hàng: ");
        int row = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập mảng arr: ");
        int[][] arr = question_05.addArray(row, col);
        System.out.println("In mảng arr: ");
        question_05.getArray(arr, row, col);
        question_05.getDiagonalLine(arr, row, col);

        System.out.println("Nhập mảng Arr: ");
        int[][] Arr = question_05.addArray(row, col);
        System.out.println("In mảng Arr: ");
        question_05.sumArray(arr, Arr, row, col);
        question_05.getArray(Arr, row, col);
        System.out.println("In mảng arr sau khi cộng: ");
        question_05.getArray(arr, row, col);

        System.out.println("\nQuestion 6: ");
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        question_06.checkEmail(email);
        System.out.println("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        question_06.checkPhoneNumber(phone);
    }
}
