package Clases;

import java.util.Comparator;
import java.util.Scanner;

public class Agenda {
    Scanner sc = new Scanner(System.in);
    private ContactoAgenda[] contactos = new ContactoAgenda[100];

    public void menuAgenda() {

        int continuar = 1;

        do {

            System.out.println("Elija una opcion:");
            System.out.println("1.Agregar contacto.");
            System.out.println("2.Modificar contacto.");
            System.out.println("3.Eliminar contacto.");
            System.out.println("4.Buscar contacto.");
            System.out.println("5.Salir.");

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> agregarContactoAgenda();
                case 2 -> modificarContacto();
                case 3 -> eliminarContacto();
                case 4 -> buscarContacto();
                case 5 -> continuar = 0;
                default -> System.out.println("La opcion no es valida");
            }

        } while (continuar == 1);

    }

    //region metodos

    public void agregarContactoAgenda() {

        int ultimaPosicionVacia = 0;

        for (int i = 0; contactos[i] != null; i++) {
            System.out.println(ultimaPosicionVacia);
            ultimaPosicionVacia = i + 1;

        }

        System.out.print("Ingrese el nombre del nuevo contacto: ");
        this.contactos[ultimaPosicionVacia] = new ContactoAgenda();

        this.contactos[ultimaPosicionVacia].setNombreContacto(sc.next());

        System.out.print("Ingrese el numero del contacto: ");
        this.contactos[ultimaPosicionVacia].setNumeroContacto(sc.nextInt());

        System.out.print("Ingrese el e-mail del contacto: ");
        this.contactos[ultimaPosicionVacia].setEmailContacto(sc.next());
    }

    public void modificarContacto() {

        String nombreContactoBuscado;
        int flag = 0;

        System.out.print("Ingrese el nombre del contacto que busca: ");
        nombreContactoBuscado = sc.next();

        //buscamos contacto si existe o no
        for (int i = 0; i < contactos.length; i++) {

            if (contactos[i].equals(nombreContactoBuscado)) {
                System.out.print("Ingrese el nuevo nombre del contacto: ");
                this.contactos[i].setNombreContacto(sc.next());
                System.out.print("Ingrese el nuevo numero del contacto: ");
                this.contactos[i].setNumeroContacto(sc.nextInt());
                System.out.print("Ingrese el nuevo e-mail del contacto: ");
                this.contactos[i].setEmailContacto(sc.next());
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("No se encontro ese nombre de contacto");
        }
    }

    public void eliminarContacto() {

        System.out.print("Ingrese el nombre del contacto que desea eliminar: ");
        String nombreContactoBuscado = sc.next();

        for (int i = 0; i < contactos.length; i++) {

            if (contactos[i].getNombre().equals(nombreContactoBuscado)) {
                contactos[i] = null;
                System.out.println("Eliminado con exito.");
                break;
            }
        }
        //endregion
    }

    public void buscarContacto() {

        String nombreBuscado;
        String emailBuscado;
        int numeroBuscado = 0;

        System.out.println("Ingrese el nombre del contacto que busca: ");
        nombreBuscado = sc.next();

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].getNombre().equals(nombreBuscado)) {
                System.out.println("Nombre: " + nombreBuscado);
                emailBuscado = this.contactos[i].getEmail();
                System.out.println("e-mail: " + emailBuscado);
                numeroBuscado = this.contactos[i].getNumero();
                System.out.println("Numero: " + numeroBuscado);
                break;
            } else {
                System.out.println("No se encontro el contacto " + nombreBuscado);
            }
        }
    }

    //endregion

}