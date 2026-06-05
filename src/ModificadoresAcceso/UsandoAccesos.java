package ModificadoresAcceso;

public class UsandoAccesos {

	    public static void ejecutar() {

	        System.out.println("\n=== PRUEBA DE MODIFICADORES DE ACCESO ===");

	        ControlAcceso acceso = new ControlAcceso();

	        System.out.println("\n--- Acceso desde la misma clase principal ---");

	        // privado mediante getter
	        System.out.println("Dato privado: " + acceso.getDatoPrivado());

	        // default
	        System.out.println("Dato default: " + acceso.datoDefault);

	        // protected
	        System.out.println("Dato protegido: " + acceso.datoProtegido);

	        // public
	        System.out.println("Dato público: " + acceso.datoPublico);

	        acceso.visualizarDatos();
	    }
	}
