package Cwiczenia3DekoratoryPizza;

public class NoKetchup extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", No Ketchup";
    }
    public NoKetchup(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return pizza.cost();
    }
}