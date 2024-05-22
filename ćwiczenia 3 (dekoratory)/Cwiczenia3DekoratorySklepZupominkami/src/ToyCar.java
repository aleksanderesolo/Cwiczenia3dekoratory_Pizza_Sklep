public class ToyCar extends Item{
    Item item;
    public String getDescription() {
        if(item == null) {
            return description;
        }
        return item.getDescription() + ", " + description;
    }

    public double cost() {
        if(item == null) {
            return 100;
        }
        return item.cost() + 100;
    }
    public ToyCar() {
        description = "ToyCar";
    }
    public ToyCar(Item product) {
        description = "ToyCar";
        this.item = product;
    }
}
