package Clases.Tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner sc = new Scanner(System.in);
    private ArrayList<ContactoAgenda> listaContactos = new ArrayList<>();

    public void menuAgenda() {

        int continuar = 1;
        ContactoAgenda contactoAux;

        do {

            System.out.println("Elija una opcion:");
            System.out.println("1.Agregar contacto.");
            System.out.println("2.Modificar contacto.");
            System.out.println("3.Eliminar contacto.");
            System.out.println("4.Buscar contacto.");
            System.out.println("5.Mostrar Contactos agenda.");
            System.out.println("6.Salir.");

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    agregarContactoAgenda();
                    break;

                case 2:
                    System.out.print("Ingrese nombre del contacto que desea modificar: ");
                    contactoAux = buscarPorNombreRetornaContacto(sc.next());
                    menuModificarContacto(contactoAux);
                    break;

                case 3:
                    System.out.print("Ingrese nombre del contacto que desea borrar: ");
                    eliminarContacto(sc.next());
                    break;

                case 4:
                    System.out.print("Ingrese nombre del contacto que desea buscar: ");
                    contactoAux = buscarPorNombreRetornaContacto(sc.next());
                    mostrarContacto(contactoAux);
                    break;

                case 5:
                    mostrarLista();
                    break;

                case 6:
                    continuar = 0;
                    break;

                default:
                    System.out.println("La opcion no es valida");
                    break;
            }

        } while (continuar == 1);

        sc.close();
    }

    //region metodos

    public void agregarContactoAgenda() {

        ContactoAgenda nuevoContacto = new ContactoAgenda();

        System.out.print("Ingrese el nombre del nuevo contacto: ");
        nuevoContacto.setNombre(sc.next());
        System.out.print("Ingrese el número del nuevo contacto: ");
        nuevoContacto.setNumero(sc.nextInt());
        System.out.print("Ingrese el e-mail del nuevo contacto: ");
        nuevoContacto.setEmail(sc.next());

        this.listaContactos.add(nuevoContacto);
        mostrarContacto(nuevoContacto);
        System.out.println("El contacto se agrego con exito.");

    }

    public void menuModificarContacto(ContactoAgenda contacto) {

        System.out.println("Que desea modificar de " + contacto.getNombre());
        mostrarContacto(contacto);
        System.out.println(" ");
        System.out.println("1.Nombre");
        System.out.println("2.Numero");
        System.out.println("3.E-mail");
        System.out.println("4.Todo");
        System.out.println("5.Volver al menu anterior.");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese nombre: ");
                contacto.setNombre(sc.next());
                break;

            case 2:
                System.out.print("Ingrese numero: ");
                contacto.setNumero(sc.nextInt());
                break;

            case 3:
                System.out.println("Ingrese e-mail: ");
                contacto.setEmail(sc.next());
                break;

            case 4:
                System.out.print("Ingrese nombre: ");
                contacto.setNombre(sc.next());
                System.out.print("Ingrese numero: ");
                contacto.setNumero(sc.nextInt());
                System.out.print("Ingrese e-mail: ");
                contacto.setEmail(sc.next());
                break;

            case 5:
                break;
        }
        System.out.println("Contacto modificado: ");
        mostrarContacto(contacto);
    }

    public void eliminarContacto(String nombreContactoBuscado) {

        for (ContactoAgenda contacto : this.listaContactos) {

            if (contacto.getNombre().equalsIgnoreCase(nombreContactoBuscado)) {
                this.listaContactos.remove(contacto);
                System.out.println("Eliminado con exito.");
                break;
            }
        }
    }

    public void mostrarContacto(ContactoAgenda contacto) {
        System.out.println("------------------------------------------------");
        System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("e-mail: " + contacto.getEmail());
        System.out.println("Numero: " + contacto.getNumero());
        System.out.println("------------------------------------------------");
    }


    public ContactoAgenda buscarPorNombreRetornaContacto(String nombreContacto) {

        ContactoAgenda contactoAux = null;

        for (ContactoAgenda contac : this.listaContactos) {
            if (listaContactos == null) {
                System.out.println("vacia");
            }
            if (contac.getNombre().equalsIgnoreCase(nombreContacto)) {
                contactoAux = contac;
                break;
            }
        }
        return contactoAux;
    }

    public void mostrarLista() {
        for (ContactoAgenda contactoAux : listaContactos) {
            mostrarContacto(contactoAux);
        }
    }
    //endregion

}