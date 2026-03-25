package org.checkout.patterns._00_smell_antipatrones;

public class _003_NotificationService {
    public void send(String type, String message) {
        if ("EMAIL".equals(type)) {
            System.out.println("Enviando EMAIL: " + message);
        } else if ("SMS".equals(type)) {
            System.out.println("Enviando SMS: " + message);
        } else if ("WHATSAPP".equals(type)) {
            System.out.println("Enviando WHATSAPP: " + message);
        } else {
            throw new IllegalArgumentException("Canal no soportado");
        }
    }
}