package Cwiczenia3DekoratoryPizza;

public class Champignons extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", Champignons";
    }
    public Champignons(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return 3 + pizza.cost();
    }
}