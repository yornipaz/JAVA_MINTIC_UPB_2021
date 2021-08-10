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
        double aporte = empleado.getSalario() * .08;

        double nomina = empleado.getSalario() - aporte;

        return nomina;
    }

    public static double liquidarSaludEmpleado(Empleado empleado) {
        double salud = empleado.getSalario() * 0.085;
        double pension = empleado.getSalario() * 0.12;
        double riesgosLaborales = empleado.getSalario() * 0.00522;
        double liquidacion = salud + pension + riesgosLaborales;
        return liquidacion;
    }

}
