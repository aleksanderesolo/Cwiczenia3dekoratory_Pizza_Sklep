public class PendrivePendant extends Item{
    Item item;
    public String getDescription() {
        if(item == null) {
            return description;
        }
        return item.getDescription() + ", " + description;
    }
    public PendrivePendant() {
        description = "PendrivePendant";
    }
    public PendrivePendant(Item item) {
        description = "PendrivePendant";
        this.item = item;
    }
    public double cost() {
        if(item == null) {
            return 1;
        }
        return item.cost() + 1;
    }
}
