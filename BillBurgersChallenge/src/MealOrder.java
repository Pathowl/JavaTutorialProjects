public class MealOrder {
    Item side;
    Item drink;
    Burger burger;

    public MealOrder(Item side, Item drink, Burger burger) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public MealOrder() {

    }
}
class Item extends MealOrder {
    String name;
    String type;
    double price;
    String size = "Medium";

    public Item(String type, String name, double price) {
        super();
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;

    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK"))
            return size + " " + name;
        return name;
    }

    public double getBasePrice() {
        return price;
    }
    public double getAdjustedPrice(){
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }
    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
class Burger extends MealOrder {
    Item extra1;
    Item extra2;
    Item extra3;

    public Burger(Item side, Item drink, Burger burger, Item extra1, Item extra2, Item extra3) {
        super(side, drink, burger);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }
}