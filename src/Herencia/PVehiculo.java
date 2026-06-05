package Herencia;

public class PVehiculo {

    protected String marca;

    public PVehiculo(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}