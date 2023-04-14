package Clases.Tp2;

public class ContactoAgenda {

    //region atributos
    private String nombre;
    private int numero;
    private String email;
    //endregion

    //region constructores


    public ContactoAgenda() {
    }

    public ContactoAgenda(String nombre, int numero, String email) {
        this.nombre = nombre;
        this.numero = numero;
        this.email = email;
    }

    //endregion

    //region G y S

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//endregion

}
