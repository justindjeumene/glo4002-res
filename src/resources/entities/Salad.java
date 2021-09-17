package resources.entities;

public class Salad extends Resources {
    private int expiryDate;
    private String name;

    public Salad() {
        this.expiryDate = 3;
        this.name = "qtySalad";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void expiringResource() {
        expiryDate--;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }
}
