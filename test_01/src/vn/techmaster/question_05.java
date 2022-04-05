package vn.techmaster;

import java.util.Scanner;

public class question_05 {
    public static int[][] addArray(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];
        System.out.println("- Nhập giá trị các phần tử: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        return arr;
    }

    public static void getArray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void getDiagonalLine(int[][] arr, int row, int col) {
        System.out.println("- In đường chéo chính: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == i) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void sumArray(int[][] arr, int[][] Arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] += Arr[i][j];
            }
        }
    }
}