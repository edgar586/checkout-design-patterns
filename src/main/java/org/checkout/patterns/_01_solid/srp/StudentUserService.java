package org.checkout.patterns._01_solid.srp;

public class StudentUserService {
    public void validateUser(String name, String email) {
        System.out.println("Validando usuario...");
    }

    public void saveUser(String name, String email) {
        System.out.println("Guardando usuario...");
    }

    public void sendWelcomeEmail(String email) {
        System.out.println("Enviando correo de bienvenida...");
    }

}
