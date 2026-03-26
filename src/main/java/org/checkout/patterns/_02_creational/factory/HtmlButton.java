package org.checkout.patterns._02_creational.factory;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderiza botón en página HTML.");
    }

    @Override
    public void onClick() {
        System.out.println("Botón click en página HTML!");
    }
}
