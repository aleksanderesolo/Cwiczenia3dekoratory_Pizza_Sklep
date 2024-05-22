package Cwiczenia3DekoratoryPizza;

public class Ham extends Topping {
    Pizza pizza;
    public String getDescription() {
        return pizza.getDescription() + ", Ham";
    }
    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }
    public double cost() {
        return 9 + pizza.cost();
    }
}