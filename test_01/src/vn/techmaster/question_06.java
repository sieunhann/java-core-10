package vn.techmaster;

import java.util.regex.Pattern;

public class question_06 {
    public static void checkEmail(String email){
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        boolean flag = Pattern.matches(EMAIL_PATTERN, email);
        if(flag){
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    public static void checkPhoneNumber(String phone){
        boolean flag;
        String reg = "^[0|\\+84][0-9]{8,10}$";
        flag = phone.matches(reg);
        if(flag){
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
