package Interfaces;

public class Avion implements Volador {

    private String modelo;

    public Avion(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void volar() {
        System.out.println(modelo + " está volando.");
    }
}