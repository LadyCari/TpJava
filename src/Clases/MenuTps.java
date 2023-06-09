import Clases.Tp2.*;
import Clases.Tp4.MateriaTp4;
import Clases.Tp4.PersonajeTp4;
import Clases.Tp5.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;
import java.util.*;

public class MenuTps {

    Scanner scanner = new Scanner(System.in);

    //region menu general
    public void menuGeneral() throws ParseException {

        int flag = 1;

        System.out.println("Seleccione el Trabajo practico:");
        System.out.println("1. Tp1");
        System.out.println("2. Tp2");
        System.out.println("3. Tp3");
        System.out.println("4. Tp4");
        System.out.println("5. Tp5");
        System.out.println("6. Salir.");

        int opcion = scanner.nextInt();

        do {
            switch (opcion) {
                case 1:
                    menutp1();
                    break;
                case 2:
                    menuTp2();
                    break;
                case 3:
                    menuTP3();
                    break;
                case 4:
                    menuTP4();
                    break;
                case 5:
                    menuTP5();
                    break;
                case 6:
                    flag = 0;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
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
            System.out.println("24.Salir.");

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

                case 11:
                    menuAreas();
                    break;

                case 12:
                    mostrarNombre();
                    break;

                case 13:
                    mostrarDobleYTriple();
                    break;

                case 14:
                    pasajeDeCentigradosAFahrenheit();
                    break;

                case 15:
                    longitudYAreaCircunferencia();
                    break;

                case 16:
                    kilometrosAMetros();
                    break;

                case 17:
                    pitagoras();
                    break;

                case 18:
                    leerDatosArregloTemperatura();
                    break;

                case 19:
                    generar10NumerosRandom();
                    break;

                case 20:
                    swichDiaSemana();
                    break;

                case 21:
                    contadorCantidadDigitos();
                    break;

                case 22:
                    CalculadoraPolacaInversaApp();
                    break;

                case 23:
                    calculoSalarioPorEdad();
                    break;

                case 24:
                    flag = 0;
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
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

        } while (continuar == 1);
    }

    public void sumaNumeroNaturales() {
        int numero = 0;

        for (int i = 0; i <= 10; i++) {
            numero += i;
        }

        System.out.print("Suma de los 10 primeros numeros naturales: " + numero);
        System.out.println(" ");
    }

    public void cantidadNumerosPositivosDelUsarios() {
        int contadorNumerosPositivos = 0;
        int opcion = 0;
        int numero = 0;

        do {
            System.out.print("Ingrese numero: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                contadorNumerosPositivos++;
            }

            System.out.print("Desea ingresar otro numero? 1.Si 2.No ");
            opcion = scanner.nextInt();

        } while (opcion == 1);

        System.out.println("La cantidad de numeros positivos ingresados fue: " + contadorNumerosPositivos);
    }

    public void añoBiciesto() {
        int año = 0;

        System.out.print("Ingrese el año que desea ver si es biciesto: ");
        año = scanner.nextInt();

        if (año % 4 == 0) {
            System.out.println("El año es biciesto");
        } else {
            System.out.println("El año no es biciesto");
        }
    }

    public void valorEnASCIIDelCaracter() {

        System.out.println("Ingrese el caracter que desea ver su ASCII: ");
        char caracter = scanner.next().charAt(0);

        System.out.println("El valor en ASCII del character es: " + (int) caracter);
    }

    public void mutiplicarDosNumeros() {

        System.out.print("Ingrese el primer numero que desea multiplicar: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo: ");
        int numero2 = scanner.nextInt();

        int resultadoMultiplicacion = numero1 * numero2;

        System.out.println(numero1 + " * " + numero2 + " = " + resultadoMultiplicacion);
    }

    public void menuAreas() {
        int opcion = 0;
        int continuar = 1;

        do {
            System.out.println("Areas:");
            System.out.println("1.Reactangulo.");
            System.out.println("2.Cuadrado.");
            System.out.println("3.Triangulo.");
            System.out.println("4.Circulo.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    areaDeRectangulo();
                    break;
                case 2:
                    areaDeCuadrado();
                    break;
                case 3:
                    areaTriangulo();
                    break;
                case 4:
                    areaCirculo();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

            System.out.println("Desea calcular otra area? 1.Si - 2.No");
            continuar = scanner.nextInt();

        } while (continuar == 1);
    }

    public void areaDeRectangulo() {

        System.out.println("Para poder calcular el area del rectangulo usted tiene que tener 2 lados del rectangulo.");
        System.out.print("Ingrese el primer lado del rectangulo: ");
        int lado1Rectangulo = scanner.nextInt();

        System.out.print("Ingrese el segundo lado del rectangulo: ");
        int lado2Rectangulo = scanner.nextInt();

        int areaRectangulo = lado1Rectangulo * lado2Rectangulo;

        System.out.println("Su rectangulo con lado 1: " + lado1Rectangulo + " lado 2: " + lado2Rectangulo + " tiene un area de: " + areaRectangulo);
    }

    public void areaDeCuadrado() {

        System.out.println("Para poder calcular el area del cuadrado usted tiene que tener 2 lados iguales");
        System.out.print("Ingrese el lado valor del lado del cuadrado: ");
        int ladoCuadrado = scanner.nextInt();

        int areaCuadrado = ladoCuadrado * ladoCuadrado;

        System.out.println("Su cuadrado de lado: " + ladoCuadrado + " tiene un area de: " + areaCuadrado);
    }

    public void areaTriangulo() {

        System.out.println("Para poder calcular el area del triangulo usted tiene que tener una base y una altura");
        System.out.print("Ingrese el valor de la altura del triangulo: ");
        int alturaTriangulo = scanner.nextInt();

        System.out.print("Ingrese el valor de la base del triangulo: ");
        int baseTriangulo = scanner.nextInt();

        int areaTriangulo = alturaTriangulo * baseTriangulo;

        System.out.println("Su triangulo de base: " + baseTriangulo + " y altura: " + alturaTriangulo + " tiene un area de: " + areaTriangulo);
    }

    public void areaCirculo() {

        System.out.println("Para sacar el area de su circulo necesitamos un radio");
        System.out.print("Ingrese el radio del circulo: ");
        double radioCirculo = scanner.nextDouble();

        double areaCirculo = (Math.PI * (Math.pow(radioCirculo, 2)));

        System.out.println("Su ciruclo con radio de: " + radioCirculo + " tiene un area de: " + areaCirculo);
    }

    public void mostrarNombre() {

        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.next();

        System.out.println("Buenos dias " + nombreUsuario);
    }

    public void mostrarDobleYTriple() {

        System.out.print("Ingrese numero entero: ");
        int numero = scanner.nextInt();

        int dobleNumero = (numero * 2);
        int tripleNumero = (numero * 3);

        System.out.println("El doble de " + numero + " es: " + dobleNumero + " y el triple es: " + tripleNumero);
    }

    public void pasajeDeCentigradosAFahrenheit() {

        System.out.print("Ingrese los grados centrigrados que desea convertir: ");
        float centigrados = scanner.nextFloat();

        float fahrenheit = (32) + ((9 * centigrados) / 5);

        System.out.println("Su temperatura de " + centigrados + " °C en °F es: " + fahrenheit);
    }

    public void longitudYAreaCircunferencia() {

        System.out.print("Ingrese el radio de su circunferencia: ");
        float radioCircunferencia = scanner.nextFloat();

        double longitudCircunferencia = (2 * Math.PI * radioCircunferencia);
        double areaCircunferencia = (Math.PI * Math.pow(radioCircunferencia, 2));

        System.out.println("El perimetro de su circulo es: " + areaCircunferencia);
        System.out.println("La longitud de la circunferencia es: " + String.format("%.2f", longitudCircunferencia));
        System.out.println("El area de la circunferencia es: " + String.format("%.2f", areaCircunferencia));
    }

    public void kilometrosAMetros() {

        System.out.println("Ingrese su velocidad en kilometros sobre hora: ");
        float velocidadKilometro = scanner.nextFloat();

        double velocidadMetros = (velocidadKilometro * 0.27);

        System.out.println("Su velocidad de " + velocidadKilometro + " k/h equivale: " + velocidadMetros + " m/s");
    }

    public void pitagoras() {

        System.out.println("Para calcular su hipotenusa necesitamos 2 lados, altura y base");
        System.out.print("Ingrese la base de su triagulo rectangulo: ");
        float baseTriangulo = scanner.nextFloat();

        System.out.print("Ingrese la altura de su triangulo rectangulo: ");
        float alturaTriangulo = scanner.nextFloat();

        double longitudHipotenusa = Math.sqrt(Math.pow(baseTriangulo, 2) + Math.pow(alturaTriangulo, 2));

        System.out.println("Su hipotenusa es: " + String.format("%.2f", longitudHipotenusa));
    }

    public float[] cargarArregloTemperaturaRandom() {

        float[] arregloTemperaturasMes = new float[30];
        Random numeroRandom = new Random();

        for (int i = 0; i < 30; i++) {
            arregloTemperaturasMes[i] = numeroRandom.nextFloat(0, 42);
        }
        System.out.println(" ");
        return arregloTemperaturasMes;
    }

    public void mostrarArregloTemperaturas(float[] arregloTemperaturas) {

        for (int i = 0; i < 30; i++) {
            System.out.print(String.format("%.2f", arregloTemperaturas[i]) + " °C | ");
        }
    }

    public float maximoArregloTemperatura(float[] arregloTemperatura) {

        float temperaturaMaxima = arregloTemperatura[0];

        for (int i = 0; i < 30; i++) {
            if (arregloTemperatura[i] > temperaturaMaxima) {
                temperaturaMaxima = arregloTemperatura[i];
            }
        }
        return temperaturaMaxima;
    }

    public float minimoArregloTemperatura(float[] arregloTemperatura) {

        float temperaturaMinima = arregloTemperatura[0];

        for (int i = 0; i < 30; i++) {
            if (arregloTemperatura[i] < temperaturaMinima) {
                temperaturaMinima = arregloTemperatura[i];
            }
        }
        return temperaturaMinima;
    }

    public float promedioArregloTemperaturas(float[] arregloTemperaturas) {

        float sumaTemperaturas = 0;

        for (int i = 0; i < 30; i++) {
            sumaTemperaturas += arregloTemperaturas[i];
        }

        return sumaTemperaturas / 30;
    }

    public void leerDatosArregloTemperatura() {

        float[] arregloTemperaturas = new float[30];

        arregloTemperaturas = cargarArregloTemperaturaRandom();
        mostrarArregloTemperaturas(arregloTemperaturas);
        float maximaTemperatura = maximoArregloTemperatura(arregloTemperaturas);
        float minimoTemperatura = minimoArregloTemperatura(arregloTemperaturas);
        float promedioTemperaturas = promedioArregloTemperaturas(arregloTemperaturas);

        System.out.println("Su temperatura maxima es: " + String.format("%.2f", maximaTemperatura) + " °C");
        System.out.println("Su temperatura minima es: " + String.format("%.2f", minimoTemperatura) + " °C");
        System.out.println("Su temperatura promedio es: " + String.format("%.2f", promedioTemperaturas) + " °C");
    }

    public void generar10NumerosRandom() {

        int[] arreglo10Numeros = new int[10];

        System.out.print("Ingrese el numero mas bajo: ");
        int numeroMinimo = scanner.nextInt();

        System.out.print("Ingrese el numero mas grande: ");
        int numeroMaximo = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            arreglo10Numeros[i] = (int) Math.floor(Math.random() * (numeroMaximo - numeroMinimo + 1) + numeroMinimo);
        }

        System.out.println("Sus 10 numeros random son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo10Numeros[i] + " | ");
        }
        System.out.println(" ");
    }

    public void swichDiaSemana() {

        System.out.print("Ingrese el dia de la semana: ");
        String diaSemana = scanner.next().toLowerCase();

        switch (diaSemana) {
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                System.out.println("El dia " + diaSemana + " es dia laboral");
                break;
            case "sabado", "domingo":
                System.out.println("El dia " + diaSemana + " no es laboral");
                break;
            default:
                System.out.println("El dia " + diaSemana + " no es un dia de la semana");
                break;
        }
    }

    public int validarEnteroYPositivo() {

        int numero = 0;

        do {
            System.out.print("Ingrese un numero: ");

            while (!scanner.hasNextInt()) {
                String dato = scanner.next();
                System.out.println(dato + " no es un dato valido ingrese otro numero");
            }
            numero = scanner.nextInt();
        } while (numero < 0);

        return numero;
    }

    public void contadorCantidadDigitos() {

        int numero = validarEnteroYPositivo();

        String numeroEnString = String.valueOf(numero);
        int cantidadDigitosString = numeroEnString.length();

        System.out.println("La cantidad de digitos que tiene " + numero + " es: " + cantidadDigitosString);
    }

    public int validarNumeroEntero() {

        while (!scanner.hasNextInt()) {
            String dato = scanner.next();
            System.out.println(dato + " no es un dato valido ingrese otro numero");
        }
        int numero = scanner.nextInt();

        return numero;
    }

    public void CalculadoraPolacaInversaApp() {
        int opcion = 0;

        do {

            System.out.print("Ingrese primer numero: ");
            int numero1 = validarNumeroEntero();
            System.out.print("Ingrese segundo numero: ");
            int numero2 = validarNumeroEntero();

            System.out.print("Ingrese el operador de la operacion que desea realizar (+, -, *, /, ^, %): ");
            String operadorCalculadora = scanner.next();

            switch (operadorCalculadora) {

                case "+":
                    sumaNumerosEnteros(numero1, numero2);
                    break;
                case "-":
                    restaNumerosEnteros(numero1, numero2);
                    break;
                case "*":
                    multiplicacionNumerosEnteros(numero1, numero2);
                    break;
                case "/":
                    divicionNumerosEnteros(numero1, numero2);
                    break;
                case "^":
                    potenciaNumerosEnteros(numero1, numero2);
                    break;
                case "%":
                    moduloNumerosEnteros(numero1, numero2);
                    break;
                default:
                    System.out.println("Este operador: " + operadorCalculadora + " no existe");
                    break;
            }

            System.out.print("Desea realizar otra operacion? 1.Si - 2.No ");
            opcion = scanner.nextInt();

        } while (opcion == 1);
    }

    public void sumaNumerosEnteros(int numero1, int numero2) {

        int suma = numero1 + numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + suma);
    }

