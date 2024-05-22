public class Transport extends  Item{
    Item item;
    public String getDescription() {
        return item.getDescription() + ", " + description;
    }
    public Transport(Item item) {
        description = "Transport 13";
        this.item = item;
    }
    public double cost() {
        return item.cost() + 13;
    }
}
