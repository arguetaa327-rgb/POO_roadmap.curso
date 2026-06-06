package POO;

public class Computadora {

    private String marca;
    private int memoriaRam;

    public Computadora(String marca, int memoriaRam) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Memoria RAM: " + memoriaRam + " GB");
    }
}