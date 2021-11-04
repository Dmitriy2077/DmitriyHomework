package lesson4.transport;

import lesson4.abstractClasses.AirTransport;

public class CivilAirTransport extends AirTransport {
    protected int passengerCapacity;
    protected boolean businessClass;

    public CivilAirTransport() {
        super();
    }

    public CivilAirTransport(int horsepower, int speedKPH, int weight, String brandName,
                             int wingspan, int runwayLength,
                             int passengerCapacity, boolean businessClass) {
        super(horsepower, speedKPH, weight, brandName, wingspan, runwayLength);
        this.passengerCapacity = passengerCapacity;
        this.businessClass = businessClass;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void airplaneLoading (int passengers) {
        if (passengers > getPassengerCapacity())
            System.out.println("-----" + passengers + " > " + getPassengerCapacity() + "-----You need a bigger airplane!!!");
        else
            System.out.println("-----" + passengers + "-----Airplane loaded!!!");
    }

    @Override
    public String toString() {
        return "Civil" + super.toString() +
                ", \n\t\t[passengerCapacity = " + getPassengerCapacity() +
                ", businessClass = " + isBusinessClass() + "]]].";
    }
}