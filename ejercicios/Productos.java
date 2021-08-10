
import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("digite el numero de productos : ");
        int cantidadProductos = Integer.parseInt(read.nextLine());
        int listaCodigo[] = new int[cantidadProductos];
        int listaCantidadBodega[] = new int[cantidadProductos];
        int listaCantidadMinima[] = new int[cantidadProductos];
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("digite el codigo del producto " + (i + 1));
            listaCodigo[i] = read.nextInt();
            System.out.println("digite la cantidad de bodega : " + (i + 1));
            listaCantidadBodega[i] = read.nextInt();
            System.out.println("digite la cantidad de minima requerida : " + (i + 1));
            listaCantidadMinima[i] = read.nextInt();

        }

        System.out.println("codigos de los productos necearios solicitar : ");
        int mayor = -1, cMayor = 0, menor = 100000, cMenor = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            if (listaCantidadBodega[i] < listaCantidadMinima[i]) {
                System.out.println(listaCodigo[i]);
            }
            if (listaCantidadBodega[i] < menor) {
                menor = listaCantidadBodega[i];
                cMenor = listaCodigo[i];

            }
            if (listaCantidadBodega[i] > mayor) {
                mayor = listaCantidadBodega[i];
                cMayor = listaCodigo[i];

            }
        }
        System.out.println("codigos con mayor numero de unidades en bodega " + cMayor);
        System.out.println("codigos con menor numero de unidades en bodega " + cMenor);
        read.close();

    }

}
