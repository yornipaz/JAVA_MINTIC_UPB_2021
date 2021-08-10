package Contructor;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Felipe", 30000, "Sistemas");
        System.out.println("Genrente " + gerente.detalles());
    }

}
