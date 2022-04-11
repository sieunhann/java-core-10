package model;

import service.StaffService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        StaffService staffs = new StaffService();
        System.out.println("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        Staff[] arrStaffs = new Staff[n];

        do{
            showMenu();
            System.out.println("Lựa chọn [0 - 5]: ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    for (int i = 0; i < arrStaffs.length; i++){
                        System.out.println("Nhập thông tin nhân viên thứ " + (i+1) + ":");
                        arrStaffs[i] = staffs.createStaff();
                    }
                    break;
                case 2:
                    staffs.searchById(arrStaffs);
                    break;
                case 3:
                    staffs.searchByName(arrStaffs);
                    break;
                case 4:
                    staffs.getByGender(arrStaffs);
                    break;
                case 5:
                    staffs.searchHN(arrStaffs);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        } while (flag);

    }

    public static void showMenu(){
        System.out.println("====== StaffManagement ======");
        System.out.println("1. Nhập danh sách nhân viên");
        System.out.println("2. Tìm nhân viên theo id");
        System.out.println("3. Tìm nhân viên theo tên");
        System.out.println("4. Liệt kê nhân viên theo giới tính");
        System.out.println("5. Tìm nhân viên có địa chỉ ở Hà Nội");
        System.out.println("0. Exit");
    }
}
