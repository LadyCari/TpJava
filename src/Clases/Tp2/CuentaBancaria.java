package Clases.Tp2;
import java.util.Scanner;

public class CuentaBancaria {
    Scanner sc = new Scanner(System.in);

    //region atributos
    private double salario;
    private String titular;
    //endregion

    //region constructor
    public CuentaBancaria(double salario, String titular) {
        this.salario = salario;
        this.titular = titular;
    }
    //endregion

    //region metodos
    public void retirarDinero() {

        System.out.print("Dinero a retirar: ");
        double montoRetirado = sc.nextDouble();

        if (montoRetirado <= this.salario) {
            this.salario -= montoRetirado;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Error en la transaccion, dinero insuficiente.");
        }
    }

    public void depositoDinero() {

        System.out.print("Dinero a depositar: ");

        this.salario += sc.nextDouble();
        System.out.println("Deposito exitoso.");
    }

    public void consultaSalario() {

        System.out.println(this.titular + " su salario actual es: $" + this.salario);
    }

    public void plazoFijo() {
        float porcentajePlazoFijo = 10;

        System.out.print("Ingrese cuando dinero desea poner en plazo fijo: ");

        double dineroGanadoPlazoFijo = (sc.nextDouble() * porcentajePlazoFijo) / 100;

        System.out.println(this.titular + " generaria un monto de: $" + dineroGanadoPlazoFijo + " en 30 dias");
    }
    //endregion
}


