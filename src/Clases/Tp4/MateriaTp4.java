package Clases.Tp4;

public class MateriaTp4 {

    ProfesorTp4 profesor = new ProfesorTp4();
    EstudianteTp4 estudiante = new EstudianteTp4();

    public void asignarNombres() {
        profesor.setNombre("Maria");
        estudiante.setNombre("Carlos");
        profesor.setMateria("Filosofia");
        estudiante.setCarrera("Ingenieria");
    }

    public void situacion(){
        System.out.println("El profesor " + profesor.getNombre() + profesor.enseñar() + " la materia " + profesor.getMateria());
        System.out.println("El estudiante " + estudiante.getNombre() + estudiante.estudiar() + " la carrera " + estudiante.getCarrera());
    }
}
