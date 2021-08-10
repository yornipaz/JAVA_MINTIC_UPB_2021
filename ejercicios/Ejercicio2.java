

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese Su nombre: ");
        String name = read.nextLine();
        System.out.printf("Hola %s,¿Cuantos años tienes? ", name);
        int age = read.nextInt();
        System.out.printf(String.format("%s tiene %d años", name, age));
        read.close();

    }

}