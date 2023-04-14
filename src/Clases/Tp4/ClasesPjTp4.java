package Clases.Tp4;

public class ClasesPjTp4 extends PersonajeTp4 {



//region metodos clasePJ
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


