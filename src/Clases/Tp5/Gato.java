package Clases.Tp5;

public class Gato extends Animal {

private String pelaje;

    public Gato(String nombre, int edad, float peso, String pelaje) {
        super(nombre, edad, peso);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "pelaje='" + pelaje + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}
