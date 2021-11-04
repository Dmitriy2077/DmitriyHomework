package lesson4.app;

import lesson4.transport.CargoLandTransport;
import lesson4.transport.CivilAirTransport;
import lesson4.transport.LightLandTransport;
import lesson4.transport.MilitaryAirTransport;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(5, 12, 200, "military", 302, 500, true, 15);
        CivilAirTransport civilAirTransport = new CivilAirTransport(10, 182, 2000, "civil", 30, 900, 250, true);
        CargoLandTransport cargoLandTransport = new CargoLandTransport(15, 256, 1200, "cargo", 8, 30, 700);
        LightLandTransport lightLandTransport = new LightLandTransport(30, 230, 600, "light", 6, 8, "mini", 8);

        System.out.println(militaryAirTransport);
        System.out.println(civilAirTransport);
        System.out.println(cargoLandTransport);
        System.out.println(lightLandTransport);

        lightLandTransport.certainTimeResourceConsumption(2.5f);

        cargoLandTransport.cargoLoading(1199);
        cargoLandTransport.cargoLoading(199);

        civilAirTransport.airplaneLoading(255);
        civilAirTransport.airplaneLoading(250);

        militaryAirTransport.rocketShot();
        militaryAirTransport.bailOut();
    }
}