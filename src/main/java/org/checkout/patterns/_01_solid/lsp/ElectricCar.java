package org.checkout.patterns._01_solid.lsp;

public class ElectricCar implements ElectricVedhicle {
    @Override
    public void charge() {
        System.out.println("Cargando bateria...");
    }
}
