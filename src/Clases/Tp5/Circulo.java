package Clases.Tp5;

public class Circulo extends FiguraGeometrica{

    //region atributos
    protected float radio;
//endregion

    //region S y G

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //endregion

    //region constructor

    public Circulo(float radio) {
        this.radio = radio;
    }

    //endregion

//region metodos

    @Override
    public float calcularArea() {
        return 3.14f * (radio * radio);
    }


    //endregion
}
