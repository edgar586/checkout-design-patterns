package org.checkout.patterns._00_smell_antipatrones;

public class _004_RepeatedEmailValidation {
}
class UserService {
    public void register(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        System.out.println("Usuario registrado");
    }
}

class CustomerService {
    public void createCustomer(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        System.out.println("Cliente creado");
    }
}

class SupplierService {
    public void createSupplier(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        System.out.println("Proveedor creado");
    }
}