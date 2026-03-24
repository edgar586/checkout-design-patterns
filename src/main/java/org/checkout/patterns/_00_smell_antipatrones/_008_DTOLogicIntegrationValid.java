package org.checkout.patterns._00_smell_antipatrones;

public class _008_DTOLogicIntegrationValid {

        private String name;
        private String email;
        private String address;

        public void validate() {
            System.out.println("Validando datos...");
        }

        public void save() {
            System.out.println("Guardando cliente...");
        }

        public void syncWithCRM() {
            System.out.println("Sincronizando con CRM...");
        }

        public void sendPromotionEmail() {
            System.out.println("Enviando promoción...");
        }

        public void printSummary() {
            System.out.println("Imprimiendo resumen...");
        }
}
