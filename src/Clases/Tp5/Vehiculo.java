package Clases.Tp5;

public abstract class Vehiculo {

    //region atributos
    protected String marca;
    protected String modelo;
    protected int precio;
    //endregion

    //region constructor
    public Vehiculo(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    //endregion

}
