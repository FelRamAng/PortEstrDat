package Pract001_U3_Estr_Datos;

public class Producto
{
    private String Descripcion;
    private float Precio;
    private int Cantidad;

    public Producto(String Desc, float Precio, int Cant)
    {
        this.Descripcion = Desc;
        this.Precio = Precio;
        this.Cantidad = Cant;
    }

    public String getDescripcion()
    {
        return Descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.Descripcion = descripcion;
    }

    public float getPrecio()
    {
        return Precio;
    }

    public void setPrecio(float precio)
    {
        this.Precio = precio;
    }

    public int getCantidad()
    {
        return Cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.Cantidad = cantidad;
    }
}
