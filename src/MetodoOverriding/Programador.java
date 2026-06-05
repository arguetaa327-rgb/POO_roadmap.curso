package MetodoOverriding;

public class Programador extends Empleado {

    @Override
    public void trabajar() {
        System.out.println("El programador está desarrollando software.");
    }
}