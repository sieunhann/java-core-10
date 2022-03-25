package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.println("Chỉ số BMI: " + (weight/(height*height)));
    }
}
