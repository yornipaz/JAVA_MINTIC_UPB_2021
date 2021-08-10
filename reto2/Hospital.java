import java.util.ArrayList;

public class Hospital {
    private String nombre;
    ArrayList<Empleado> empleados = new ArrayList<>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static double liquidarNominaEmpleado(Empleado empleado) {
        int salario = empleado.getSalario();
        double aporte = salario * .08;

        double nomina = salario - aporte;

        return nomina;
    }

    public static double liquidarSaludEmpleado(Empleado empleado) {
        int salario = empleado.getSalario();
        double salud = salario * 0.085;
        double pension = salario * 0.12;
        double riesgosLaborales = salario * 0.00522;
        double liquidacion = salud + pension + riesgosLaborales;
        return liquidacion;
    }

    public static double liquidarPrestacionesEmpleado(Empleado empleado) {
        int salario = empleado.getSalario();
        double primas = salario * 0.0833;
        double cesantias = salario * 0.0833;
        double interesesCesantias = cesantias * .12;
        double vacaciones = salario * 0.0416;
        double liquidar = primas + cesantias + interesesCesantias + vacaciones;
        return liquidar;

    }

    public static double liquidarParafiscalesEmpleado(Empleado empleado) {
        int salario = empleado.getSalario();
        double cajaCompensacion = salario * 0.04;
        double ICBF = salario * 0.03;
        double SENA = salario * 0.02;

        double liquidar = cajaCompensacion + ICBF + SENA;

        return liquidar;

    }

}