    public void restaNumerosEnteros(int numero1, int numero2) {

        int suma = numero1 - numero2;

        System.out.println(numero1 + " - " + numero2 + " = " + suma);
    }

    public void multiplicacionNumerosEnteros(int numero1, int numero2) {

        int suma = numero1 * numero2;

        System.out.println(numero1 + " * " + numero2 + " = " + suma);
    }

    public void divicionNumerosEnteros(int numero1, int numero2) {

        double divicion = (double) numero1 / (double) numero2;

        System.out.println(numero1 + " / " + numero2 + " = " + divicion);
    }

    public void potenciaNumerosEnteros(int numero1, int numero2) {

        double potencia = Math.pow(numero1, numero2);

        System.out.println(numero1 + " ^ " + numero2 + " = " + potencia);
    }

    public void moduloNumerosEnteros(int numero1, int numero2) {

        int resto = numero1 % numero2;

        System.out.println(numero1 + " % " + numero2 + " el resto es: " + resto);
    }

    public void calculoSalarioPorEdad() {
        double bonoDinero = 0, salarioFinal = 0;


        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.next();

        System.out.print("Ingrese su edad: ");
        int edadUsuario = validarNumeroEntero();

        System.out.print("Ingrese su salario: ");
        double salarioUsuario = scanner.nextDouble();

        if (edadUsuario < 16) {
            System.out.println("No tiene edad valida para trabajar, por ende no tiene salario.");
        } else if ((19 <= edadUsuario) && (edadUsuario <= 50)) {

            bonoDinero = (5 * salarioUsuario) / 100;
            salarioFinal = salarioUsuario + bonoDinero;

            System.out.println(nombreUsuario + " su salario es de: " + salarioFinal);

        } else if ((51 <= edadUsuario) && (edadUsuario <= 60)) {

            bonoDinero = (10 * salarioUsuario) / 100;
            salarioFinal = salarioUsuario + bonoDinero;

            System.out.println(nombreUsuario + " su salario es de: " + salarioFinal);

        } else {

            bonoDinero = (15 * salarioUsuario) / 100;
            salarioFinal = salarioUsuario + bonoDinero;

            System.out.println(nombreUsuario + " su salario es de: " + salarioFinal);

        }
    }
    //endregion

