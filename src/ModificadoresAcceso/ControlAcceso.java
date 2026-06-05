package ModificadoresAcceso;

public class ControlAcceso {

    private String datoPrivado = "Acceso Privado";
    String datoDefault = "Acceso por Defecto";
    protected String datoProtegido = "Acceso Protegido";
    public String datoPublico = "Acceso Público";

    public void visualizarDatos() {

        System.out.println("=== MOSTRANDO MODIFICADORES ===");
        System.out.println(datoPrivado);
        System.out.println(datoDefault);
        System.out.println(datoProtegido);
        System.out.println(datoPublico);
    }

    public String getDatoPrivado() {
        return datoPrivado;
    }
}