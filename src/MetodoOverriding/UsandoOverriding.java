package MetodoOverriding;

public class UsandoOverriding {

    public static void ejecutar() {

        System.out.println("\n=== METHOD OVERRIDING ===");

        Empleado empleado = new Empleado();
        empleado.trabajar();

        Programador programador = new Programador();
        programador.trabajar();
    }
}