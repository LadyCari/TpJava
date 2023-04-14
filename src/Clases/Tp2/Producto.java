package Clases.Tp2;

public class Producto {

    //region atributos
    private String nombre;
    private int codigo;
    private String descripcion;
    private int stock;
    private int precio;
    private int añoVencimiento;
    //endregion

    //region constructor
    public Producto(String nombre, int codigo, String descripcion, int stock, int precio, int añoVencimiento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.añoVencimiento = añoVencimiento;
    }

    public Producto() {
    }
    //endregion

    //region G y S

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public int getPrecio() {
        return precio;
    }

    public int getAñoVencimiento() {
        return añoVencimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setAñoVencimiento(int añoVencimiento) {
        this.añoVencimiento = añoVencimiento;
    }

//endregion

}
