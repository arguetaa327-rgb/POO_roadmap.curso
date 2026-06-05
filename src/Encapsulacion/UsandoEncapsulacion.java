package Encapsulacion;

public class UsandoEncapsulacion {

    public static void ejecutar() {

        System.out.println("\n=== ENCAPSULACIÓN ===");

        Estudiante estudiante = new Estudiante("Yuliana", 90);

        estudiante.mostrarDatos();

        estudiante.setNota(95);

        System.out.println("\nDespués de modificar la nota:");

        estudiante.mostrarDatos();
    }
}