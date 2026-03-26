package org.checkout.patterns._02_creational.builder;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo de carro: " + carType + "\n";
        info += "Número de asientos: " + seats + "\n";
        info += "Motor: volumen - " + engine.getVolume() + "; kilometraje - " + engine.getMileage() + "\n";
        info += "Transmision: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Computadora de viaje: Funccional" + "\n";
        } else {
            info += "Computadora de viaje: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "Navegador GPS: Funccional" + "\n";
        } else {
            info += "Navegador GPS: N/A" + "\n";
        }
        return info;
    }

}
