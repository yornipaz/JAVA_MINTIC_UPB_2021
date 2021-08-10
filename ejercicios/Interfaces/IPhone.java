package Interfaces;

public class IPhone extends Telefono implements GPS, Camara {

    public IPhone(String marca, String modelo, String serial, String numeroTelefono) {
        super(marca, modelo, serial, numeroTelefono);

    }

    @Override
    public void prenderFlash() {
        System.out.println("Prender el Flash del IPhone");

    }

    @Override
    public void apagarFlash() {
        System.out.println("Apagar el Flash del IPhone");

    }

    @Override
    public void selecionarVista() {
        System.out.println("Selecionar vista del IPhone");
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obtener coordenadas del IPhone");

    }

    @Override
    public void buscarDireccion() {
        System.out.println("Buscar la dirreccion del IPhone");

    }

    @Override
    public void imprimir() {
        System.out.println("Metodo imprimir de clase Telefono en la clase  IPhone");
    }
}