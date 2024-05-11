package Cwiczenia4DekoratorySklepZupominkami;

public class Mascot extends Product {
    Product product;
    public String getDescription() {
        if(product == null) {
            return description;
        }
        return product.getDescription() + ", " + description;
    }
    public Mascot() {
        description = "Mascot";
    }
    public Mascot(Product product) {
        description = "Mascot";
        this.product = product;
    }
    public double cost() {
        if(product == null) {
            return 0;
        }
        return product.cost() + 0;
    }
}