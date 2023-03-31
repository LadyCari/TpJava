package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {

    //region atributos
    private String nombre;
    private int edad;
    private ArrayList<Materia> listaMaterias = new ArrayList<>();
    private float promedio;
    //endregion

    //region Constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        listaMaterias = new ArrayList<Materia>();
    }

//endregion

    //region S y G

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
//endregion

    Scanner sc = new Scanner(System.in);

    //region metodos

    public void menuEstudiante(){

        int continuar = 1;

        do{
            promedioMaterias();

            System.out.println("1.Agregar materias.");
            System.out.println("2.Perfil estudiante.");
            System.out.println("3.Salir");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    Materia auxMateria = crearMateria();
                    agregarMateriasALista(auxMateria);
                    break;

                case 2:
                    mostrarAlumno();
                    break;

                case 3:
                    continuar = 0;
                    break;

                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        }while (continuar == 1);
        sc.close();
    }

    public void agregarMateriasALista(Materia nuevaMateria){

        listaMaterias.add(nuevaMateria);
    }

    public Materia crearMateria(){

        Materia materiaAux = new Materia();

        System.out.print("Ingrese nombre de la materia: ");
        materiaAux.setNombre(sc.next());
        System.out.print("Ingrese la carga horaria: ");
        materiaAux.setCargaHoraria(sc.nextInt());
        System.out.print("Ingrese el nombre del profesor: ");
        materiaAux.setProfesor(sc.next());
        System.out.print("Ingrese nota final de la materia: ");
        materiaAux.setNota(sc.nextInt());

        return materiaAux;
    }

    public void promedioMaterias(){

        float sumaMaterias = 0;
        float contadorMaterias = 0;

        for (Materia auxMateria : listaMaterias){
            sumaMaterias += auxMateria.getNota();
            contadorMaterias++;
        }

        setPromedio(sumaMaterias/contadorMaterias);
    }

    public void mostrarAlumno (){
        System.out.println("----------------------------------------");
        System.out.println("|Alumno: " + getNombre());
        System.out.println("|Edad: " + getEdad());
        System.out.println("----------------------------------------");
        System.out.println("|Materias aprobadas:");
        mostrarLista();
        System.out.println("|Promedio final: " + getPromedio());
        System.out.println("----------------------------------------");
    }

    public void mostrarLista(){
        for (Materia aux : listaMaterias){
            System.out.println("|Materia: " + aux.getNombre() + " profesor: " + aux.getProfesor() + " nota: " + aux.getNota() + " carga horarias: " + aux.getCargaHoraria() + "hrs");
        }
    }
    //endregion

}
