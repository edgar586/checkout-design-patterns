package org.checkout.patterns._01_solid.lsp;

public class _ElectricCar extends _Vehicle {

    @Override
    public void refuel() {
        throw new UnsupportedOperationException("Un auto eléctrico no usa gasolina");
    }
}
