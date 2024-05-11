package Cwiczenia4DekoratoryPizza;

public class Chicken extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }
    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return 9.0 + pizza.cost();
    }
}