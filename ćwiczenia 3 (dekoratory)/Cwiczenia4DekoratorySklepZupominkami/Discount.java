package Cwiczenia4DekoratorySklepZupominkami;

public class Discount extends Product {
    Product product;
    public String getDescription() {
        return product.getDescription() + ", " + description;
    }
    public double cost() {
        double newCost = product.cost() - 10;
        return newCost < 0 ? 0 : newCost;
    }
    public Discount(Product product) {
        description = "Discount 10 ZL";
        this.product = product;
    }
}