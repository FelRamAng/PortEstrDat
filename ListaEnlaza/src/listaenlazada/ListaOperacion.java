package listaenlazada;

import java.io.IOException;

public class ListaOperacion extends Nodo
{
    private Nodo cabecera;
    private Nodo puntero;

    public ListaOperacion()
    {
        cabecera = null;
        puntero = null;
    }

    public ListaOperacion InsertaralInicio(int x)
    {
        Nodo nuevo = new Nodo(x);
        if (Vacia())
        {
            cabecera = puntero = nuevo;
        }
        else
        {
            nuevo.siguiente = cabecera;
            cabecera.anterior = nuevo;
            cabecera = nuevo;
        }
        return this;
    }

    public ListaOperacion InsertaFin(int x)
    {
        Nodo nuevo = new Nodo(x);
        if (Vacia())
        {
            cabecera = puntero = nuevo;
        }
        else
        {
            puntero.siguiente = nuevo;
        }
        return this;
    }

    public void Eliminar(int entrada) throws Exception
    {
        Nodo actual;
        boolean encontrado = false;
        actual = cabecera;

        while ((actual != null) && (!encontrado))
        {
            encontrado = (actual.numero == entrada);
            if(!encontrado)
            {
                actual = actual.siguiente;
            }
        }

        if (actual != null)
        {
            if (actual == cabecera)
            {
                cabecera = actual.siguiente;

                if (actual.siguiente != null)
                {
                    actual.siguiente.anterior = null;
                }
            }
            else if (actual.siguiente != null)
            {
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
            }
            else
            {
                actual.anterior.siguiente = null;
            }
            if (actual == puntero)
            {
                puntero = actual.anterior;
            }

        }
    }

    public void Verlista()
    {
        Nodo n;
        n = cabecera;

        while (n != null)
        {
            System.out.print(n.numero);
            n = n.siguiente;
        }
    }

    public void Ordenar()
    {
        Nodo indice, subindice, indicemenor;

        for (indice = cabecera; indice != null; indice = indice.siguiente)
        {
            indicemenor = indice;
            for (subindice = indice.siguiente; subindice != null; subindice = subindice.siguiente)
            {
                if (indicemenor.numero < subindice.numero)
                {
                    indicemenor = subindice;
                }
            }
            if (indice != indicemenor)
            {
                intercambio(indice, indicemenor);
            }
        }
    }

    public void intercambio(Nodo i, Nodo j)
    {
        int aux;
        aux = (int) i.numero;
        i.numero = j.numero;
        j.numero = aux;
    }

    public boolean Vacia()
    {
        boolean Vacia = false;
        if (cabecera == null)
        {
            Vacia = true;
        }
        return Vacia;
    }

    public boolean Buscar(int entrada)
    {
        Nodo actual;
        boolean encontrado = false;
        actual = cabecera;
        while ((actual != null) && (!encontrado))
        {
            encontrado = (actual.numero == entrada);
            if(!encontrado)
            {
                actual = actual.siguiente;
            }
            else
            {
                System.out.println("El Valor Fué Encontrado");
                encontrado = true;
            }
        }

        if (encontrado == true)
        {
            System.out.println(actual);
        }
        else
        {
            System.out.println("El Valor NO Fué Encontrado");
        }
        return encontrado;
    }
}
