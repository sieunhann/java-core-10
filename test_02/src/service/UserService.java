package service;

import Controller.UserController;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    public void showUser(ArrayList<User> list){
        for (User u : list){
            System.out.println(u);
        }
    }

    //Tạo user
    public User createUser(ArrayList<User> list){
        User user = new User();

        addUsername(user, list);
        addEmail(user, list);
        addPassword(user);

        list.add(user);
        return user;
    }

    //Set username nhập từ bàn phím
    public static void addUsername(User user, ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("User name: ");
            String newUsername = sc.nextLine();
            if (list.size() < 1) {
                user.setUsername(newUsername);
                flag = false;
            } else {
                for (User u : list){
                    if(u.getUsername().equals(newUsername) == true){
                        System.out.println("Username available");
                        flag = true;
                        break;
                    } else {
                        user.setUsername(newUsername);
                        flag = false;
                    }
                }
            }
        }
    }

    //Set mail nhập từ bàn phím
    public static void addEmail(User user, ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        String emailType = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        boolean flag = true;
        while (flag == true){
            System.out.println("Email: ");
            String newEmail = sc.nextLine();
            if(newEmail.matches(emailType) == false){
                System.out.println("Mail does not exist");
            } else {
                if (list.size() < 1) {
                    user.setEmail(newEmail);
                    flag = false;
                } else {
                    for (User u : list){
                        if(u.getEmail().equals(newEmail)){
                            System.out.println("Mail available");
                            flag = true;
                            break;
                        } else {
                            user.setEmail(newEmail);
                            flag = false;
                        }
                    }
                }
            }
        }
    }

    //Set password nhập từ bàn phím
    public static void addPassword(User user){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String passwordType = "^.*(?=.{7,15})(?=.*[A-Z])(?=.*[\\,\\-\\_\\;]).*$";

        while (flag){
            System.out.println("Password: ");
            String newPassword = sc.nextLine();
            if(newPassword.matches(passwordType) == false){
                System.out.println("Wrong! Password must have 1 uppercase letter, 1 special characters (. , - _ ;)");
            } else {
                user.setPassword(newPassword);
                flag = false;
            }
        }
    }

    //Kiểm tra thông tin đăng nhập
    public static void checkLogin(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        User user = new User();
        boolean flagName = true;

        while (flagName){
            System.out.println("Username: ");
            String lUsername = sc.nextLine();
            for (User i : list){
                if(i.getUsername().equals(lUsername)){
                    user = i;
                    flagName = false;
                }
            }
            if(flagName == true){
                System.out.println("Check your username again");
            }
        }

        checkPassword(user, list);
    }

    //Kiểm tra mật khẩu
    public static void checkPassword(User user, ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        boolean flagPass = true;
        System.out.println("Password: ");
        String lPassword = sc.nextLine();
        while (flag){
            if(user.getPassword().equals(lPassword)){
                loginSuccess(user, list);
                flag = false;
            } else {
                while (flagPass){
                    subMenu();
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice){
                        case 1:
                            checkLogin(list);
                            flagPass = false;
                            flag = false;
                            break;
                        case 2:
                            forgotPass(user);
                            System.out.println("Password has been changed");
                            loginSuccess(user, list);
                            flagPass = false;
                            flag = false;
                            break;
                        case 0:
                            flagPass = false;
                            flag = false;
                            break;
                        default:
                            System.out.println("Please reselect");
                    }
                }
            }
        }
    }

    //Đăng nhập thành công
    public static void loginSuccess(User user, ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            loginMenu();
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    addUsername(user, list);
                    System.out.println("Username has been changed");
                    break;
                case 2:
                    addEmail(user, list);
                    System.out.println("Email has been changed");
                    break;
                case 3:
                    addPassword(user);
                    System.out.println("Password has been changed");
                    break;
                case 4:
                    UserController.admin();
                    flag = false;
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
            }
        }
    }

    //Quên mật khẩu
    public static void forgotPass(User user){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.println("Email: ");
            String fEmail = sc.nextLine();
            if(user.getEmail().equals(fEmail)){
                addPassword(user);
                flag = false;
            } else {
                System.out.println("No account exists yet");
            }
        }
    }

    //Menu khi nhập sai pass
    public static void subMenu(){
        System.out.println("1. Login again");
        System.out.println("2. Forgot password");
        System.out.println("0. Exit");
        System.out.println("Select [0 - 2]");
    }

    //Menu khi đăng nhập thành công
    public static void loginMenu(){
        System.out.println("1 - Change username");
        System.out.println("2 - Change email");
        System.out.println("3 - Change password");
        System.out.println("4 - Log out");
        System.out.println("0 - Exit");
        System.out.println("Select [0 - 4]");
    }
}
