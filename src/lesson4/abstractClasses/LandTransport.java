package lesson4.abstractClasses;

abstract public class LandTransport extends Transport {
    protected int wheelsNumber;
    protected int fuelConsumption;

    public LandTransport() {
        super();
    }

    public LandTransport(int horsepower, int speedKPH, int weight, String brandName,
                         int wheelsNumber, int fuelConsumption) {
        super(horsepower, speedKPH, weight, brandName);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Land" + super.toString() +
                ", \n\t[wheelsNumber = " + getWheelsNumber() +
                ", fuelConsumption = " + getFuelConsumption() + " L/100Km";
    }
}