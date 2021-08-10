package Interfaces;

public class Samsung extends Telefono implements GPS, Camara {

    public Samsung(String marca, String modelo) {
        super(marca, modelo);

    }

    @Override
    public void prenderFlash() {
        System.out.println("Prender el Flash del Samsung");

    }

    @Override
    public void apagarFlash() {
        System.out.println("Apagar el Flash del Samsung");

    }

    @Override
    public void selecionarVista() {
        System.out.println("Selecionar vista del Samsung");
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obtener coordenadas del Samsung");

    }

    @Override
    public void buscarDireccion() {
        System.out.println("Buscar la dirreccion del Samsung");

    }

    @Override
    public void imprimir() {
        System.out.println("Metodo imprimir de clase Telefono en la clase  Samsung");
    }

}
