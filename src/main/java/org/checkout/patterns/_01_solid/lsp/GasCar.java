package org.checkout.patterns._01_solid.lsp;

public class GasCar implements FuelVehicle {
    @Override
    public void refuel() {
        System.out.println("Recargando gasolina...");
    }
}