    //endregion

    //region tp2

    public void menuTp2() {

        int flag = 1;

        Agenda agendita = new Agenda();
        Gesion gestion = new Gesion();

        do {

            //region consignas tp2
            System.out.println("TP2:");
            System.out.println("Ingrese el ejercicio que desea: ");
            System.out.println("1.Crea una clase CuentaBancaria con atributos saldo y titular. Debe tener métodos para depositar y retirar dinero de la cuenta y para consultar el saldo actual. Además, la clase debe permitir la posibilidad de establecer un plazo fijo. El método encargado debe mostrar cuánto quedaría el monto total con intereses que podremos retirar en 30 días.");
            System.out.println("2.Crea una clase Vuelo con atributos origen, destino, horaSalida y horaLlegada. La clase debe tener métodos para mostrar la información del vuelo y para calcular la duración del mismo.");
            System.out.println("3. rea una clase Agenda. Debe permitir que se agreguen, modifiquen y eliminen contactos. Cada contacto debe tener un nombre, un número de teléfono y una dirección de correo electrónico. Además, la aplicación debe tener una función de búsqueda que permita buscar contactos por nombre. Pista: Se debe utilizar más de una clase.");
            System.out.println("4.Crea una clase Estudiante con atributos nombre, edad, materiasAprobadas (materia es otra clase con nombre, cargaHoraria y profesor. Este último como un String) y promedio. La clase debe permitir que se le agreguen nuevas materias aprobadas y debe tener un método para calcular el promedio actual del estudiante.");
            System.out.println("5.Crea una clase Producto que tenga los atributos código, descripción, stock, precio y añoVencimiento. Luego crear una clase Gestión que posee una lista (arreglo) de productos. Con esta clase se debe poder comprar o vender productos, es decir, agregar o quitar del stock. También debe tener un método que busque al producto por su código y otro que avise si el producto está vencido o vence en este año. Aclaración: Como todavía no vimos persistencia de datos se deben “hardcodear” los productos y la lista de ellos dentro de la clase gestión.");
            System.out.println("6.Salir.");
            //endregion

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuentaBancaria();
                    break;
                case 2:
                    vuelos();
                    break;
                case 3:
                    agendita.menuAgenda();
                    break;
                case 4:
                    Estudiante estudianteAux = hardCodeoEstudiante();
                    estudianteAux.menuEstudiante();
                    break;
                case 5:
                    gestion.menuGestion();
                    break;
                case 6:
                    flag = 0;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (flag == 1);

        scanner.close();
    }

    //region metodostp2
    public void cuentaBancaria() {
        int opcion = 0;
        int continuar = 0;

        System.out.print("Ingrese su nombre: ");
        String nombreTitular = scanner.next();

        System.out.print("Ingrese su salario: $");
        double salarioTitular = scanner.nextDouble();

        CuentaBancaria usuario = new CuentaBancaria(salarioTitular, nombreTitular);

        do {
            System.out.println("Bievenido " + nombreTitular + " eliga la operacion que desea realizar:");
            System.out.println("1.Retirar dinero.");
            System.out.println("2.Depositar dinero.");
            System.out.println("3.Consultar salario.");
            System.out.println("4.Ganancia de plazo fijo.");

            opcion = validarNumeroEntero();

            switch (opcion) {

                case 1:
                    usuario.retirarDinero();
                    break;
                case 2:
                    usuario.depositoDinero();
                    break;
                case 3:
                    usuario.consultaSalario();
                    break;
                case 4:
                    usuario.plazoFijo();
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }

            System.out.println(nombreTitular + " desea realizar otra operacion? 1.Si - 2.No");
            continuar = scanner.nextInt();

        } while (continuar == 1);
    }

    public void vuelos() {

        Vuelo nuevoViaje = new Vuelo();

        System.out.print("Ingrese el origen del vuelo: ");
        nuevoViaje.setOrigen(scanner.next());

        System.out.print("Ingrese el destino del vuelo: ");
        nuevoViaje.setDestino(scanner.next());

        System.out.print("Ingrese el horario de partida: ");
        nuevoViaje.setHoraDeSalida(scanner.nextInt());

        System.out.print("Ingre el horario de llegada: ");
        nuevoViaje.setHoraDeLlegada(scanner.nextInt());

        nuevoViaje.informacionVuelo();

        nuevoViaje.calcularTiempoDeViaje();
    }

    public Estudiante hardCodeoEstudiante() {

        Materia materia1 = new Materia("Lengua", 4, "Fernandez", 7);
        Materia materia2 = new Materia("Matematica", 2, "Mendez", 8);
        Materia materia3 = new Materia("Informatica", 3, "Perez", 9);

        Estudiante alumno = new Estudiante("Maria", 15);

        alumno.agregarMateriasALista(materia1);
        alumno.agregarMateriasALista(materia2);
        alumno.agregarMateriasALista(materia3);

        return alumno;
    }
    //endregion

    //endregion

    //terminar
    //region tp3

    public void menuTP3() {

        int flag = 1;

        do {

            //region consignas tp3
            System.out.println("1. Crea un programa que pida al usuario una fecha de nacimiento en formato dd/MM/yyyy y calcule su edad en años, meses y días.");
            System.out.println("2. Crea un programa que pida al usuario una cadena de texto y determine si es un palíndromo (es decir, si se lee igual de izquierda a derecha que de derecha a izquierda).");
            System.out.println("3. Crea un programa que pida al usuario una cadena de texto y determine cuántas veces aparece una subcadena específica en la cadena de texto.");
            System.out.println("4. Crea un programa que pida al usuario una cadena de texto y la convierta en una cadena de camelCase. La cadena de texto tiene que separar cada palabra por un espacio.");
            System.out.println("5. Crea un programa que genere un número aleatorio entre 1 y 100 y le pida al usuario que adivine el número. El programa debe indicar si el número del usuario es mayor o menor que el número generado y seguir pidiendo al usuario que adivine hasta que acierte. El usuario tiene oportunidades limitadas (a libre elección).");
            System.out.println("6. Crea un programa que pida al usuario una cadena de texto y elimine todas las vocales de la cadena.");
            System.out.println("7. Crea un programa que pida al usuario dos fechas en formato dd/MM/yyyy y  calcule la cantidad de días entre ambas fechas.");
            System.out.println("8. Crea un programa que pida al usuario una cadena de texto dividida por  espacios y la convierta en una cadena de snake_case.");
            System.out.println("9. Cree una aplicación con menú donde se puedan utilizar los métodos de la clase Math. Solo los métodos vistos en clase.");
            System.out.println("10.Salir.");
            //endregion

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    fechaNacimiento();
                    break;
                case 2:
                    palindromo();
                    break;
                case 3:
                    buscarSubCadena();
                    break;
                case 4:
                    textoACamelCase();
                    //problema con los espacios
                    break;
                case 5:
                    adivinaNumeroEn3Intentos();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    flag = 0;
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        } while (flag == 1);
    }

    //region metodos tp3

    public void fechaNacimiento() {

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Ingrese su fecha de nacimiento (utilize siguiente formato dd/MM/yyyy): ");
        String fechaNacimientoUsuarioString = scanner.next();

        LocalDate fechaNacimientoUsuario = LocalDate.parse(fechaNacimientoUsuarioString, formatoFecha);

        LocalDate fechaHoy = LocalDate.now();

        Period periodo = Period.between(fechaNacimientoUsuario, fechaHoy);

        System.out.println("Tienes " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y " + periodo.getDays() + " dias.");
    }

    public void palindromo() {

        int flag = 1;

        System.out.print("Ingrese la palabra: ");
        String palabraUsuario = scanner.next();

        palabraUsuario = palabraUsuario.replaceAll("\\s", "").toLowerCase();

        for (int i = 0; i < palabraUsuario.length() / 2; i++) {
            if (palabraUsuario.charAt(i) != palabraUsuario.charAt(palabraUsuario.length() - i - 1)) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Su palabra " + palabraUsuario + " es palindromo.");
        } else {
            System.out.println("Su palabra " + palabraUsuario + " no es palindromo");
        }
    }

    public void buscarSubCadena() {

        int contador = 0;

        System.out.println("Ingrese la cadena de texto: ");
        String cadenaPrincipal = scanner.next();

        System.out.println("Ingrese la subcadena que busca: ");
        String subCadena = scanner.next();

        int posicion = cadenaPrincipal.indexOf(subCadena);

        while (posicion != -1) {
            contador++;
            posicion = cadenaPrincipal.indexOf(subCadena, posicion + 1);
        }

        System.out.println("En la cadena " + cadenaPrincipal + " se encontro " + subCadena + " " + contador + " veces.");
    }

    public void textoACamelCase() {

        String[] palabras = new String[100];

        System.out.println("Ingrese texto: ");
        String textoUsuario = scanner.nextLine();

        palabras = textoUsuario.split(" ");

        String camelCase = palabras[0].toLowerCase();

        for (int i = 0; i < palabras.length; i++) {
            String primeraLetra = palabras[i].substring(0, 1).toUpperCase();
            String restoPalabra = palabras[i].substring(1).toLowerCase();
            camelCase += primeraLetra + restoPalabra;
        }

        System.out.println("El texto en camelCase es: " + camelCase);
    }

    public void adivinaNumeroEn3Intentos() {

        int flag = 0;

        Random numeroRandoAdivinar = new Random();
        int numeroRandom = numeroRandoAdivinar.nextInt(1, 100);

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero del 1 al 100 para adivinar nuestro numero: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroRandom) {
                flag = 1;
                break;
            } else if (numeroRandom > numeroUsuario) {
                System.out.println("El numero es mas grande");
            } else {
                System.out.println("El numero es mas chico");
            }
        }

        if (flag == 1) {
            System.out.println("Felicidades era el numero!!.");
        } else {
            System.out.println("Mas suerte para la proxima. :c");
        }
    }


//endregion

//endregion

