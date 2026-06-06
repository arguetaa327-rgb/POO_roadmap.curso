package Initializer;

public class InicializadorDemo {

    static {
        System.out.println("Bloque static: se ejecuta una sola vez");
    }

    {
        System.out.println("Bloque initializer: se ejecuta al crear un objeto");
    }

    public InicializadorDemo() {
        System.out.println("Constructor: se ejecuta después del bloque initializer");
    }

    public void mostrarMensaje() {
        System.out.println("Objeto creado correctamente");
    }
}