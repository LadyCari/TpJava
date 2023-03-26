import java.util.*;

public class MenuTps {

    Scanner scanner = new Scanner(System.in);

    //region menu general
    public void menuGeneral() {

        int flag = 1;

        System.out.println("Seleccione el Trabajo practico:");
        System.out.println("1. Tp1");

        int opcion = scanner.nextInt();

        do {
            switch (opcion) {
                case 1:
                    menutp1();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

            System.out.println("Desea ver otro tp? 1.Si - 2.No");
            flag = scanner.nextInt();

        } while (flag == 1);
        scanner.close();
    }

    //endregion


    //region tp1
    public void menutp1() {

        int flag = 1;
        int[] arreglo;

        do {
            //region menu tp
            System.out.println("Ingrese el numero del ejercicio:");
            System.out.println("1. Calcular el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya inicializados e ingreso por teclado.");
            System.out.println("2. Calcular si un número es par o no.");
            System.out.println("3. Mostrar los primeros 100 números primos.");
            System.out.println("4. Mostrar los primeros n números primos.");
            System.out.println("5. Ingresar un número o tantos como quiera el usuario y revisar si es primo.");
            System.out.println("6. Encontrar la suma de los primeros 10 números naturales.");
            System.out.println("7. Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.");
            System.out.println("8. Revisar si un año es bisiesto o no.");
            System.out.println("9. Encontrar el valor ASCII de un carácter.");
            System.out.println("10. Multiplicar dos números.");
            System.out.println("11. Realizar un programa que le pregunte al usuario que área desea calcular. Las opciones son: rectángulo, cuadrado, triangulo y circulo.");
            System.out.println("12. Programa que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.");
            System.out.println("13. Escribir un programa que lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.");
            System.out.println("14. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit es: F = 32 + ( 9 * C / 5)");
            System.out.println("15. Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math. Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2");
            System.out.println("16. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.");
            System.out.println("17. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.");
            System.out.println("18. Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.");
            System.out.println("19.Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio");
            System.out.println("20. Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.");
            System.out.println("21. Pide por teclado un número entero positivo (debemos controlarlo) y muestra el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.");
            System.out.println("22. Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.");
            System.out.println("Los signos aritméticos disponibles son:");
            System.out.println("+: suma los dos operandos.");
            System.out.println("-: resta los operandos.");
            System.out.println("*: multiplica los operandos.");
            System.out.println("/: divide los operandos, este debe dar un resultado con decimales (double)");
            System.out.println("^: 1º operando como base y 2º como exponente.");
            System.out.println("%: módulo, resto de la división entre operando1 y operando2.");
            System.out.println("23: Pide por teclado el nombre, edad y salario y muestra el salario");
            System.out.println("Si es menor de 16 no tiene edad para trabajar");
            System.out.println("Entre 19 y 50 años el salario es un 5 por ciento más");
            System.out.println("Entre 51 y 60 años el salario es un 10 por ciento más");
            System.out.println("Si es mayor de 60 el salario es un 15 por ciento más");

            //endregion

            int opcion = scanner.nextInt();
            int numero = 0;
            boolean booleano = false;

            switch (opcion) {
                case 1:
                    arreglo = cargarArreglo5Lugares();
                    promedio(arreglo);
                    break;

                case 2:
                    System.out.print("Ingrese un numero:");
                    numero = scanner.nextInt();

                    booleano = primoONoPrimo(numero);

                    mostrarSiEsPrimoONo(booleano);
                    break;

                case 3:
                    mostrarPrimeros100Primos();
                    break;

                case 4:
                    System.out.print("ingrese cuantos primos desea ver:");
                    numero = scanner.nextInt();

                    mostrarNNumeroPrimos(numero);
                    break;

                case 5:
                    primoONoPrimoCantidadUsuario();
                    break;

                case 6:
                    sumaNumeroNaturales();
                    break;

                case 7:
                    cantidadNumerosPositivosDelUsarios();
                    break;

                case 8:
                    añoBiciesto();
                    break;

                case 9:
                    valorEnASCIIDelCaracter();
                    break;

                case 10:
                    mutiplicarDosNumeros();
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

            System.out.println("Desea ver otro ejercicio? 1.Si - 2.No");
            flag = scanner.nextInt();

        } while (flag == 1);

        scanner.close();
    }

    // region metodos TP1
    public int[] cargarArreglo5Lugares() {

        int[] arreglo = new int[5];
        int posicion = 0;

        for (int i = 0; i < 5; i++) {

            posicion = i + 1;

            System.out.println("Ingrese el " + posicion + " valor:");

            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Su arreglo es: ");
        System.out.println(Arrays.toString(arreglo));

        return arreglo;
    }

    public void promedio(int[] arreglo) {

        int suma = 0;
        float promedioSuma = 0;

        for (int i = 0; i < 5; i++) {

            suma += arreglo[i];
        }

        promedioSuma = (float) suma / 5;

        System.out.println("El promedio de su arreglo es: " + promedioSuma);
    }

    public void parOImpar() {

        int numero = 0;

        System.out.print("Ingrese un numero: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }

    public boolean primoONoPrimo(int numero) {
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            return true;
        }

        return false;
    }

    public void mostrarSiEsPrimoONo(boolean primo) {

        if (primo == true) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

    public void mostrarPrimeros100Primos() {

        int contadorPrimos = 0;
        int numero = 0;
        boolean primoBooleano = false;

        while (contadorPrimos < 100) {

            numero += 1;
            primoBooleano = primoONoPrimo(numero);

            if (primoBooleano == true) {
                System.out.print(numero + "|");
                contadorPrimos += 1;
            }
        }
        System.out.println(" ");
    }

    public void mostrarNNumeroPrimos(int numero) {
        int contadorPrimos = 0;
        int contadorNumeros = 0;
        boolean primoBooleano = false;

        while (contadorPrimos < numero) {

            contadorNumeros += 1;
            primoBooleano = primoONoPrimo(contadorNumeros);

            if (primoBooleano == true) {
                System.out.print(contadorNumeros + "|");
                contadorPrimos += 1;
            }
        }
        System.out.println(" ");
    }

    public void primoONoPrimoCantidadUsuario() {
        int continuar = 0;
        do {
            System.out.print("Ingrese numero que desea saber si es primo: ");
            int numero = scanner.nextInt();

            boolean primo = primoONoPrimo(numero);
            mostrarSiEsPrimoONo(primo);

            System.out.println("Desea probar otro numero? 1.Si 2.No");
            continuar = scanner.nextInt();

        }while (continuar == 1);
    }

    public void sumaNumeroNaturales (){
        int numero = 0;

        for (int i=0; i<=10; i++){
            numero += i;
        }

        System.out.print("Suma de los 10 primeros numeros naturales: " + numero);
        System.out.println(" ");
    }

    public void cantidadNumerosPositivosDelUsarios(){
        int contadorNumerosPositivos = 0;
        int opcion = 0;
        int numero = 0;

        do{
            System.out.print("Ingrese numero: ");
            numero = scanner.nextInt();

            if (numero > 0){
                contadorNumerosPositivos++;
            }

            System.out.print("Desea ingresar otro numero? 1.Si 2.No ");
            opcion = scanner.nextInt();

        } while (opcion == 1);

        System.out.println("La cantidad de numeros positivos ingresados fue: "+ contadorNumerosPositivos);
    }

public void añoBiciesto(){
        int año = 0;

    System.out.print("Ingrese el año que desea ver si es biciesto: ");
    año = scanner.nextInt();

    if (año % 4 == 0){
        System.out.println("El año es biciesto");
    } else {
        System.out.println("El año no es biciesto");
    }
}

public void valorEnASCIIDelCaracter(){

    System.out.println("Ingrese el caracter que desea ver su ASCII: ");
    char caracter = scanner.next().charAt(0);

    System.out.println("El valor en ASCII del character es: " + (int)caracter);
}

public void mutiplicarDosNumeros(){

    System.out.print("Ingrese el primer numero que desea multiplicar: ");
    int numero1 = scanner.nextInt();

    System.out.print("Ingrese el segundo: ");
    int numero2 = scanner.nextInt();

    int resultadoMultiplicacion = numero1 * numero2;

    System.out.println(numero1 + " * " + numero2 + " = " + resultadoMultiplicacion);
}

public void menuAreas (){
        int opcion = 0;

        switch (opcion){
            case 1:
                areaDeRectangulo();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
}

public void areaDeRectangulo(){

    System.out.println("Para poder calcular el area del rectangulo usted tiene que tener 2 lados del rectangulo.");
    System.out.print("Ingrese el primer lado del rectangulo: ");
    int lado1Rectangulo = scanner.nextInt();

    System.out.print("Ingrese el segundo lado del rectangulo: ");
    int lado2Rectangulo = scanner.nextInt();

    int areaRectangulo = lado1Rectangulo * lado2Rectangulo;

    System.out.print("Su rectangulo con lado 1: " + lado1Rectangulo + "lado 2: " + lado2Rectangulo + "tiene un area de: " + areaRectangulo);
}
    //endregion

    //endregion


}




