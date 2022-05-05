package controller;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public static void admin(){
        ProductService service = new ProductService();
        ArrayList<Product> list = service.createList();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            mainMenu();
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose){
                case 1:
                    boolean cateFlag = true;
                    while (cateFlag){
                        categoryMenu();
                        int cateChoose = sc.nextInt();
                        sc.nextLine();

                        switch (cateChoose){
                            case 1:
                                service.getList(service.getListByCategory(list, "PHONE"));
                                break;
                            case 2:
                                service.getList(service.getListByCategory(list, "LAPTOP"));
                                break;
                            case 3:
                                service.getList(service.getListByCategory(list, "APPLE"));
                                break;
                            case 4:
                                service.getList(service.getListByCategory(list, "ACCESSORIES"));
                                break;
                            case 0:
                                cateFlag = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Company: ");
                    String company = sc.nextLine();
                    service.getList(service.getByCompany(list,company));
                    break;
                case 3:
                    System.out.println("Category: ");
                    String cate = sc.nextLine().toUpperCase();
                    ArrayList<Product> cateList = service.getListByCategory(list, cate);
                    boolean priceFlag = true;

                    while (priceFlag){
                        priceMenu();
                        int priceChoose = sc.nextInt();
                        sc.nextLine();
                        switch (priceChoose){
                            case 1:
                                service.getList(service.getByPrice(cateList, 0, 2000000));
                                break;
                            case 2:
                                service.getList(service.getByPrice(cateList, 2000000, 4000000));
                                break;
                            case 3:
                                service.getList(service.getByPrice(cateList, 4000000, 7000000));
                                break;
                            case 4:
                                service.getList(service.getByPrice(cateList, 7000000, 13000000));
                                break;
                            case 5:
                                service.getList(service.getByPrice(cateList, 13000000, 0));
                                break;
                            case 0:
                                priceFlag = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }

                    break;
                case 4:
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    service.getList(service.getByName(list, name));
                    break;
                case 5:
                    service.showByCompany(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        }
    }

    public static void mainMenu(){
        System.out.println("================= MENU =================");
        System.out.println("1. Get products by category");
        System.out.println("2. Get products by company");
        System.out.println("3. Get products by price and category");
        System.out.println("4. Get products by name");
        System.out.println("5. Show products's company");
        System.out.println("0. Exit");
        System.out.println("Please select [0 - 5]");
    }

    public static void categoryMenu(){
        System.out.println("1. Phone");
        System.out.println("2. Laptop");
        System.out.println("3. Apple");
        System.out.println("4. Accessories");
        System.out.println("0. Exit");
        System.out.println("Please select [0 - 4]");
    }

    public static void priceMenu(){
        System.out.println("1. Less than 2.000.000");
        System.out.println("2. From 2.000.000 to 4.000.000");
        System.out.println("3. From 4.000.000 to 7.000.000");
        System.out.println("4. From 7.000.000 to 13.000.000");
        System.out.println("5. More than 13.000.000");
        System.out.println("0. Exit");
        System.out.println("Please select [0 - 5]");

    }
}
