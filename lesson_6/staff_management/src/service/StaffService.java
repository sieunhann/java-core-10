package service;

import model.Gender;
import model.Staff;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StaffService {

    Scanner sc = new Scanner(System.in);

    public Staff createStaff(){
        Staff staff = new Staff();
        Gender gen = null;
        boolean flag = true;
        String idType = "^nv[0-9]+$";
        String emailType = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        String phoneType = "^[0|+84][0-9]{9}$";

        do {
            System.out.println("- Nhập id [\"nv\" + số id]: ");
            staff.id = sc.nextLine();
        } while (staff.id.matches(idType) == false);

        System.out.println("- Nhập tên: ");
        staff.name = sc.nextLine();

        System.out.println("- Nhập ngày sinh: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birth = sc.nextLine();
        staff.birthday = staff.birthday.parse(birth, formatter);

        do {
            System.out.println("- Nhập email: ");
            staff.email = sc.nextLine();
        } while (staff.email.matches(emailType) == false);

        do {
            System.out.println("- Nhập số điện thoại: ");
            staff.phone = sc.nextLine();
        } while (staff.phone.matches(phoneType) == false);

        System.out.println("- Nhập địa chỉ: ");
        do{
            System.out.println("Chọn giới tính [1 or 2]: " + "\n" + "1.MALE" + "\n" + "2.FEMALE");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    staff.gender = gen.MALE.name();
                    break;
                case 2:
                    staff.gender = gen.FEMALE.name();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag == false);

        System.out.println("- Nhập địa chỉ: ");
        staff.address = sc.nextLine();

        return staff;
    }

    public void searchById(Staff[] arrStaff){
        System.out.println("Nhập id nhân viên cần tìm: ");
        String sid = sc.nextLine();
        for (Staff i : arrStaff){
            if(i.id.contains(sid)){
                System.out.println(i);
            }
        }
    }

    public void searchByName(Staff[] arrStaff){
        System.out.println("Nhập id nhân viên cần tìm: ");
        String sname = sc.nextLine();
        for (Staff i : arrStaff){
            if(i.name.contains(sname)){
                System.out.println(i);
            }
        }
    }
    public void getByGender(Staff[] arrStaff){
        boolean flag = true;
        String gGender;
        do{
            System.out.println("Chọn giới tính [1 or 2]: " + "\n" + "1.MALE" + "\n" + "2.FEMALE");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    for (Staff i : arrStaff){
                        gGender = "MALE";
                        if(i.gender.equals(gGender)){
                            System.out.println(i);
                        }
                    }
                    break;
                case 2:
                    for (Staff i : arrStaff){
                        gGender = "FEMALE";
                        if(i.gender.equals(gGender)){
                            System.out.println(i);
                        }
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag == false);

//        System.out.println("MALE: ");
//        String gGender;
//        System.out.println("1. MALE:");
//        for (Staff i : arrStaff){
//            gGender = "MALE";
//            if(i.gender.equals(gGender)){
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("2. FEMALE:");
//        for (Staff i : arrStaff){
//            gGender = "FEMALE";
//            if(i.gender.equals(gGender)){
//                System.out.println(i);
//            }
//        }
    }
    public void searchHN(Staff[] arrStaff){
        for (Staff i : arrStaff){
            if(i.address.contains("Hà Nội")){
                System.out.println(i);
            }
        }
    }
}
