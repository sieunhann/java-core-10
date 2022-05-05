package service;

import model.EnumCategory;
import model.Product;

import java.util.ArrayList;
import java.util.TreeMap;

public class ProductService {
    public ArrayList<Product> createList(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Iphone 13", "Điện thoại cảm ứng", 35000000, 225, 112, "Apple", new EnumCategory[]{EnumCategory.PHONE, EnumCategory.APPLE}));
        list.add(new Product(2, "Macbook Pro 2015", "Máy tính của Apple", 50000000, 22, 5, "Apple", new EnumCategory[]{EnumCategory.LAPTOP, EnumCategory.APPLE}));
        list.add(new Product(3, "Tai nghe Xiaomi", "Tai nghe Bluetooth", 3000000, 125, 68, "Xiaomi", new EnumCategory[]{EnumCategory.ACCESSORIES}));
        list.add(new Product(4, "Airpod pro", "Tai nghe Bluetooth", 5000000, 250, 198, "Apple", new EnumCategory[]{EnumCategory.ACCESSORIES, EnumCategory.APPLE}));
        list.add(new Product(5, "Samsung Galaxy S10", "Điện thoại cảm ứng thế hệ mới", 18000000, 29, 15, "Samsung", new EnumCategory[]{EnumCategory.PHONE}));
        list.add(new Product(6, "Iphone XSmax", "Điện thoại cảm ứng", 1000000, 25, 12, "Apple", new EnumCategory[]{EnumCategory.PHONE, EnumCategory.APPLE}));
        list.add(new Product(7, "Sạc Macbook", "Sạc Laptop", 2500000, 85, 12, "Apple", new EnumCategory[]{EnumCategory.ACCESSORIES, EnumCategory.APPLE}));
        list.add(new Product(7, "Sạc Laptop Asus", "Sạc Laptop", 1800000, 65, 19, "Asus", new EnumCategory[]{EnumCategory.ACCESSORIES, EnumCategory.LAPTOP}));

        return list;
    }

    public void getList(ArrayList<Product> list){
        for(Product i : list){
            System.out.println(i);
        }
    }

    public ArrayList<Product> getListByCategory(ArrayList<Product> list, String a){
        ArrayList<Product> arrList = new ArrayList<>();
        for (Product i : list){
            for (Enum j : i.getCategory()){
                if(EnumCategory.valueOf(a).equals(j)){
                    arrList.add(i);
                    break;
                }
            }
        }
        return arrList;
    }

    public ArrayList<Product> getByCompany(ArrayList<Product> list, String company){
        int a = 0;
        ArrayList<Product> arrList = new ArrayList<>();
        for (Product i : list){
            if(i.getCompany().contains(company)){
                System.out.println(i);
                a++;
            }
        }
        System.out.println(company+ ": " + a);
        return arrList;
    }

    public ArrayList<Product> getByPrice(ArrayList<Product> list, long a, long b){
        ArrayList<Product> arrList = new ArrayList<>();

        if(b > 0){
            for(Product i : list){
                if(a < i.getPrice() && i.getPrice() < b){
                    arrList.add(i);
                }
            }
        } else{
            for(Product i : list){
                if(a < i.getPrice()){
                    arrList.add(i);
                }
            }
        }
        return arrList;
    }

    public ArrayList<Product> getByName(ArrayList<Product> list, String name){
        int count = 0;
        ArrayList<Product> arrList = new ArrayList<>();

        for(Product i : list){
            if(i.getName().contains(name)){
                arrList.add(i);
                count++;
            }
        }
        System.out.println("Number of products searched: " + count);
        return arrList;
    }

    public void showByCompany(ArrayList<Product> list){
        TreeMap<String, Integer> map = new TreeMap<>();
        for(Product i : list){
            if(map.containsKey(i.getCompany())){
                map.put(i.getCompany(), map.get(i.getCompany()) + 1);
            }else {
                map.put(i.getCompany(), 1);
            }
        }
        System.out.println(map);
    }

}
