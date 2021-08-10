package Interfaces;

public class Principal {
    public static void main(String[] args) {
        Telefono tels[] = new Telefono[4];
        tels[0] = new IPhone("Apple", "iphone 7", "VNDHD3", "3443444542");
        tels[1] = new Samsung("Sansumg", "Galaxy 20");
        tels[2] = new IPhone("Apple", "iphone 12", "MYD34F", "3002442545");
        tels[3] = new Inalambrico("HTC", "365", "MQLD9F", "323442545");

        for (int i = 0; i < tels.length; i++) {
            System.out.println("__________________________________________");
            System.out.println("marca del telefono " + tels[i].getMarca());
            if (tels[i] instanceof IPhone) {
                IPhone iphone = (IPhone) tels[i];
                iphone.obtenerCoordenadas();
                iphone.imprimir();

            } else if (tels[i] instanceof Samsung) {
                Samsung s = (Samsung) tels[i];
                s.obtenerCoordenadas();
                s.imprimir();
            } else {
                System.out.println("No es ni IPhone ni Samsung");
            }
        }

    }
}
