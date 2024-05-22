package Cwiczenia3DekoratoryPizza;

public class MakingPizza {
    public static void main(String[] args) {

        Pizza Miami = new Miami();
        System.out.println(Miami.getDescription() + " = " + Miami.cost());

        Miami = new NoKetchup(Miami);
        System.out.println(Miami.getDescription() + " = " + Miami.cost());

        Miami = new Ham(Miami);
        System.out.println(Miami.getDescription() + " = " + Miami.cost());

        Pizza Hawai = new Hawai();
        System.out.println(Hawai.getDescription() + " = " + Hawai.cost());

        Hawai = new Cheese(Hawai);
        System.out.println(Hawai.getDescription() + " = " + Hawai.cost());

        Hawai = new Champignons(Hawai);
        System.out.println(Hawai.getDescription() + " = " + Hawai.cost());

        Hawai = new Champignons(Hawai);
        System.out.println(Hawai.getDescription() + " = " + Hawai.cost());

        Hawai = new Ham(Hawai);
        System.out.println(Hawai.getDescription() + " = " + Hawai.cost());
    }
}