package Clases;

public class ProfesorTp4 extends PersonaTp4 {

    //region atributos
    private String materia;
    //endregion

    //region S y G

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    //endregion

    //region metodos

    public String enseñar(){
        return " esta enseñando ";
    }

    //endregion

}
