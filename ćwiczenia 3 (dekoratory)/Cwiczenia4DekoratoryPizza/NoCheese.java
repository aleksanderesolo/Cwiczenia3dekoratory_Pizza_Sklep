package Cwiczenia4DekoratoryPizza;

public class NoCheese extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", No Cheese";
    }
    public NoCheese(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return pizza.cost();
    }
}