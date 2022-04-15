package model;

public class Product {
    private int id;
    private String name;
    private String description;
    private double quantity;
    private long price;
    private String unit;

    public Product() {
    }

    public Product(int id, String name, String description, double quantity, long price, String unit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                ", Name: " + name +
                ", Description: " + description +
                ", Quantity: " + quantity +
                ", Price: " + price +
                ", Unit: " + unit
                ;
    }
}
