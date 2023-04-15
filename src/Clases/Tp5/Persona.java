package Clases.Tp5;

import java.util.ArrayList;

public class Persona implements Comparable <Persona> {

    //region atributos
    private String nombre;
    private int edad;
    private String dni;
    //endregion

    //region S y G

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    //endregion

    //region constructor

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    //endregion


    @Override
    public int compareTo(Persona persona2) {
        int menor;

        if (this.edad <= persona2.getEdad()){
            return this.edad;
        } else {
            return persona2.getEdad();
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre:'" + nombre + '\'' +
                ", edad:" + edad +
                ", dni:'" + dni + '\'' +
                '}';
    }
}
