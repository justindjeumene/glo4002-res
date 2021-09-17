package resources.entities;

public class Burger extends Resources {
    private int expiryDate;
    private String name;

    public Burger() {
        this.expiryDate = 4;
        this.name = "qtyBurger";
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
