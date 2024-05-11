package Cwiczenia4DekoratorySklepZupominkami;

public class Laptop extends Product {
    Product product;
    public String getDescription() {
        if(product == null) {
            return description;
        }
        return product.getDescription() + ", " + description;
    }
    public double cost() {
        if(product == null) {
            return 2700;
        }
        return product.cost() + 2700;
    }
    public Laptop() {
        description = "Laptop";
    }
    public Laptop(Product product) {
        description = "Laptop";
        this.product = product;
    }
}