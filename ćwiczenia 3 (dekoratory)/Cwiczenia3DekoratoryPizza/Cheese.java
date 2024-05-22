package Cwiczenia3DekoratoryPizza;

public class Cheese extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return 2 + pizza.cost();
    }
}