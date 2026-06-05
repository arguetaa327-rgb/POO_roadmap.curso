package Herencia;

public class HMotocicleta extends PVehiculo {

    private int cilindrada;

    public HMotocicleta(String marca, int cilindrada) {
        super(marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion() {
        mostrarMarca();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}