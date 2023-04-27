package Clases.Tp5;

public class Gerente extends Empleado {

    private String departamento;  //A,B o C

    public Gerente(String nombre, int edad, float salario, float bonificacion, String departamento) {
        super(nombre, edad, salario, bonificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void calcularBonificacion() {
        Float bonificacion = (float) 0;

        if (this.getDepartamento().equals("A")) {
            this.setBonificacion((float) 5 * this.getSalario());
        } else if (this.getDepartamento().equals("B")) {
            this.setBonificacion((float) 3 * this.getSalario());
        } else if (this.getDepartamento().equals("C")) {
            this.setBonificacion((float) 2 * this.getSalario());
        } else {
            System.out.println("No existe ese departamento");
        }
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", bonificacion=" + bonificacion +
                '}';
    }
}
