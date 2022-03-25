package vn.techmaster;

import java.time.Month;

public class Main {

    public static void main(String[] args) {
        //Sử dụng String literal
	    String name = "Ngọc";

        //Sử dụng từ khóa new
        String address = new String("ngọc");

        System.out.println("Tôi tên là " + name);
        System.out.println(name.equals(address));

        String s ="ngọc";
        String a = new String();
        a = String.valueOf(s.charAt(0));
        s = a.toUpperCase() + s.substring(1);
        System.out.println(s);

        Season muaDong = Season.WINTER;
        System.out.println(muaDong);

        Month month = Month.APRIL;
        System.out.println(month);
    }
}
