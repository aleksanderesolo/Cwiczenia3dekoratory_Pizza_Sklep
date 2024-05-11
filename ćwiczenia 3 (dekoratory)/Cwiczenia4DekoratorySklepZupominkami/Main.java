package Cwiczenia4DekoratorySklepZupominkami;

public class Main {
    public static void main(String[] args) {
        Product basket = new Laptop();
       // basket = new Laptop(basket);
        basket = new PendriveLanyard(basket);
        System.out.println(basket.getDescription() + " = " + basket.cost());
        basket = new PendriveLanyard(basket);
        System.out.println(basket.getDescription() + " = " + basket.cost());
        basket = new Shipment(basket);
        System.out.println(basket.getDescription() + " = " + basket.cost());
        basket = new Discount(basket);
        System.out.println(basket.getDescription() + " = " + basket.cost());
    }
}