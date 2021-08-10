package Contructor;

public class Gerente extends Empleado {
    private String departamento = "";

    public Gerente(String nombre, int sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String detalles() {
        return super.detalles() + " , Departamento : " + this.departamento;

    }

}
