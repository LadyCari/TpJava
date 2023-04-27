package Clases.Tp5;

public abstract class Animal implements Comparable <Animal>{

    //region atributos

    protected String nombre;
    protected int edad;
    protected float peso;

    //endregion


    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Animal o) {
        if (this.getPeso() == o.getPeso()){
            return  0;
        } else if (this.getPeso() < o.getPeso()) {
            return -1;
        }else {
            return 1;
        }
    }
}
