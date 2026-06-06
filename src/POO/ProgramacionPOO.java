package POO;

public class ProgramacionPOO {

    public static void ejecutar() {

        System.out.println("\n=== PROGRAMACIÓN ORIENTADA A OBJETOS ===");

        Computadora pc1 = new Computadora("Dell", 16);
        Computadora pc2 = new Computadora("HP", 8);

        pc1.mostrarDatos();

        System.out.println();

        pc2.mostrarDatos();
    }
}