public class Mascot extends Item {
    Item item;
    public String getDescription() {
        if(item == null) {
            return description;
        }
        return item.getDescription() + ", " + description;
    }
    public Mascot() {
        description = "Mascot";
    }
    public Mascot(Item item) {
        description = "Mascot";
        this.item = item;
    }
    public double cost() {
        if(item == null) {
            return 0;
        }
        return item.cost() + 0;
    }
}
