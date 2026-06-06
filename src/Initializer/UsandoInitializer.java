package Initializer;

public class UsandoInitializer {

    public static void ejecutar() {

        System.out.println("\n=== INITIALIZER BLOCK ===");

        InicializadorDemo objeto1 = new InicializadorDemo();
        objeto1.mostrarMensaje();

        System.out.println();

        InicializadorDemo objeto2 = new InicializadorDemo();
        objeto2.mostrarMensaje();
    }
}