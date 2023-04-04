package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Gesion {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Producto> listaProductos = new ArrayList<>();


    public void menuGestion() {

        int continuar = 1;
        hardCodeo();

        do {
            System.out.println("Ingrese la opcion que desea:");
            System.out.println("1.Compra de producto.");
            System.out.println("2.Venta de producto.");
            System.out.println("3.Busqueda por ID de producto");
            System.out.println("4.Mostrar lista productos.");
            System.out.println("5.Salir.");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> compraProductos();
                case 2 -> ventaProducto();
                case 3 -> busquedaProductoPorID();
                case 4 -> mostrarLista();
                case 5 -> continuar = 0;
            }

        } while (continuar == 1);
    }

    public void compraProductos() {

        int flag = 0;

        System.out.print("Ingrese el nombre del producto que desea comprar: ");
        String producto = sc.next();

        for (Producto productoAux : listaProductos) {
            if (productoAux.getNombre().equals(producto)) {
                flag = 1;
                System.out.print("Ingrese cuanta cantidad desea comprar: ");
                int compra = sc.nextInt();

                productoAux.setStock(productoAux.getStock() + compra);
                System.out.println("Compra exitosa.");
                mostrarProducto(productoAux);
            }
        }

        if (flag == 0) {
            System.out.println("Dicho producto no existe en su posecion.");
        }
    }

    public void ventaProducto() {
        int flag = 0;

        System.out.print("Ingrese el nombre del producto que vendio: ");
        String producto = sc.next();

        for (Producto productoAux : listaProductos) {
            if (productoAux.getNombre().equals(producto)) {
                flag = 1;
                System.out.print("Ingrese cuanta cantidad vendio: ");
                int venta = sc.nextInt();

                productoAux.setStock(productoAux.getStock() - venta);
                System.out.println("venta exitosa.");
                mostrarProducto(productoAux);
            }
        }

        if (flag == 0) {
            System.out.println("Dicho producto no existe en su posecion.");
        }
    }

    public void busquedaProductoPorID() {

        int flag = 0;

        System.out.println("Ingrese el ID del producto");
        int idProducto = sc.nextInt();

        for (Producto productoAux : listaProductos) {
            if (productoAux.getCodigo() == idProducto) {
                mostrarProducto(productoAux);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("El ID de producto no existe");
        }
    }

    public void mostrarProducto(Producto productoAux) {
        System.out.println("===============================");
        System.out.println("nombre: " + productoAux.getNombre());
        System.out.println("Descripcion: " + productoAux.getDescripcion());
        System.out.println("Stock: " + productoAux.getStock());
        System.out.println("ID: " + productoAux.getCodigo());
        System.out.println("Precio: $" + productoAux.getPrecio());
        if (productoAux.getAñoVencimiento() < 2023) {
            System.out.println("Producto: vencido");
        } else if (productoAux.getAñoVencimiento() == 2023) {
            System.out.println("Producto: Pronto a vencerse");
        } else {
            System.out.println("Vencimiento: " + productoAux.getAñoVencimiento());
        }
        System.out.println("===============================");
    }

    public void mostrarLista (){
        for (Producto productoAux : listaProductos){
            mostrarProducto(productoAux);
        }
    }

    public void hardCodeo() {

        Producto producto1 = new Producto("Papa", 1, "verdura", 30, 5, 2024);
        Producto producto2 = new Producto("Manteca", 2, "lacteo", 45, 140, 2022);
        Producto producto3 = new Producto("Leche", 3, "Lacteo", 27, 200, 2023);
        Producto producto4 = new Producto("Arroz", 4, "Harinas", 156, 300, 2024);

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);

    }

}


