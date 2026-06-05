package S1Enums;


public class UsandoEnum {

	public static void ejecutar(){


        System.out.println("\n USO DE ENUMS ");

        DiaSemana dia = DiaSemana.VIERNES;

        System.out.println("Dia seleccionado: " + dia);

        if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Es un dia laboral");
        }
    }
}