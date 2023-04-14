package Clases.Tp5;

public class Moto extends Vehiculo implements Alquilable{

    //region atributos
    protected int cilindrada;
    //endregion

    //region constructor
    public Moto(String marca, String modelo, int precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    //endregion


    @Override
    public double calcularPrecioAlquiler(int dias) {
        return this.precio * (double)dias;
    }

    @Override
    public void mostrarVehiculo() {
            System.out.println("-------------------------------");
            System.out.println("| Vehiculo: Moto");
            System.out.println("| Marca: " + this.marca);
            System.out.println("| Modelo: "+ this.modelo);
            System.out.println("| Cilindrada: " + this.cilindrada);
            System.out.println("| Precio: $" + this.precio);
            System.out.println("-------------------------------");
    }
}
