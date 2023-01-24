public class SmartKitchen {
    private DishWasher dishwasher1;
    private Refrigerator fridge;
    private CoffeeMaker coffeemaker1;



    public SmartKitchen() {
        coffeemaker1 = new CoffeeMaker();
        fridge = new Refrigerator();
        dishwasher1 = new DishWasher();
    }

    public DishWasher getDishwasher1() {
        return dishwasher1;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public CoffeeMaker getCoffeemaker1() {
        return coffeemaker1;
    }
}
class Refrigerator extends SmartKitchen {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if (hasWorkToDo) {
            System.out.println("Ordering Food...");
            hasWorkToDo = false;
        }
    }
}
class DishWasher extends SmartKitchen {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if (hasWorkToDo) {
            System.out.println("Washing Dishes...");
            hasWorkToDo = false;
        }
    }
}
class CoffeeMaker extends SmartKitchen {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee...");
            hasWorkToDo = false;
        }
    }
}









