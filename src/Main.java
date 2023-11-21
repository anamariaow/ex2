public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1800, "TI785WY", "Honda", "Civic");

        System.out.println("Auto 1: " + auto1);

        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());

        auto1.setCilindrata(2000);
        System.out.println("Nuova cilindrata: " + auto1.getTarga());
    }
}