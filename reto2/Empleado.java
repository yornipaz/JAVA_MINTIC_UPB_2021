
public class Empleado {
    private int id;
    private String nombre;
    private String tipoContrato;
    private int salario;

    public Empleado(String nombre, String tipoContrato, int salario) {

        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.salario = salario;

    }

    /** Metodos getter y setter de la clase empleado */
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

}
