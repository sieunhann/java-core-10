package service;

import model.EnumStatus;
import model.Serial;

import java.time.LocalDate;
import java.util.ArrayList;

public class SerialService {
    public void createList(ArrayList<Serial> list){
        list.add(new Serial(1, "Cảnh sát hình sự", "Phim truyền hình Việt Nam", new String[]{"Trinh thám", "Hành động"}, LocalDate.of(2022,4,20), 15360, 45, EnumStatus.FINISHED));
        list.add(new Serial(2, "Chú chó Rex", "Phim truyền hình Mỹ", new String[]{"Trinh thám", "Hành động"}, LocalDate.of(2002,2,20), 65360, 145, EnumStatus.FINISHED));
        list.add(new Serial(3, "Nhật ký Vàng Anh", "Phim giải trí", new String[]{"Giải trí", "Tuổi teen"}, LocalDate.of(2010,8,29), 5360, 42, EnumStatus.UNFINISHED));
        list.add(new Serial(4, "18 bánh xe công lý", "Phim truyền hình Mỹ", new String[]{"Giải trí", "Hành động"}, LocalDate.of(2000,1,12), 96360, 202, EnumStatus.FINISHED));
        list.add(new Serial(5, "TeenTitan", "Phim hoạt hình Marvel", new String[]{"Hoạt hình", "Siêu anh hùng", "Hành động"}, LocalDate.of(2022,2,6), 35360, 49, EnumStatus.UNFINISHED));
    }

    public void getListSerial(ArrayList<Serial> list){
        list.forEach(i -> System.out.println(i));
    }

    public ArrayList<Serial> getByName(ArrayList<Serial> list, String name){
        ArrayList<Serial> arrList = new ArrayList<>();
        list.stream().filter(i -> i.getName().contains(name)).forEach(i-> arrList.add(i));
        return arrList;
    }

    public ArrayList<Serial> getByCategory(ArrayList<Serial> list, String cate){
        ArrayList<Serial> arrList = new ArrayList<>();
        list.forEach(i -> {
            for(String a : i.getCategory()){
                if(a.contains(cate)){
                    arrList.add(i);
                    break;
                }
            }
        });

        return arrList;
    }

    public void getMaxViews(ArrayList<Serial> list){
        list.stream().sorted((m1,m2) -> {
            return m1.getViews() > m2.getViews() ? -1 : 1;
        }).limit(3).forEach(i-> System.out.println(i));
    }

    public void getByStatus(ArrayList<Serial> list){
        list.stream().filter(i -> i.getStatus().equals(EnumStatus.FINISHED)).forEach(i -> System.out.println(i));
    }

    public void getByYear(ArrayList<Serial> list){
        list.stream().filter(i -> i.getPremiereDate().getYear() == LocalDate.now().getYear()).forEach(i -> System.out.println(i));
    }

    public ArrayList<Serial> getByCategory2(ArrayList<Serial> list, String[]cate ){
        ArrayList<Serial> arrList = new ArrayList<>();
        list.forEach(i -> {
            boolean flag = false;
            for(String j : cate){
                for(String k : i.getCategory()){
                    if(j.equals(k)){
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if(flag == false){
                    break;
                }
            }
            if(flag == true){
                arrList.add(i);
            }
        });
        return arrList;
    }
}
