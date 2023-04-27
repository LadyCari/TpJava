package Clases.Tp5;

public class Secretario extends Empleado{

    private int numHorasExtra;

    public Secretario(String nombre, int edad, float salario, float bonificacion, int numHorasExtra) {
        super(nombre, edad, salario, bonificacion);
        this.numHorasExtra = numHorasExtra;
    }

    public int getNumHorasExtra() {
        return numHorasExtra;
    }

    public void setNumHorasExtra(int numHorasExtra) {
        this.numHorasExtra = numHorasExtra;
    }

    @Override
    public void calcularBonificacion() {
        this.setBonificacion(this.getNumHorasExtra() * (float) 100);
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "numHorasExtra=" + numHorasExtra +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", bonificacion=" + bonificacion +
                '}';
    }
}
