package Encapsulamiento;

import java.util.Scanner;

public class Bodega {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Producto p1 = new Producto(1233, 13324.32, 123, 345);
        System.out.println(p1.solicitarProdutos());
        read.close();
    }

}
