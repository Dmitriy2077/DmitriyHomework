package lesson4.abstractClasses;

abstract public class AirTransport extends Transport {
    private int wingspan;
    private int runwayLength;

    public AirTransport() {
        super();
    }

    public AirTransport(int horsepower, int speedKPH, int weight, String brandName,
                        int wingspan, int runwayLength) {
        super(horsepower, speedKPH, weight, brandName);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    @Override
    public String toString() {
        return "Air" + super.toString() +
                ", \n\t[wingspan = " + getWingspan() +
                " M, runwayLength = " + getRunwayLength() + " M";
    }
}