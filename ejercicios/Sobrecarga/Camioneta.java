package Sobrecarga;

public class Camioneta extends Vehiculo {
    private int sillasAdicionales;
    private boolean AA;

    public Camioneta(String matricula, int numeroSilla, boolean AA) {
        super(matricula, numeroSilla);
        this.AA = AA;

    }

    public int getSillasAdicionales() {
        return this.sillasAdicionales;
    }

    public void setSillasAdicionales(int sillasAdicionales) {
        this.sillasAdicionales = sillasAdicionales;
    }

    public boolean getAA() {
        return this.AA;
    }

    public void setAA(boolean AA) {
        this.AA = AA;
    }

    @Override
    public int getNumeroSilla() {
        int numeroSilla = super.getNumeroSilla() + sillasAdicionales;
        return numeroSilla;
    }

}
