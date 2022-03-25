package vn.techmaster;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//
//        System.out.println(today.plusWeeks(1));

        //Viết chương trình in ra thông tin cá nhân gồm tên, ngày sinh, quê quán
        //Xin chào, tôi tên là..., tôi sinh ngày ..., tôi đến từ...

        String name = "Cường";
        LocalDate birthday = LocalDate.of(1997, 9, 20);
        String format = "dd/MM/yyyy";
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern(format);
        String country = "Hà Nội";

        System.out.println("Xin chào, tôi tên là " + name +", tôi sinh ngày " + birthday.format(formatTime) + ", tôi đến từ " + country);
    }
}
