package Encapsulamiento;

public class Producto {
    private int codigo;
    private double precioComprado;
    private int cantidadBodega;
    private int catidadMinimaRequerida;

   

    public Producto(int codigo, double precioComprado, int cantidadBodega, int catidadMinimaRequerida) {
        this.codigo = codigo;
        this.precioComprado = precioComprado;
        this.cantidadBodega = cantidadBodega;
        this.catidadMinimaRequerida = catidadMinimaRequerida;
    }

    public boolean solicitarProdutos() {
        if(cantidadBodega<catidadMinimaRequerida){
            return true;
        }else{
            return false;
        }

    }
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioComprado() {
        return this.precioComprado;
    }

    public void setPrecioComprado(double precioComprado) {
        this.precioComprado = precioComprado;
    }

    public int getCantidadBodega() {
        return this.cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCatidadMinimaRequerida() {
        return this.catidadMinimaRequerida;
    }

    public void setCatidadMinimaRequerida(int catidadMinimaRequerida) {
        this.catidadMinimaRequerida = catidadMinimaRequerida;
    }
    
}
