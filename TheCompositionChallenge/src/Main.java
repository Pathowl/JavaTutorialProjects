public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getDishwasher1().setHasWorkToDo(true);
        kitchen.getFridge().setHasWorkToDo(true);
        kitchen.getCoffeemaker1().setHasWorkToDo(true);

        kitchen.getDishwasher1().doDishes();
        kitchen.getFridge().orderFood();
        kitchen.getCoffeemaker1().brewCoffee();
    }
}