package Sobrecarga;

public class Taxi extends Vehiculo {
    private boolean AA;

    public Taxi(boolean AA) {
        super();
        this.AA = AA;
    }

    public Taxi(String matricula, boolean AA) {
        super(matricula);
        this.AA = AA;
    }

    public Taxi(String matricula, int numeroSilla, boolean AA) {
        super(matricula, numeroSilla);
        this.AA = AA;
    }

    public boolean isAA() {
        return this.AA;
    }

    public boolean getAA() {
        return this.AA;
    }

    public void setAA(boolean AA) {
        this.AA = AA;
    }

}
