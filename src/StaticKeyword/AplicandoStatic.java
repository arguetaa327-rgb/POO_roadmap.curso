package StaticKeyword;

public class AplicandoStatic {

    public static void ejecutar() {

        System.out.println("\n=== STATIC KEYWORD ===");

        ContadorUsuarios usuario1 = new ContadorUsuarios("Carlin");
        ContadorUsuarios usuario2 = new ContadorUsuarios("Jose");
        ContadorUsuarios usuario3 = new ContadorUsuarios("Yuliana");

        usuario1.mostrarUsuario();
        usuario2.mostrarUsuario();
        usuario3.mostrarUsuario();

        ContadorUsuarios.mostrarTotalUsuarios();
    }
}