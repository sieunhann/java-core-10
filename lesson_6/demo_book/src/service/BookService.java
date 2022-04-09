package service;

import model.Book;

import java.time.LocalDate;
import java.util.Scanner;

public class BookService {
    public Book addBook(){
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Nhập id: ");
        book.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tiêu đề: ");
        book.title = sc.nextLine();
        System.out.println("Nhập mô tả: ");
        book.description = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        book.author = sc.nextLine();
        System.out.println("Nhập thể loại: ");
        book.category = sc.nextLine();
        System.out.println("Nhập số trang sách: ");
        book.pageNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        book.pulishingYear = sc.nextInt();
        sc.nextLine();

        return book;
    }

    public void getAllBook(Book[] arrBooks){
        for(Book i : arrBooks){
            System.out.println(i);
        }
    }

    public void findBooksByTitle(Book[] arrBooks, String name){
        for(Book i : arrBooks){
            if(i.title.contains(name)){
                System.out.println(i);
            }
        }
    }

    public void findBooksByCategory(Book[] arrBooks, String category){
        for(Book i : arrBooks){
            if(i.category.contains(category)){
                System.out.println(i);
            }
        }
    }

    public void sortBooksByPageNumber(Book[] arrBooks){
        for (int i = 0; i < arrBooks.length - 1; i++){
            for (int j = i + 1; j < arrBooks.length; j++){
                if(arrBooks[i].pageNumber > arrBooks[j].pageNumber){
                    Book min = arrBooks[i];
                    arrBooks[i] = arrBooks[j];
                    arrBooks[j] = min;
                }
            }
        }
    }

    public void sortBooksByYear(Book[] arrBooks){
        for (int i = 0; i < arrBooks.length - 1; i++){
            for (int j = i + 1; j < arrBooks.length; j++){
                if(arrBooks[i].pulishingYear > arrBooks[j].pulishingYear){
                    Book min = arrBooks[i];
                    arrBooks[i] = arrBooks[j];
                    arrBooks[j] = min;
                }
            }
        }
    }

    public void findBooksThisYear(Book[] arrBooks){
        for(Book i : arrBooks){
            if(i.pulishingYear == LocalDate.now().getYear()){
                System.out.println(i);
            }
        }
    }
}
