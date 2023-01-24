public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car (int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        // return " Car -> startEngine()";
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        // return "Car -> accelerate()";
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        // return "Car -> brake()";
        return getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getClass().getSimpleName() + " -> " + getName();
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(getClass().getSimpleName() + " -> " +getName());
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println(getClass().getSimpleName() + " -> " +getName());
    }
}
class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
}
class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
}