package Cwiczenia4DekoratoryPizza;

public class Cheese extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return 3 + pizza.cost();
    }
}