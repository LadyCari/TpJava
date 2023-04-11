package Clases;

import java.util.Scanner;

public class PersonajeTp4 {

    Scanner sc = new Scanner(System.in);

    //region atributos

    private int vida;
    private int mana;
    private String nombreRaza;
    private String nombreClase;

    //endregion

    //region G y S

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    //endregion

    //region constructor

    public PersonajeTp4() {
        this.vida = 10;
        this.mana = 5;
    }

    //endregion

    //region metodos

    public void seleccionDeRaza() {

        int flag = 1;

        do {
            System.out.println("Ingrese la raza de su personaje: ");
            System.out.println("1. Humano: +5 vida +5 stamina");
            System.out.println("2. Orco: +8 vida + 3 stamina");
            System.out.println("3. elfo: +3 vida + 8 stamina");
            int razaUsuario = sc.nextInt();

            System.out.println("Ustes esta seguro de su eleccion? 1.Si - 2.No");
            int continuar = sc.nextInt();

            if (continuar == 1) {
                flag = 0;
            }

            if (flag == 0 && razaUsuario == 1) {
                setVida(getVida() + 5);
                setMana(getMana() + 5);
                setNombreRaza("Humano");
            } else if (flag == 0 && razaUsuario == 2) {
                setVida(getVida() + 8);
                setMana(getMana() + 3);
                setNombreRaza("Orco");
            } else {
                setVida(getVida() + 3);
                setMana(getMana() + 8);
                setNombreRaza("Elfo");
            }

        } while (flag == 1);
    }

    public void clasePersonaje(){

        int flag = 1;

        do {
            System.out.println("Ingrese la clase de su personaje: ");
            System.out.println("1. Guerrero: +8 vida +2 stamina");
            System.out.println("2. Mago: +2 vida +8 stamina");
            System.out.println("3. Arquero: +4 vida +4 stamina");
            int clasePersonaje = sc.nextInt();

            System.out.println("Ustes esta seguro de su eleccion? 1.Si - 2.No");
            int continuar = sc.nextInt();

            if (continuar == 1) {
                flag = 0;
            }

            if (flag == 0 && clasePersonaje == 1) {
                setVida(getVida() + 8);
                setMana(getMana() + 2);
                setNombreClase("Guerrero");
            } else if (flag == 0 && clasePersonaje == 2) {
                setVida(getVida() + 2);
                setMana(getMana() + 8);
                setNombreClase("Mago");
            } else {
               setVida(getVida() + 4);
               setMana(getMana() + 4);
               setNombreClase("Arquero");
            }

        } while (flag == 1);

    }


    public void mostrarPj (){

        System.out.println("-------------------------------------");
        System.out.println("| Estadisticas:");
        System.out.println("| Vida: " + getVida());
        System.out.println("| Mana: " + getMana());
        System.out.println("| Raza: " + getNombreRaza());
        System.out.println("| Clase: " + getNombreClase());
        System.out.println("-------------------------------------");
    }

public void creacionDePj(){

    seleccionDeRaza();
    clasePersonaje();
    mostrarPj ();

}

    //endregion

}
