package controller;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void admin(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        ProductService productService = new ProductService();
        ArrayList<Product> list = new ArrayList<>();
        while (flag){
            mainMenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    boolean flagCreate = true;
                    while (flagCreate){
                        createMenu();
                        int chooseCreate = sc.nextInt();
                        sc.nextLine();
                        switch (chooseCreate){
                            case 1:
                                list.add(productService.createProduct());
                                break;
                            case 0:
                                flagCreate = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }
                    break;
                case 2:
                    productService.getAllProduct(list);
                    break;
                case 3:
                    ArrayList<Product> listName = productService.getProductByName(list);
                    for (Product p : listName){
                        System.out.println(p);
                    }
                    break;
                case 4:
                    Product productId = productService.getProductById(list);
                    System.out.println(productId);
                    boolean flagId = true;
                    while (flagId){
                        subMenuIndex4();
                        int chooseId = sc.nextInt();
                        sc.nextLine();
                        switch (chooseId){
                            case 1:
                                productService.deleteProduct(productId, list);
                                flagId = false;
                                break;
                            case 2:
                                productService.updateProduct(productId);
                                break;
                            case 0:
                                flagId = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }
                    break;
                case 5:
                    ArrayList<Product> listQuantity = productService.getProductQuantityLess(list,5);
                    for (Product p : listQuantity){
                        System.out.println(p);
                    }
                    break;
                case 6:
                    boolean flagPrice = true;
                    ArrayList<Product> listPrice = new ArrayList<>();
                    while (flagPrice){
                        priceMenu();
                        int choosePrice = sc.nextInt();
                        sc.nextLine();
                        switch (choosePrice){
                            case 1:
                                listPrice = productService.getProductByPrice1(list);
                                for (Product p : listPrice){
                                    System.out.println(p);
                                }
                                break;
                            case 2:
                                listPrice = productService.getProductByPrice2(list);
                                for (Product p : listPrice){
                                    System.out.println(p);
                                }
                                break;
                            case 3:
                                listPrice = productService.getProductByPrice3(list);
                                for (Product p : listPrice){
                                    System.out.println(p);
                                }
                                break;
                            case 0:
                                flagPrice = false;
                                break;
                            default:
                                System.out.println("Please reselect");
                                break;
                        }
                    }
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
        System.out.println("============= MENU =============");
        System.out.println("1. Add Product");
        System.out.println("2. Get product'list");
        System.out.println("3. Find product by name");
        System.out.println("4. Find product by id");
        System.out.println("5. Find products have quantity less than 5");
        System.out.println("6. Find product'list by price");
        System.out.println("0. Exit");
        System.out.println("Select your choose [0 - 6]");
    }

    public static void createMenu(){
        System.out.println("1. Add Product");
        System.out.println("0. Exit");
        System.out.println("Enter your select [0 or 1]: ");
    }

    public static void subMenuIndex4(){
        System.out.println("1. Delete product");
        System.out.println("2. Update product");
        System.out.println("0. Exit");
        System.out.println("Enter your select [0 - 2]: ");
    }

    public static void priceMenu(){
        System.out.println("1. Dưới 50.000");
        System.out.println("2. Từ 50.000 đến dưới 100.000");
        System.out.println("3. Trên 100.000");
        System.out.println("0. Exit");
        System.out.println("Enter your select [0 - 3]: ");
    }
}
