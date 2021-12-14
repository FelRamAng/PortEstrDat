package Tienda;

public class Cliente
{
    private int TotArticulos;
    private int Total;
    private boolean Atendido;

    public Cliente(int totArticulos, int total, boolean atendido)
    {
        TotArticulos = totArticulos;
        Total = total;
        Atendido = atendido;
    }

    public int getTotArticulos()
    {
        return TotArticulos;
    }

    public void setTotArticulos(int totArticulos)
    {
        TotArticulos = totArticulos;
    }

    public int getTotal()
    {
        return Total;
    }

    public void setTotal(int total)
    {
        Total = total;
    }

    public boolean isAtendido()
    {
        return Atendido;
    }

    public void setAtendido(boolean atendido)
    {
        Atendido = atendido;
    }

    @Override
    public String toString()
    {
        String Cadena = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Total de Articulos: " + TotArticulos + "\n" +
                "Total a Pagar: $" + Total + "\n" +
                "Atendido: " + Atendido;
        return Cadena;
    }
}