    //region tp4
    public void menuTP4() {

        int flag = 1;
        MateriaTp4 materia = new MateriaTp4();
        PersonajeTp4 personaje = new PersonajeTp4();

        do {

            //region consignas tp4
            System.out.println("1. Crea una clase Persona que tenga tres atributos: nombre, edad y dni. Luego, crea dos subclases llamadas Estudiante y Profesor que hereden de Persona. Como básico la subclase Estudiante debe tener un atributo carrera y un método estudiar que imprima por pantalla un mensaje indicando que el estudiante está estudiando. La subclase Profesor debe tener un atributo materia y un método enseñar que imprima por pantalla un mensaje indicando que el profesor está enseñando. Una idea podría ser crear una clase Materia y relacionarla con los alumnos y profesores.");
            System.out.println("2. Crea una jerarquía de clases para un videojuego. La clase base debe ser Personaje, que tiene atributos como vida y stamina. Luego, crea subclases para diferentes tipos de personajes, como Mago, Guerrero y Arquero. Cada subclase debe tener habilidades y atributos específicos para ese tipo de personaje. Una idea podría ser que haya un rango de probabilidades de cada personaje a la hora de realizar un ataque.");
            System.out.println("3. Realizar un diagrama de clases UML para ambos puntos.");
            System.out.println("4.Salir.");
            //endregion

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    materia.asignarNombres();
                    materia.situacion();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = 0;
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        } while (flag == 1);
    }
    //terminar

