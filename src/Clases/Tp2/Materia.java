package Clases.Tp2;

public class Materia {

    //region atributos

    private String nombre;
    private int cargaHoraria;
    private String profesor;
    private int nota;

    //endregion

    //region constructores


    public Materia(String nombre, int cargaHoraria, String profesor, int nota) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.profesor = profesor;
        this.nota = nota;
    }

    public Materia() {
    }

//endregion

    //region G y S

    public String getNombre() {
        return nombre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    //endregion
}
