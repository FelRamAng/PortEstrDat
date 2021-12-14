package listageneral;

public class nodolista
{
    private int data; //tipo de dato
    private nodolista next; // enlace de tipo nodolista, se encarga de hacer enlace de nodo a nodo

    public nodolista(int d, nodolista n)
    {
        data = d;
        next = n;
    }

    public int getData()
    {
        return data;
    }

    public nodolista getNext()
    {
        return next;
    }

    public void setNext(nodolista n)
    {
         next = n;
    }
}
