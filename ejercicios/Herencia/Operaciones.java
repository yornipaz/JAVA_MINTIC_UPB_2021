package Herencia;

import java.util.Scanner;

public class Operaciones {
    protected int valorUno;
    protected int valorDos;
    protected int resultado;
    Scanner read = new Scanner(System.in);

    public void pedirDatos() {
        System.out.println(" Ingrese el primer valor :");
        valorUno = read.nextInt();
        System.out.println(" Ingrese el segundo valor : ");
        valorDos = read.nextInt();
        read.close();
    }

    public int mostrarResultado() {
        return resultado;
    }

}
