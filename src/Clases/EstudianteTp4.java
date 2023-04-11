package Clases;

public class EstudianteTp4 extends PersonaTp4 {

    //region atributos

    private String carrera;

    //endregion

    //region S y G

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //endregion

    //region metodo

    public String estudiar(){
        return " esta estudiando ";
    }

    //endregion
}
