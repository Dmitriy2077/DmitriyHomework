package lesson4.transport;

import lesson4.abstractClasses.LandTransport;

public class CargoLandTransport extends LandTransport {
    protected int carryingCapacity;

    public CargoLandTransport() {
        super();
    }

    public CargoLandTransport(int horsepower, int speedKPH, int weight, String brandName,
                              int wheelsNumber, int fuelConsumption,
                              int carryingCapacity) {
        super(horsepower, speedKPH, weight, brandName, wheelsNumber, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void cargoLoading (int cargoWeight) {
        if (cargoWeight > getCarryingCapacity())
            System.out.println("-----" + cargoWeight + " > " + getCarryingCapacity() + "-----You need a bigger truck!!!");
        else
            System.out.println("-----" + cargoWeight + "-----Truck loaded!!!");
    }

    @Override
    public String toString() {
        return "Cargo" + super.toString() +
                ", \n\t\t[carryingCapacity = " + getCarryingCapacity() + " T]]].";
    }
}