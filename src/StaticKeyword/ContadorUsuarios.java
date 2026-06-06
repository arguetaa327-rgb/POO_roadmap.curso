package StaticKeyword;

public class ContadorUsuarios {

    private String nombre;

    // Variable estática
    private static int totalUsuarios = 0;

    public ContadorUsuarios(String nombre) {
        this.nombre = nombre;
        totalUsuarios++;
    }

    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombre);
    }

    // Método estático
    public static void mostrarTotalUsuarios() {
        System.out.println("Total de usuarios creados: " + totalUsuarios);
    }
}