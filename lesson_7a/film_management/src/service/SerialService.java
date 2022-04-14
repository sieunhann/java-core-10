package service;

import model.Movie;
import model.Serial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SerialService {
    Scanner sc = new Scanner(System.in);

    public Serial addSerial(){
        Serial serial = new Serial();

        System.out.println("Nhập id: ");
        serial.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tiêu đề: ");
        serial.setTitle(sc.nextLine());
        System.out.println("Nhập thể loại: ");
        serial.setCategory(sc.nextLine());
        System.out.println("Nhập đạo diễn: ");
        serial.setDirector(sc.nextLine());
        System.out.println("Nhập ngày công chiếu(dd/MM/yyyy): ");
        String date = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);;
        serial.setDate(localDate);
        System.out.println("Nhập số tập: ");
        serial.setEpisodes(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập thời lượng phim trung bình: ");
        serial.setAverageTime(sc.nextInt());
        sc.nextLine();

        return serial;
    }

    public void getAllSerial(Serial[] arrSerial){
        System.out.println("Movie: ");
        for(Serial i : arrSerial){
            System.out.println(i);
        }
    }

    public void getSerialByName(Serial[] arrSerial){
        System.out.println("Nhập tên phim cần tìm: ");
        String title = sc.nextLine();
        for(Serial i : arrSerial){
            if(i.getTitle().contains(title)){
                System.out.println(i);
            }
        }
    }
}