    //endregion

    //region tp5
    public void menuTP5() {

        int flag = 1;

        do {
            //region consignas tp5
            System.out.println("1. Crea una clase abstracta llamada Vehiculo con los atributos marca, modelo y precio. Crea dos clases hijas llamadas Coche y Moto que extiendan la clase Vehiculo. En la clase Coche añade el atributo numPuertas y en la clase Moto añade el atributo cilindrada. Luego, crea una interfaz llamada Alquilable con un método calcularPrecioAlquiler() y haz que ambas clases hijas implementen esta interfaz.");
            System.out.println("2. Crea una clase abstracta llamada FiguraGeometrica con un método abstracto llamado calcularArea(). Crea dos clases hijas llamadas Rectangulo y Circulo que extiendan la clase FiguraGeometrica. En la clase Rectangulo añade los atributos base y altura y en la clase Circulo añade el atributo radio. Implementa el método calcularArea() en ambas subclases.");
            System.out.println("3. Crea una clase llamada Persona con los atributos nombre, edad y dni. Implementa la interfaz Comparable en la clase Persona para poder ordenar una lista de personas por edad.");
            System.out.println("4. Crea una clase abstracta llamada Animal con los atributos nombre, edad y peso. Crea dos clases hijas llamadas Perro y Gato que extiendan la clase Animal. En la clase Perro añade el atributo raza y en la clase Gato añade el atributo pelaje (puede ser tanto su color como sus características). Implementa la interfaz Comparable en ambas clases hijas para poder ordenar una lista de animales por peso.");
            System.out.println("5. Crea una clase abstracta llamada Empleado con los atributos nombre, edad y salario (si está el ejercicio 3 en el mismo archivo puede heredar de Persona). Agrega un método abstracto llamado calcularBonificacion() que calculará la bonificación del salario del empleado en función de su cargo. Luego, crea dos clases hijas llamadas Gerente y Secretario que extiendan la clase Empleado. En la clase Gerente añade el atributo departamento y en la clase Secretario en ambas clases hijas para calcular la bonificación correspondiente. Por último, crea una lista de objetos Empleado que incluya tanto gerentes como secretarios. Luego, recorre ambas listas y muestra por pantalla el nombre, salario y bonificación de cada empleado.");
            System.out.println("6.Salir.");
            //endregion

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pedirDiasUsuario();
                    break;
                case 2:
                    areasDeFiguras();
                    break;
                case 3:
                    OrdenarListas();
                    break;
                case 4:
                    hardcodeoAnimales();
                    break;
                case 5:
                    hardcodeoEmpleados();
                    break;
                case 6:
                    flag = 0;
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        } while (flag == 1);

    }
    //endregion

