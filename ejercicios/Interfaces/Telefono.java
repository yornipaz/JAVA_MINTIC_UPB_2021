package Interfaces;

public abstract class Telefono {
    protected String marca;
    protected String modelo;
    protected String serial;
    protected String numeroTelefono;

    public Telefono(String marca, String modelo, String serial, String numeroTelefono) {
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.numeroTelefono = numeroTelefono;
    }

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void imprimir();

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

}
