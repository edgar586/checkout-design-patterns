package org.checkout.patterns._02_creational.factory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderiza botón en aplicación Windows.");
    }

    @Override
    public void onClick() {
        System.out.println("Botón click en aplicación Windows!");
    }
}
