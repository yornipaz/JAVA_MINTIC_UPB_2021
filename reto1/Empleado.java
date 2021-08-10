
public class Empleado {
    private int id;
    private String nombre;
    private String email;
    private String tipoContrato;
    private int salario;
    private String especialidad;

    public Empleado(String nombre, String email, String tipoContrato, int salario, String especialidad) {

        this.nombre = nombre;
        this.email = email;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.especialidad = especialidad;
    }

    public double liquidarSalud(Empleado empleado) {
        double salud = empleado.salario * 0.085;
        double pension = empleado.salario * 0.12;
        double riesgosLaborales = empleado.salario * 0.00522;
        double liquidacion = salud + pension + riesgosLaborales;

        return liquidacion;
    }

    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoContrato() {
        return this.tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
