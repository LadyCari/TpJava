package Clases;
public class Vuelo {

    //region atributos
    private String origen;
    private String destino;
    private int horaDeSalida;
    private int horaDeLlegada;
    //endregion

    //region constructor
    public Vuelo(String origen, String destino, int horaDeSalida, int horaDeLlegada) {

        this.origen = origen;
        this.destino = destino;
        this.horaDeSalida = horaDeSalida;
        this.horaDeLlegada = horaDeLlegada;

    }
    //endregion

    //region constructor vacio
    public Vuelo() {
    }
    //endregion

    //region Getters y Setters
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getHoraDeSalida() {
        return horaDeSalida;
    }

    public int getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHoraDeSalida(int horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public void setHoraDeLlegada(int horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }

    //endregion

    //region Metodos
    public void informacionVuelo() {

        System.out.println("Su vuelo parte de " + this.origen + " a las " + this.horaDeSalida + " y llega a " + this.destino + " a las " + this.horaDeLlegada);

    }

    public void calcularTiempoDeViaje() {

        int duracionViaje = this.horaDeLlegada - this.horaDeSalida;
        System.out.println("La duracion del viaje es de: " + duracionViaje + "hrs");

    }
    //endregion
}
