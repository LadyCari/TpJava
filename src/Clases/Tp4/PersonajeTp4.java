package Clases.Tp4;

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

    //endregion

}
