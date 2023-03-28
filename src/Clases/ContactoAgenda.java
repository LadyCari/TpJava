package Clases;

public class ContactoAgenda {

    //region atributos
    private String nombre;
    private int numero;
    private String email;
    //endregion

    //region constructor vacio
    public ContactoAgenta(String nombreContacto, int numeroContacto, String emailContacto) {
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;
        this.emailContacto = emailContacto;
    }
    //endregion

    //region G y S

    public String getNombreContacto() {
        return nombreContacto;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    //endregion

}
