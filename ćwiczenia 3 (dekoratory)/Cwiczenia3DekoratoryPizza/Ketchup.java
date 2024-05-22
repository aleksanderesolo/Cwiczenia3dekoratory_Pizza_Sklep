package Cwiczenia3DekoratoryPizza;

public class Ketchup extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", Ketchup";
    }
    public Ketchup(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return 1 + pizza.cost();
    }
}