package service;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);

    public Product createProduct(){
        Product p = new Product();
        System.out.println("Id: ");
        p.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Name: ");
        p.setName(sc.nextLine());
        System.out.println("Description: ");
        p.setDescription(sc.nextLine());
        System.out.println("Quantity: ");
        p.setQuantity(sc.nextDouble());
        sc.nextLine();
        System.out.println("Price: ");
        p.setPrice(sc.nextLong());
        sc.nextLine();
        System.out.println("Unit: ");
        p.setUnit(sc.nextLine());

        return p;
    }

    public void getAllProduct(ArrayList<Product> list){
        for (Product p : list){
            System.out.println(p);
        }
    }

    public ArrayList<Product> getProductByName(ArrayList<Product> list){
        System.out.println("Enter name: ");
        String fname = sc.nextLine();
        ArrayList<Product> listName = new ArrayList<>();
        for (Product p : list){
            if(p.getName().contains(fname)){
                listName.add(p);
            }
        }
        return listName;
    }

    public Product getProductById(ArrayList<Product> list){
        System.out.println("Enter id: ");
        int fId = sc.nextInt();
        sc.nextLine();

        Product fProduct = new Product();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == fId){
                fProduct = list.get(i);
                break;
            }
        }

        return fProduct;
    }

    public void deleteProduct(Product product, ArrayList<Product> list){
        if(list.remove(product)){
            System.out.println("Xóa phần tử thành công");
        } else {
            System.out.println("Xóa không thành công");
        };
    }

    public void updateProduct(Product product){
        System.out.println("Nhập số lượng sản phẩm: ");
        int uQuantity = sc.nextInt();
        sc.nextLine();
        product.setQuantity(uQuantity);
    }

    public ArrayList<Product> getProductQuantityLess(ArrayList<Product> list, int quantity){
        ArrayList<Product> listQuantity = new ArrayList<>();
        for (Product p : list){
            if(p.getQuantity() < quantity){
                listQuantity.add(p);
            }
        }
        return listQuantity;
    }


    public ArrayList<Product> getProductByPrice1(ArrayList<Product> list){
        ArrayList<Product> listPrice = new ArrayList<>();
        for (Product p: list){
            if(p.getPrice() < 50000){
                listPrice.add(p);
            }
        }
        return listPrice;
    }
    public ArrayList<Product> getProductByPrice2(ArrayList<Product> list){
        ArrayList<Product> listPrice = new ArrayList<>();
        for (Product p: list){
            if(p.getPrice() >= 50000 && p.getPrice() < 100000){
                listPrice.add(p);
            }
        }
        return listPrice;
    }
    public ArrayList<Product> getProductByPrice3(ArrayList<Product> list){
        ArrayList<Product> listPrice = new ArrayList<>();
        for (Product p: list){
            if(p.getPrice() >= 100000){
                listPrice.add(p);
            }
        }
        return listPrice;
    }

}
