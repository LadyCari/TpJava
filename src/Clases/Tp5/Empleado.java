package Clases.Tp5;

public abstract class Empleado {

    protected String nombre;
    protected int edad;
    protected float salario;
    protected float bonificacion;

    public Empleado(String nombre, int edad, float salario, float bonificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.bonificacion = bonificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void calcularBonificacion() {
    }

}
