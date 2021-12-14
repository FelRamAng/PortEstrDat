package Pract002_U3_Estr_Datos;

public class Alumno
{
    private String nombre;
    private int calif1;
    private int calif2;

    public Alumno(String nombre, int calif1, int calif2)
    {
        super();
        this.nombre = nombre;
        this.calif1 = calif1;
        this.calif2 = calif2;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getCalif1()
    {
        return calif1;
    }

    public void setCalif1(int calif1)
    {
        this.calif1 = calif1;
    }

    public int getCalif2()
    {
        return calif2;
    }

    public void setCalif2(int calif2)
    {
        this.calif2 = calif2;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nNombre: " + nombre + "\nCalificacion 1: " + calif1 + "\nCalificacion 2: " + calif2;
    }
}
