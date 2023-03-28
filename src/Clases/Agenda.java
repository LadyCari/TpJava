package Clases;
import java.util.Scanner;

public class Agenda {
    Scanner sc = new Scanner(System.in);
    ContactoAgenda[] contactos = new ContactoAgenda[100];

    //region metodos

public void agregarContactoAgenda(){

    for (int i=0; i<contactos.length; i++){
        if (contactos[i] == null){
            break;
        }

        System.out.print("Ingrese el nombre del nuevo contacto: ");
        this.contactos[i].setNombreContacto(sc.next());

        System.out.print("Ingrese el numero del contacto: ");
        this.contactos[i].setNumeroContacto(sc.nextInt());

        System.out.println("Ingrese el e-mail del contacto: ");
        this.contactos[i].setEmailContacto(sc.next());

    }
}

public void modificarContacto(){

String nombreContactoBuscado;
boolean continuar;

    System.out.print("Ingrese el nombre del contacto que busca: ");
    nombreContactoBuscado = sc.next();

    //buscamos contacto si existe o no
    for (int i=0; i<contactos.length; i++){

        if (contactos[i].equals(nombreContactoBuscado)){
            System.out.print("Ingrese el nuevo nombre del contacto: ");
            this.contactos[i].setNombreContacto(sc.next());
            System.out.print("Ingrese el nuevo numero del contacto: ");
            this.contactos[i].setNumeroContacto(sc.nextInt());
            System.out.print("Ingrese el nuevo e-mail del contacto: ");
            this.contactos[i].setEmailContacto(sc.next());
            break;
        }else {
            System.out.println("No se encontro ese nombre de contacto");
        }
    }


}

    //endregion
}
