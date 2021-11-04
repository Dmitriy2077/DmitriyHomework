package lesson4.abstractClasses;

abstract public class Transport {
    private int horsepower;
    private int speedKPH;
    private int weight;
    private String brandName;
    private float powerKW;

    public Transport() {
    }

    public Transport(int horsepower, int speedKPH, int weight, String brandName) {
        this.horsepower = horsepower;
        this.speedKPH = speedKPH;
        this.weight = weight;
        this.brandName = brandName;
        powerWatt();
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
        powerWatt();
    }

    public int getSpeedKPH() {
        return speedKPH;
    }

    public void setSpeedKPH(int speedKPH) {
        this.speedKPH = speedKPH;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public float getPowerKW() {
        powerWatt();
        return powerKW;
    }

    private void setPowerKW(float powerKW) {
        this.powerKW = powerKW;
    }

    protected void powerWatt(){
        setPowerKW(getHorsepower() * 0.74f);
    }

    @Override
    public String toString() {
        return "Transport---------------\n[" +
                "horsepower = " + getHorsepower() +
                " Hp/H, speedKPH = " + getSpeedKPH() +
                " Km/H, weight = " + getWeight() +
                " Kg, brandName = '" + getBrandName() + '\'' +
                ", powerWatt = " + getPowerKW() + " Kw/H";
    }
}