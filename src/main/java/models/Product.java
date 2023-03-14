package models;

public class Product {
    private String name;
    private int costInCents;

    public void Product() {}

    public void Product(String name, int cost){
        this.name = name;
        this.costInCents = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
}
