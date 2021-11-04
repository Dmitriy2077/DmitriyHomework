package lesson4.transport;

import lesson4.abstractClasses.AirTransport;

public class MilitaryAirTransport extends AirTransport {
    protected boolean bailoutSystem;
    protected int rocketsNumber;

    public MilitaryAirTransport() {
        super();
    }

    public MilitaryAirTransport(int horsepower, int speedKPH, int weight, String brandName,
                                int wingspan, int runwayLength,
                                boolean bailoutSystem, int rocketsNumber) {
        super(horsepower, speedKPH, weight, brandName, wingspan, runwayLength);
        this.bailoutSystem = bailoutSystem;
        this.rocketsNumber = rocketsNumber;
    }

    public boolean isBailoutSystem() {
        return bailoutSystem;
    }

    public void setBailoutSystem(boolean bailoutSystem) {
        this.bailoutSystem = bailoutSystem;
    }

    public int getRocketsNumber() {
        return rocketsNumber;
    }

    public void setRocketsNumber(int rocketsNumber) {
        this.rocketsNumber = rocketsNumber;
    }

    public void rocketShot() {
        if (getRocketsNumber() > 0) {
            setRocketsNumber(getRocketsNumber() - 1);
            System.out.println("----------The rocket is on the way ...");
        } else
            System.out.println("----------No ammunition!!!");
    }

    public void bailOut() {
        if (isBailoutSystem()){
            System.out.println("----------The bailout was successful!!!");
            setBailoutSystem(false);
        }
        else
            System.out.println("----------You don't have this system!!!");
    }

    @Override
    public String toString() {
        return "Military" + super.toString() +
                ", \n\t\t[bailoutSystem = " + isBailoutSystem() +
                ", rocketsNumber = " + getRocketsNumber() + "]]].";
    }
}