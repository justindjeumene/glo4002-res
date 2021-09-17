package resources.entities;

public class Water extends Resources {
    private int expiryDate;
    private String name;

    public Water() {
        this.expiryDate = 10;
        this.name = "qtyWater";
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
