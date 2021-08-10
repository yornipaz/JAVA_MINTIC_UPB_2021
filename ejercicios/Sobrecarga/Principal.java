package Sobrecarga;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        char resp;
        boolean aa;
        int numSilla;
        int sillaAdic;

        Scanner scanner = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo();
        System.out.println("Vehiculo con placas ," + v1.getMatricula() + " tiene " + v1.getNumeroSilla() + " Sillas");
        Vehiculo v2 = new Vehiculo("DHD47G");
        System.out.println("Vehiculo con placas ," + v2.getMatricula() + " tiene " + v2.getNumeroSilla() + " Sillas");
        Vehiculo v3 = new Vehiculo("LJBG67", 25);
        System.out.println("Vehiculo con placas ," + v3.getMatricula() + " tiene " + v3.getNumeroSilla() + " Sillas");

        System.out.println("Primer Taxi:¿ Tiene aire acondicionado?(S/N): ");
        resp = scanner.next().charAt(0);
        aa = resp == 'S' || resp == 's';
        Taxi t1 = new Taxi(aa);
        System.out.printf("El primer Taxi con matricula %s tiene %d silla y %s%n", t1.getMatricula(),
                t1.getNumeroSilla(), (t1.isAA() ? "Tiene AA" : "No tiene AA"));
    }
}
