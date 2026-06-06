package ExceptionHandling;

public class UsandoException {

    public static void ejecutar() {

        System.out.println("\n=== EXCEPTION HANDLING ===");

        Calculadora calculadora = new Calculadora();

        calculadora.dividir(20, 5);

        System.out.println();

        calculadora.dividir(20, 0);
    }
}