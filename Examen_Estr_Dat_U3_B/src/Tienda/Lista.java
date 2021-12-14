package Tienda;

public class Lista
{
    private Nodo cabecera = null;

    private class Nodo
    {
        public Cliente cliente;
        public Nodo siguiente = null;

        public Nodo(Cliente cliente)
        {
            this.cliente = cliente;
        }
    }

    public void CajaGeneral()
    {
        Nodo n;
        n = cabecera;

        System.out.println("~~~~~~~~~~ Caja General ~~~~~~~~~~");

        while (n != null)
        {
            if (n.cliente.isAtendido() == false)
            {
                System.out.println("Cantidad de Articulos: " + n.cliente.getTotArticulos());
                System.out.println("Total a Pagar: $" + n.cliente.getTotal());
                n.cliente.setAtendido(true);
            }
            n = n.siguiente;
        }
    }

    public void CajaRapida()
    {
        Nodo n;
        n = cabecera;

        System.out.println("~~~~~~~~~~ Caja Rapida ~~~~~~~~~~");

        while (n != null)
        {
            if (n.cliente.getTotArticulos() < 5 && n.cliente.isAtendido() == false)
            {
                System.out.println("Cantidad de Articulos: " + n.cliente.getTotArticulos());
                System.out.println("Total a Pagar: $" + n.cliente.getTotal());
                n.cliente.setAtendido(true);
            }
            n = n.siguiente;
        }
    }

    public void InsertarCliente(Cliente cliente)
    {
        Nodo nodo = new Nodo(cliente);
        Nodo puntero = cabecera;

        if (puntero != null)
        {
            while (puntero.siguiente != null)
            {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }
        else
        {
            cabecera = nodo;
        }
    }

    public void VerFila()
    {
        Nodo n;
        n = cabecera;

        while (n != null)
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Cantidad de Artículos: " + n.cliente.getTotArticulos());
            System.out.println("Total Pagar: $" + n.cliente.getTotal());
            if (n.cliente.isAtendido())
            {
                System.out.println("El Cliente Fue Atendido");
            }
            else if (n.cliente.isAtendido() == false)
            {
                System.out.println("El Cliente NO Fue Atendido");
            }
            n = n.siguiente;
        }
    }
}
