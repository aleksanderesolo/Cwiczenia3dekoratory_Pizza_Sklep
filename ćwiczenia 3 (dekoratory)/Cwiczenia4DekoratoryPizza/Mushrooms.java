package Cwiczenia4DekoratoryPizza;

public class Mushrooms extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }
    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return 5.0 + pizza.cost();
    }
}