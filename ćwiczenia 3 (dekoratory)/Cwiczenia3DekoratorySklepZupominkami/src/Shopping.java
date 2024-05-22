public class Shopping {
    public static void main(String[] args) {
        Item Cart = new ToyCar();
        Cart = new PendrivePendant(Cart);
        System.out.println(Cart.getDescription() + " = " + Cart.cost());
        Cart = new PendrivePendant(Cart);
        System.out.println(Cart.getDescription() + " = " + Cart.cost());
        Cart = new Mascot(Cart);
        System.out.println(Cart.getDescription() + " = " + Cart.cost());
        Cart = new Transport(Cart);
        System.out.println(Cart.getDescription() + " = " + Cart.cost());
        Cart = new Discount(Cart);
        System.out.println(Cart.getDescription() + " = " + Cart.cost());
    }
}