package model;

public class Product {
    private int CostInCents;
    private String name;

    public Product(String name, int costInCents) {
        CostInCents = costInCents;
        this.name = name;
    }

    public int getCostInCents() {
        return CostInCents;
    }

    public void setCostInCents(int costInCents) {
        CostInCents = costInCents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