    //region metodos
    public void pedirDiasUsuario() {

        Coche auto = new Coche("Toyota", "2020", 400, 4);
        Moto moto = new Moto("Totoro", "2021", 270, 200);
        double precioAlquilerVehiculo = 0;
        int flag = 0;

        do {
            System.out.print("Ingrese que vehiculo alquilara (Auto o Moto): ");
            String vehiculo = scanner.next();

            System.out.print("Cuantos dias lo alquilara?:");
            int diasAlquiler = scanner.nextInt();

            if (vehiculo.equals("Auto")) {
                precioAlquilerVehiculo = auto.calcularPrecioAlquiler(diasAlquiler);
                auto.mostrarVehiculo();
                flag = 0;
            } else if (vehiculo.equals("Moto")) {
                precioAlquilerVehiculo = moto.calcularPrecioAlquiler(diasAlquiler);
                moto.mostrarVehiculo();
                flag = 0;
            } else {
                System.out.println("Ese vehiculo no tenemos.");
                flag = 1;
            }
        } while (flag == 1);

        System.out.println("Su alquiler es de: $" + precioAlquilerVehiculo);
    }

    public void areasDeFiguras() {

        Circulo circulo = new Circulo(3.25f);
        Rectangulo rectangulo = new Rectangulo(24f, 25f);

        System.out.println("De que figura quiere el Area?");
        String figuraUsuario = scanner.next();

        switch (figuraUsuario) {
            case "Circulo" -> System.out.println("Su areas es: " + circulo.calcularArea());
            case "Rectangulo" -> System.out.println("Si areas es: " + rectangulo.calcularArea());
        }


    }

