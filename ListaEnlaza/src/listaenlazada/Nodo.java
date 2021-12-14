package listaenlazada;

public class Nodo
{
    public int numero;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(int x)
    {
        numero = x;
        siguiente = null;
        anterior = null;
    }

    public Nodo()
    {

    }
}
