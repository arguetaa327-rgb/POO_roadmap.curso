package ProyectoPOO;

import Abstraccion.AplicandoAbstraccion;
import Encapsulacion.UsandoEncapsulacion;
import ExceptionHandling.UsandoException;
import Herencia.AplicandoHerencia;
import Initializer.UsandoInitializer;
import Interfaces.UsandoInterfaces;
import MetodoOverriding.UsandoOverriding;
import ModificadoresAcceso.UsandoAccesos;
import Paquetes.UsandoPaquetes;
import S1Enums.UsandoEnum;
import StaticKeyword.AplicandoStatic;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" PROYECTO ROADMAP JAVA - POO ");
        System.out.println("================================");

        UsandoAccesos.ejecutar();
        UsandoPaquetes.ejecutar();
        UsandoEnum.ejecutar();
        AplicandoStatic.ejecutar();
        UsandoInitializer.ejecutar();
        UsandoEncapsulacion.ejecutar();
        AplicandoHerencia.ejecutar();
        AplicandoAbstraccion.ejecutar();
        UsandoInterfaces.ejecutar();
        UsandoOverriding.ejecutar();
        UsandoException.ejecutar();

        System.out.println("\nPrograma finalizado correctamente.");
    }
}