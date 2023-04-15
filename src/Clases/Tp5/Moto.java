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
        return precio * (double)dias;
    }

    @Override
    public void mostrarVehiculo() {
            System.out.println("-------------------------------");
            System.out.println("| Vehiculo: Moto");
            System.out.println("| Marca: " + marca);
            System.out.println("| Modelo: "+ modelo);
            System.out.println("| Cilindrada: " + cilindrada);
            System.out.println("| Precio: $" + precio);
            System.out.println("-------------------------------");
    }
}
