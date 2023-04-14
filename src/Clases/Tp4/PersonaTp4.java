package Clases.Tp4;

public abstract class PersonaTp4 {

    //region atributos

    private String nombre;
    private int edad;
    private String dni;

    //endregion

    //region S y G

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //endregion

}
