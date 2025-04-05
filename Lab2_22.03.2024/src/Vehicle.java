public class Vehicle {
    private final String creator;
    private final String model;
    private double currSpeed;
    private final double maxSpeed;
    private boolean isEngineOn;

    public Vehicle(String creator, String model, double year, double maxSpeed) {
        this.creator = creator;
        this.model = model;
        this.currSpeed = 0;
        this.maxSpeed = maxSpeed;
        this.isEngineOn = false;
    }

    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Двигатель запущен.");
        } else {
            System.out.println("Двигатель уже работает.");
        }
    }

    public void stopEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            System.out.println("Двигатель остановлен.");
        } else {
            System.out.println("Двигатель уже выключен.");
        }
    }

    public void accelerate(double speed) {
        if (isEngineOn) {
            if((currSpeed + speed) > maxSpeed)
            {
                System.out.println("Двигатель заглох");
                currSpeed = 0;
                isEngineOn = false;
            } else {
                System.out.println("Ускоряемся до " + (currSpeed + speed) + " км/ч");
                currSpeed += speed;
            }
        } else {
            System.out.println("Сначала запустите двигатель!");
        }
    }

    public void displayInfo() {
        System.out.println("Производитель: " + creator);
        System.out.println("Модель: " + model);
        System.out.println("Текущая скорость: " + currSpeed);
        System.out.println("Макс. скорость: " + maxSpeed + " км/ч");
    }

    public void honk() {
        System.out.println("Сигнал!");
    }

    // Геттеры и сеттеры
    public String creator() {
        return creator;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }
}