    public void OrdenarListas(){

        //region lista
        ArrayList<Persona> lista = new ArrayList<>();

        Persona persona1 = new Persona("Carlos", 29, "1234");
        Persona persona2 = new Persona("Maria", 60, "12345");
        Persona persona3 = new Persona("Pepo", 18, "4321");

        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        //endregion

        Collections.sort(lista);

        mostrarLista(lista);

    }

/*
    public ArrayList<Persona> pasarListaDesordenadaAListaOrdenada(ArrayList<Persona> lista) {

        ArrayList<Persona> listaOrdenada = new ArrayList<>();

        int menorEdad = 0;

        while (!lista.isEmpty()) {

            Persona personaAuxMenor = lista.get(0);

            for (Persona o : lista) {
                menorEdad = o.compareTo(personaAuxMenor);
                if (personaAuxMenor.getEdad() > o.getEdad()) {
                    personaAuxMenor = o;
                }
            }

            listaOrdenada.add(personaAuxMenor);

            for (Persona t : lista) {
                if (t.getEdad() == menorEdad) {
                    lista.remove(t);
                    break;
                }
            }
        }
        return listaOrdenada;
    }
*/
    public void mostrarLista (ArrayList<Persona> lista){

        for (Persona o : lista){
            System.out.println(o.toString());
        }
    }

