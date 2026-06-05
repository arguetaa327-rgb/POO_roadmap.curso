package Abstraccion;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public abstract void hacerSonido();
}