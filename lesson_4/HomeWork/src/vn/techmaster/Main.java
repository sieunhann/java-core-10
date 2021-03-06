package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Câu 1: ");
        System.out.println("Nhập họ và tên của bạn: ");
        String name = sc.nextLine();

        name = name.toLowerCase();
        name = name.replaceAll("\\s+", " ");
        String[] Name = name.split(" ");
        name = "";
        for(int i = 0; i < Name.length; i++){
            name += String.valueOf(Name[i].charAt(0)).toUpperCase() + Name[i].substring(1) + " ";
        }
        System.out.println("Họ và tên sau khi chuẩn hóa: " + name);


        System.out.println("\n \nCâu 2: ");
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];

        System.out.println("Nhập phần tử cho mảng: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("- Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nIn giá trị của mảng: ");
        for (int i : arr){
            System.out.print(i + "\t");
        }

        System.out.println("\nMảng sau khi tăng giá trị các phần tử chẵn lên 1 là: ");
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i]++;
            }
        }
        for (int i : arr){
            System.out.print(i + "\t");
        }
    }
}
