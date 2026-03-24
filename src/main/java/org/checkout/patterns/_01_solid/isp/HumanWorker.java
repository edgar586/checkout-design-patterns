package org.checkout.patterns._01_solid.isp;

//Implementas solo lo que necesitas
public class HumanWorker implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Humano trabajando...");
    }

    @Override
    public void eat() {
        System.out.println("Humano comiendo...");
    }

    @Override
    public void sleep() {
        System.out.println("Humano durmiendo...");
    }
}
