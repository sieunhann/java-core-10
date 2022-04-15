package model;

public class Player {
    private int number;
    private String fullName;
    private Enum position;

    public Player() {
    }

    public Player(int number, String fullName, Enum position) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Enum getPosition() {
        return position;
    }

    public void setPosition(Enum position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player: " +
                "number = " + number +
                ", fullName = " + fullName +
                ", position = " + position;
    }
}
