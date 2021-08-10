package Interfaces;

public class Inalambrico extends Telefono implements GPS, Camara {

    public Inalambrico(String marca, String modelo, String serial, String numeroTelefono) {
        super(marca, modelo, serial, numeroTelefono);

    }

    @Override
    public void prenderFlash() {
        System.out.println("Prender el Flash del Inalambrico");

    }

    @Override
    public void apagarFlash() {
        System.out.println("Apagar el Flash del Inalambrico");

    }

    @Override
    public void selecionarVista() {
        System.out.println("Selecionar vista del Inalambrico");
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obtener coordenadas del Inalambrico");

    }

    @Override
    public void buscarDireccion() {
        System.out.println("Buscar la dirreccion del Inalambrico");

    }

    @Override
    public void imprimir() {
        System.out.println("Metodo imprimir de clase Telefono en la clase  Inalambrico");
    }
}
