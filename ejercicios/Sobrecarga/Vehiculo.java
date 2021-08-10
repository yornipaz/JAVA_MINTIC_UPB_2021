package Sobrecarga;

public class Vehiculo {
    protected String matricula;
    protected int numeroSilla;

    public Vehiculo() {
        this.matricula = "DHGDS57R";
        this.numeroSilla = 1232;
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.numeroSilla = 3;

    }

    public Vehiculo(String matricula, int numeroSilla) {
        this.matricula = matricula;
        this.numeroSilla = numeroSilla;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroSilla() {
        return this.numeroSilla;
    }

    public void setNumeroSilla(int numeroSilla) {
        this.numeroSilla = numeroSilla;
    }

}
