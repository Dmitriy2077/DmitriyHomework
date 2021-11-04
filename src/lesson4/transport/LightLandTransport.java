package lesson4.transport;

import lesson4.abstractClasses.LandTransport;

public class LightLandTransport extends LandTransport {
    protected String carType;
    protected int passengerCapacity;

    public LightLandTransport() {
        super();
    }

    public LightLandTransport(int horsepower, int speedKPH, int weight, String brandName,
                              int wheelsNumber, int fuelConsumption,
                              String carType, int passengerCapacity) {
        super(horsepower, speedKPH, weight, brandName, wheelsNumber, fuelConsumption);
        this.carType = carType;
        this.passengerCapacity = passengerCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void certainTimeResourceConsumption (float consumptionTime) {
        float distance = consumptionTime * getSpeedKPH();
        float fuel = fuelConsumption(distance);

        System.out.println("*-**-*\nЗа время " + consumptionTime + " ч, автомобиль " + getBrandName() + " двигаясь с максимальной\n" +
                "скоростью " + getSpeedKPH() + " км/ч проедет " + distance + " км и израсходует " + fuel + " литров топлива.");
    }

    private float fuelConsumption (float distance) {
        return distance / 100f * getFuelConsumption();
    }

    @Override
    public String toString() {
        return "Light" + super.toString() +
                ", \n\t\t[carType = '" + getCarType() + '\'' +
                ", passengerCapacity = " + getPassengerCapacity() + "]]].";
    }
}