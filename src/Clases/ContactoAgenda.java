package Clases;

public class ContactoAgenda {

    //region atributos
    private String nombre;
    private int numero;
    private String email;
    //endregion

    //region constructores

    public ContactoAgenda() {
    }

    public ContactoAgenda(String nombreContacto, int numeroContacto, String emailContacto) {
        this.nombre = nombreContacto;
        this.numero = numeroContacto;
        this.email = emailContacto;
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

    public void setNombreContacto(String nombreContacto) {
        this.nombre = nombre;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numero = numero;
    }

    public void setEmailContacto(String emailContacto) {
        this.email = email;
    }

    //endregion

}
