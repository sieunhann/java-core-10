package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Book> getArrayListBook(){
        Gson gson = new Gson();

        ArrayList<Book> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader("book.json");

            Type type = new TypeToken<ArrayList<Book>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }

        return list;
    }

    public void getAllBooks(ArrayList<Book> list){
        for (Book b : list){
            System.out.println(b);
        }
    }

    public ArrayList<Book> findBookByTitle(ArrayList<Book> list){
        ArrayList<Book> listName = new ArrayList<>();
        System.out.println("Title: ");
        String fTitle = sc.nextLine();

        for (Book b : list){
            if(b.getTitle().contains(fTitle)){
                listName.add(b);
            }
        }

        return listName;
    }

    public ArrayList<Book> findBookByCategory(ArrayList<Book> list){
        ArrayList<Book> listCategory = new ArrayList<>();

        System.out.println("Category: ");
        String fTitle = sc.nextLine();
        for (Book b : list){
            String[] array = b.getCategory();
            for(String a : array){
                if(a.contains(fTitle)){
                    listCategory.add(b);
                    break;
                }
            }
        }

        return listCategory;
    }

    public void sortListByPage(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage_number() > o2.getPage_number() ? 1 : -1;
            }
        });
    }

    public void sortListByYear(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRelease_year() > o2.getRelease_year() ? 1 : -1;
            }
        });
    }
}
