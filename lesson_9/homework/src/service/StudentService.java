package service;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService {

    Scanner sc = new Scanner(System.in);

    public Student addStudent(){
        Student s = new Student();
        System.out.println("Id: ");
        s.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Name: ");
        s.setName(sc.nextLine());
        System.out.println("Age: ");
        s.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Address: ");
        s.setAddress(sc.nextLine());
        System.out.println("Point: ");
        s.setPoint(sc.nextDouble());
        sc.nextLine();
        System.out.println("Classroom: ");
        s.setClassroom(sc.nextLine());

        return s;
    }

    public void showAllStudent(ArrayList<Student> list){
        for(Student s : list){
            System.out.println(s);
        }
    }

    public Student findById(ArrayList<Student> list){
        Student s = new Student();

        System.out.println("Id: ");
        int fId = sc.nextInt();
        sc.nextLine();

        for (Student i : list){
            if(i.getId() == fId){
                s = i;
            }
        }

        return s;
    }

    public void updatePoint(Student s){
        System.out.println("Update point: ");
        s.setPoint(sc.nextDouble());
        sc.nextLine();
    }

    public void deleteStudent(ArrayList<Student> list, Student s){
        list.remove(s);
    }

    public void showAllStudentForClassroom(ArrayList<Student> list){
        System.out.println("Classroom: ");
        String classroom = sc.nextLine();
        for(Student s : list){
            if(s.getClassroom().contains(classroom)){
                System.out.println(s);
            }
        }
    }

    public void sortByName(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortByAge(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
    }

    public void sortByPoint(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getPoint() > o2.getPoint() ? 1 : -1;
            }
        });
    }
}
