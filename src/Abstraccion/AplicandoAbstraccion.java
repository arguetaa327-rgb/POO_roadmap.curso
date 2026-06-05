package Abstraccion;

public class AplicandoAbstraccion {

    public static void ejecutar() {

        System.out.println("\n=== ABSTRACCIÓN ===");

        Perro perro = new Perro("Max");

        perro.mostrarNombre();
        perro.hacerSonido();
    }
}