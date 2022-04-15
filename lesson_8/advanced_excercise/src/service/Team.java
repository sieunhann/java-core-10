package service;

import model.Player;
import model.Position;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Team {
    Scanner sc = new Scanner(System.in);

    public Player createPlayer() {
        Player player = new Player();

        System.out.println("Nhập số áo: ");
        player.setNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên: ");
        player.setFullName(sc.nextLine());
        System.out.println("Danh sách vị trí: " + "\n" + "1.GK " + "2.DF " + "3.MF " + "4.FW ");
        boolean flag = true;
        do {
            System.out.println("Chọn vị trí [1 - 4]");
            int choose = sc.nextInt();
            sc.nextLine();
            Position p = null;
            switch (choose) {
                case 1:
                    player.setPosition(p.GK);
                    break;
                case 2:
                    player.setPosition(p.DF);
                    break;
                case 3:
                    player.setPosition(p.MF);
                    break;
                case 4:
                    player.setPosition(p.FW);
                    break;
                default:
                    System.out.println("Chọn lại");
                    flag = false;
                    break;
            }
        } while (flag == false);
        return player;
    }

    public void getAllPlayer(ArrayList<Player> list) {
        for (Player p : list) {
            System.out.println(p);
        }
    }

    public ArrayList<Player> buildModel(ArrayList<Player> list, int gk, int df, int mf, int fw) {
        ArrayList<Player> model = new ArrayList<>();
        ArrayList<Player> modelGK = new ArrayList<>();
        ArrayList<Player> modelDF = new ArrayList<>();
        ArrayList<Player> modelMF = new ArrayList<>();
        ArrayList<Player> modelFW = new ArrayList<>();
        Position p = null;
        for (Player i : list) {
            if (i.getPosition() == p.GK) {
                modelGK.add(i);
            } else if (i.getPosition() == p.DF) {
                modelDF.add(i);
            } else if (i.getPosition() == p.MF) {
                modelMF.add(i);
            } else {
                modelFW.add(i);
            }
        }
        addPlayerForTeam(model, modelGK, gk);
        addPlayerForTeam(model, modelDF, df);
        addPlayerForTeam(model, modelMF, mf);
        addPlayerForTeam(model, modelFW, fw);

        return model;
    }

    public static void addPlayerForTeam(ArrayList<Player> list,ArrayList<Player> subList, int a){
        Random rd = new Random();
        while (0<a){
            int rdNumber = rd.nextInt(subList.size());
            list.add(subList.get(rdNumber));
            subList.remove(rdNumber);
            a--;
        }
    }
}
