package Cwiczenia3DekoratoryPizza;

public abstract class Pizza {
    String description = "Unknown Pizza";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}