package org.checkout.patterns._02_creational.factory;

public class MobileButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderiza botón en aplicación móvil.");
    }

    @Override
    public void onClick() {
        System.out.println("Botón click en aplicación móvil!");
    }
}
