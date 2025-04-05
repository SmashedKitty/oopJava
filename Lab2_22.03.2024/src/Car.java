public class Car extends Vehicle {
    private final int doorCount;
    private final String fuelType;
    private final double fuelConsumption;
    private double currFuelLevel;
    private boolean lightsIsOn;
    private final int wheelCount;

    public Car(String creator, String model, double maxSpeed, double currSpeed,
               int doorCount, int wheelCount, String fuelType, double fuelConsumption) {
        super(creator, model, maxSpeed, currSpeed);
        this.doorCount = doorCount;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.wheelCount = wheelCount;
        this.currFuelLevel = 0;
        this.lightsIsOn = false;
    }

    public void refuel(double amount) {
        currFuelLevel += amount;
        System.out.println("Дозаправлено " + amount + " литров.");
        System.out.println(" Текущий уровень топлива: " + currFuelLevel + "литров");
    }

    public void checkFuel() {
        System.out.println("Текущий уровень топлива: " + currFuelLevel + " литров");
    }

    public void openDoors() {
        System.out.println("Открыто " + doorCount + " дверей");
    }

    public void isRideable()
    {
        if(wheelCount > 3 && currFuelLevel > 0)
        {
            System.out.println("Можно ехать");
        } else {
            System.out.println("Сейчас нельзя ехать");
        }
    }

    public void calculateRange() {
        System.out.println("Запас хода: " + currFuelLevel / fuelConsumption * 100 + " км");
    }

    public void switchLights() {
        if (lightsIsOn)
        {
           lightsIsOn = false;
           System.out.println("Фары отключены");
        } else {
            lightsIsOn = true;
            System.out.println("Фары включены");
        }

    }

    // Геттеры и сеттеры
    public int getDoorCount() {
        return doorCount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double currFuelLevel() {
        return currFuelLevel;
    }

    public int getWheelCount() {
        return wheelCount;
    }
}