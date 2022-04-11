package model;

import java.time.LocalDate;

public class Staff {
    public String id;
    public String name;
    public LocalDate birthday;
    public String gender;
    public String phone;
    public String email;
    public String address;

    public Staff() {
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
