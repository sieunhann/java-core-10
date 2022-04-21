package controller;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
    public static void admin(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        BookService service = new BookService();

        list = service.getArrayListBook();

        boolean flag = true;
        while (flag){
            mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    service.getAllBooks(list);
                    break;
                case 2:
                    ArrayList<Book> listTitle = service.findBookByTitle(list);
                    for (Book b : listTitle){
                        System.out.println(b);
                    }
                    break;
                case 3:
                    ArrayList<Book> listCate = service.findBookByCategory(list);
                    for (Book b : listCate){
                        System.out.println(b);
                    }
                    break;
                case 4:
                    service.sortListByPage(list);
                    break;
                case 5:
                    service.sortListByYear(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
            }
        }

    }

    public static void mainMenu(){
        System.out.println("============= Main Menu =============");
        System.out.println("1. Get all books ");
        System.out.println("2. Find list books by name");
        System.out.println("3. Find list books by category");
        System.out.println("4. Sort list books by number page");
        System.out.println("5. Sort list books by release year");
        System.out.println("0. Exit");
        System.out.println("Select [0 - 5]");
    }
}
