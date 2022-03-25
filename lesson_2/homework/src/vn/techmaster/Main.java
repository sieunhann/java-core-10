package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Câu 1: ");

        System.out.println("Nhập chiều dài hình chữ nhật: ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        double b = sc.nextDouble();
        sc.nextLine();

        System.out.println("Diện tích hình chữ nhật là: S = " + a * b);
        System.out.println("Chu vi hình chữ nhật là: C = " + (a + b) * 2);

        System.out.println("\nCâu 2: ");
        System.out.println("Họ và tên: ");
        String name = sc.nextLine();
        System.out.println("Tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("\nThông tin cá nhân của bạn: " +
                "\n- Họ và tên: " + name +
                "\n- Tuổi: " + age +
                "\n- Giới tính: " + gender +
                "\n- Địa chỉ: " + address);
    }
}