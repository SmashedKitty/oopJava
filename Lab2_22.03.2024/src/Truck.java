public class Truck extends Car {
    private final double cargoCapacity;
    private double currCargoWeight;
    private String company;
    private String cargoName;
    private boolean isLoaded;

    public Truck(String creator, String model, int year, double maxSpeed,
                 int doorCount, String fuelType, double fuelConsumption, int wheelCount,
                 double cargoCapacity, String company, String cargoName) {
        super(creator, model, year, maxSpeed, doorCount, wheelCount, fuelType, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
        this.currCargoWeight = 0;
        this.company = company;
        this.isLoaded = false;
    }

    public void loadCargo(double weight, String cargoName) {
        if (weight + currCargoWeight <= cargoCapacity) {
            currCargoWeight += weight;
            System.out.println("Груз загружен. Текущий вес: " + currCargoWeight + " кг");
            this.cargoName = cargoName;
            if(weight + currCargoWeight == cargoCapacity)
            {
                isLoaded = true;
            }
        } else {
            System.out.println("Превышена грузоподъемность!");
        }
    }

    public void checkCapacity()
    {
        if(isLoaded) {
            System.out.println("Грузовик загружен полностью");
        } else {
            System.out.println("В грузовике ещё есть место");
        }
    }
    public void rebrand (String company)
    {
        this.company = company;
    }

    public void unloadCargo() {
        currCargoWeight = 0;
        cargoName = "non-def";
        System.out.println("Груз выгружен.");
    }

    public void checkCargoStatus() {
        System.out.println("Текущий груз: " + currCargoWeight + " кг из " + cargoCapacity + " кг");
        System.out.println("Тип груза: " + cargoName);
    }

    // Геттеры и сеттеры
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getCurrCargoWeight() {
        return currCargoWeight;
    }


    public String getCompany() {
        return company;
    }

    public boolean isLoaded() {
        return isLoaded;
    }
}