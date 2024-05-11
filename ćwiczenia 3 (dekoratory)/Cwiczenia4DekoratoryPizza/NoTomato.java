package Cwiczenia4DekoratoryPizza;

public class NoTomato extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", No Tomato";
    }
    public NoTomato(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return pizza.cost();
    }
}