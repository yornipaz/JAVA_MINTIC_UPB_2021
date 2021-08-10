
import java.util.*;

public class Calculadora {
    public static void main(String[] args) {
        boolean bandera = true;
        var resultado=0.0;
        List<String> Menu = new ArrayList<String>();
        Menu.add("Suma");
        Menu.add("Resta");
        Menu.add("Multiplicacion");
        Menu.add("división");
        Menu.add("residuo");
        Menu.add("Salir");
        System.out.println("Menu de la calculadora ");
        
       Scanner leer = new Scanner(System.in);
       while (bandera){

           imprimirMenu(Menu);
           System.out.println("Digite la opcion a realizar : ");
           int opcion = leer.nextInt();
           System.out.println("Digite El primer numero : ");
           double primero = leer.nextDouble();
           System.out.println("Digite El segundo numero : ");
           double segundo = leer.nextDouble();
           leer.close();


           switch(opcion){
                case 1:
                resultado=sumar(primero,segundo);
                System.out.println("La suma de los dos valores es : "+ resultado);
                break; 
                case 2:
                resultado = restar(primero, segundo);
                System.out.println("La resta de los dos valores es : " + resultado);
                break;  
                case 3:
                resultado = multiplicar(primero, segundo);
                System.out.println("La multiplicacion de los dos valores es : " + resultado);
                break;
                case 4:
                resultado = dividir(primero, segundo);
                System.out.println("La divicion de los dos valores es : " + resultado);
                break;
                case 5:
                resultado = residuo(primero, segundo);
                System.out.println("El residuo de los dos valores es : " + resultado);
                break;
                case 6:
                bandera=false;
                break;
            
                
                


           }

       }


    }

    public static void imprimirMenu(List<String> listaMenu) {

        for (int i = 0; i < listaMenu.size(); i++) {
            System.out.println((i + 1) + " . " + listaMenu.get(i));

        }
    }

    public static double sumar(double val1, double val2){

        return val1 + val2;
    }
    
    public  static double restar(double val1, double val2) {

        return val1 - val2;
    }
    
     public static double multiplicar(double val1, double val2) {

        return val1 * val2;
    }
    
     public static double dividir(double val1, double val2) {

        return val1 / val2;
    }
    
    public static double residuo(double val1, double val2) {

        return val1 % val2;
    }

}