

import java.util.Scanner;
public class clicloDoWhile {
    public static void main(String[] args) {
        double suma=0.0,promo=0.0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero : " );
        double varlor=read.nextDouble();
        int cont=0;

        do{
            suma+=varlor;
            cont++;
            System.out.println("Ingrese un numero : ");
            varlor=read.nextDouble();



        }while(varlor != -1);
        promo=suma/cont;
        System.out.println("El Promedio es : %.2f"+promo);
        read.close();
    }
}
