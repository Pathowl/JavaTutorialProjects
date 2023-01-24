public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Car -> startEngine");

    }
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders = 6;

    private String fuelType;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.fuelType = "Petrol";
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas All %d cylinders are fired up, Ready! Running on: Petrol%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}
class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}
class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders = 6;

    private int batterySize;

    private String fuelType;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
        this.fuelType = "Petrol";
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up, running on: %s%n", cylinders, fuelType);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average : %.2f %n", avgKmPerLitre);
    }
}
class DieselCar extends Car {
    private double avgKmPerLitre;
    private int cylinders = 4;
    private String fuelType;

    public DieselCar(String description) {
        super(description);
    }

    public DieselCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.fuelType = "Diesel";
    }

    @Override
    public void startEngine() {
        System.out.printf("All %d cylinders are fired up, Ready! Running on: Diesel%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Diesel -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}
