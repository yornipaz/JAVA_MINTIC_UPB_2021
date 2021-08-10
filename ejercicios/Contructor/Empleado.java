package Contructor;

public class Empleado {
    protected String nombre;
    protected int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String detalles() {
        return "Nonbre : " + this.nombre + " Sueldo : " + this.sueldo;
    }

}
