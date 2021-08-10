package Herencia;

public class Principal {
    public static void main(String[] args) {
        Suma sum = new Suma();
        System.out.println("Ingrese los datos de la suma :");
        sum.pedirDatos();

        System.out.println("El resultado de la suma de los resultados es : " + sum.sumar());
    }

}
