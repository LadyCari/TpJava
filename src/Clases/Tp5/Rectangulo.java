package Clases.Tp5;

public class Rectangulo extends FiguraGeometrica {

    //region atributos
    protected float base;
    protected float altura;
//endregion

    //region G y S

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    //endregion

    //region constructor

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }


    //endregion

//region metodo
    @Override
    public float calcularArea() {
        return this.altura * this.base;
    }
    //endregion
}
