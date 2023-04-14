package Clases.Tp5;

public class Coche extends Vehiculo implements Alquilable{

    //region atributos
    protected int numPuertas;
    //endregion

    //region constructor
    public Coche(String marca, String modelo, int precio, int numPuertas) {
        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
    }
    //endregion

//region metodos
    @Override
    public double calcularPrecioAlquiler(int dias) {
        return this.precio * (double)dias;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("-------------------------------");
        System.out.println("| Vehiculo: Auto");
        System.out.println("| Marca: " + this.marca);
        System.out.println("| Modelo: "+ this.modelo);
        System.out.println("| Puertas: " + this.numPuertas);
        System.out.println("| Precio: $" + this.precio);
        System.out.println("-------------------------------");
    }

    //endregion
}
