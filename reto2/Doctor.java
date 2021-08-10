
public class Doctor extends Empleado {
    private String especialidad;

    public Doctor(String nombre, String tipoContrato, int salario, String especialidad) {
        super(nombre, tipoContrato, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
