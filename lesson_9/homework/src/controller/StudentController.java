package controller;

import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    public static void admin(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        StudentService service = new StudentService();
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student();

        while (flag){
            mainMenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    list.add(service.addStudent());
                    break;
                case 2:
                    service.showAllStudent(list);
                    break;
                case 3:
                    student = service.findById(list);
                    service.updatePoint(student);
                    break;
                case 4:
                    student = service.findById(list);
                    service.deleteStudent(list, student);
                    break;
                case 5:
                    service.showAllStudentForClassroom(list);
                    break;
                case 6:
                    service.sortByName(list);
                    break;
                case 7:
                    service.sortByAge(list);
                    break;
                case 8:
                    service.sortByPoint(list);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        }
    }
    public static void mainMenu(){
        System.out.println("============== MENU ==============");
        System.out.println("1. Add student ");
        System.out.println("2. Get all students ");
        System.out.println("3. Update student's point ");
        System.out.println("4. Delete student ");
        System.out.println("5. Get list students for classroom ");
        System.out.println("6. Sort list by name ");
        System.out.println("7. Sort list by age ");
        System.out.println("8. Sort list by point ");
        System.out.println("0. Exit");
        System.out.println("Enter your choose [0 - 8]");
    }
}

