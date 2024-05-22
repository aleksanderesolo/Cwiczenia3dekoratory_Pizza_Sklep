public class Discount extends Item{
    Item item;
    public String getDescription() {
        return item.getDescription() + ", " + description;
    }
    public double cost() {
        double newCost = item.cost() - 10;
        return newCost < 0 ? 0 : newCost;
    }
    public Discount(Item item) {
        description = "Discount -10";
        this.item = item;
    }
}
