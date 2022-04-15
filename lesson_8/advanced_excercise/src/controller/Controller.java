package controller;

import model.Player;
import service.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void admin(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        Team team = new Team();
        ArrayList<Player> list = new ArrayList<>();
        while (flag){
            mainMenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 0:
                    flag = false;
                    break;
                case 1:
                    list.add(team.createPlayer());
                    break;
                case 2:
                    team.getAllPlayer(list);
                    break;
                case 3:
                    ArrayList<Player> listTeam = new ArrayList<>();
                    boolean flagTeam = true;
                    while (flagTeam){
                        subMenu();
                        int chooseTeam = sc.nextInt();
                        sc.nextLine();
                        switch (chooseTeam){
                            case 0:
                                flagTeam = false;
                                break;
                            case 1:
                                listTeam = team.buildModel(list, 1, 4, 4, 2);
                                team.getAllPlayer(listTeam);
                                break;
                            case 2:
                                listTeam = team.buildModel(list, 1, 4, 3, 3);
                                team.getAllPlayer(listTeam);
                                break;
                            case 3:
                                listTeam = team.buildModel(list, 1, 3, 5, 2);
                                team.getAllPlayer(listTeam);
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        }
    }
    public static void mainMenu(){
        System.out.println("========= MENU =========");
        System.out.println("1. Add player");
        System.out.println("2. Get player list");
        System.out.println("3. Get list of players by team ");
        System.out.println("0. Exit");
        System.out.println("Select [0 - 3]");
    }

    public static void subMenu(){
        System.out.println("========= TEAM =========");
        System.out.println("1. 1GK - 4DF - 4MF - 2FW");
        System.out.println("2. 1GK - 4DF - 3MF - 3FW");
        System.out.println("3. 1GK - 3DF - 5MF - 2FW");
        System.out.println("0. Exit");
        System.out.println("Select [0 - 3]");
    }
}
