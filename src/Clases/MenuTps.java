import Clases.CuentaBancaria;
import Clases.Vuelo;

import java.util.*;
import java.util.random.*;

public class MenuTps {

    Scanner scanner = new Scanner(System.in);

    //region menu general
    public void menuGeneral() {

        int flag = 1;

        System.out.println("Seleccione el Trabajo practico:");
        System.out.println("1. Tp1");
        System.out.println("2. Tp2");

        int opcion = scanner.nextInt();

        do {
            switch (opcion) {
                case 1:
                    menutp1();
                    break;
                case 2:
                    menuTp2();
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

        int ejercicio = 0;
        int continuar = 0;

        do {

            //region consignas tp2
            System.out.println("TP2:");
            System.out.println("Ingrese el ejercicio que desea: ");
            System.out.println("1.Crea una clase CuentaBancaria con atributos saldo y titular. Debe tener métodos para depositar y retirar dinero de la cuenta y para consultar el saldo actual. Además, la clase debe permitir la posibilidad de establecer un plazo fijo. El método encargado debe mostrar cuánto quedaría el monto total con intereses que podremos retirar en 30 días.");
            System.out.println("2.Crea una clase Vuelo con atributos origen, destino, horaSalida y horaLlegada. La clase debe tener métodos para mostrar la información del vuelo y para calcular la duración del mismo.");
            System.out.println("3. rea una clase Agenda. Debe permitir que se agreguen, modifiquen y eliminen contactos. Cada contacto debe tener un nombre, un número de teléfono y una dirección de correo electrónico. Además, la aplicación debe tener una función de búsqueda que permita buscar contactos por nombre. Pista: Se debe utilizar más de una clase.");
            System.out.println("4.Crea una clase Estudiante con atributos nombre, edad, materiasAprobadas (materia es otra clase con nombre, cargaHoraria y profesor. Este último como un String) y promedio. La clase debe permitir que se le agreguen nuevas");
            System.out.println("4.Crea una clase Estudiante con atributos nombre, edad, materiasAprobadas (materia es otra clase con nombre, cargaHoraria y profesor. Este último como un String) y promedio. La clase debe permitir que se le agreguen nuevas materias aprobadas y debe tener un método para calcular el promedio actual del estudiante.");
            System.out.println("5.Crea una clase Producto que tenga los atributos código, descripción, stock, precio y añoVencimiento. Luego crear una clase Gestión que posee una lista (arreglo) de productos. Con esta clase se debe poder comprar o vender productos, es decir, agregar o quitar del stock. También debe tener un método que busque al producto por su código y otro que avise si el producto está vencido o vence en este año. Aclaración: Como todavía no vimos persistencia de datos se deben “hardcodear” los productos y la lista de ellos dentro de la clase gestión.");
            //endregion

            ejercicio = scanner.nextInt();

            switch (ejercicio) {
                case 1:
                    cuentaBancaria();
                    break;
                case 2:
                    vuelos();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

            System.out.println("Desea realizar otro ejercicio? 1.Si 2.No");
            continuar = scanner.nextInt();

        } while (continuar == 1);

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
    //endregion

    //endregion


}