    public void hardcodeoAnimales (){

        List <Animal> listaAnimales = new ArrayList<Animal>();

        Animal gato1 = new Gato("pepe",12, 6, "suave");
        Animal gato2 = new Gato ("pipi", 11, 2, "moteado");
        Animal perro1 = new Perro("more", 10, 9, "golden");
        Animal perro2 = new Perro("felipe", 5, 4, "cusco");

        listaAnimales.add(gato1);
        listaAnimales.add(gato2);
        listaAnimales.add(perro1);
        listaAnimales.add(perro2);

        Collections.sort(listaAnimales);

        for (Animal o : listaAnimales){
            System.out.println("--------------------------------");
            System.out.println(o.toString());
            System.out.println("--------------------------------");
        }
    }

public void hardcodeoEmpleados (){

        List <Empleado> listaEmpleados = new ArrayList<Empleado>();

        Empleado persona1 = new Gerente("pablo", 20, 15000, 0,"A");
    Empleado persona2 = new Gerente("pedro", 26, 27777, 0, "B");
    Empleado persona3 = new Secretario("carlos", 30, 4000,0, 5);
    Empleado persona4 = new Secretario("jimena", 23, 30000,0, 1);

    listaEmpleados.add(persona1);
    listaEmpleados.add(persona2);
    listaEmpleados.add(persona3);
    listaEmpleados.add(persona4);

        for (Empleado objeto : listaEmpleados) {
            objeto.calcularBonificacion();
            System.out.println("---------------------");
            System.out.println(objeto.toString());
            System.out.println("---------------------");
        }
    }




    //endregion

}




