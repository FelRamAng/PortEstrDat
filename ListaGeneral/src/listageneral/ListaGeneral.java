package listageneral;

import java.util.Scanner;

public class ListaGeneral
{
    private static nodolista inicio = null;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int op;
        int info;

        do
        {
            System.out.println("Opciones");
            System.out.println("1.- Agregar al Inicio");
            System.out.println("2.- Agregar al Final");
            System.out.println("3.- Buscar");
            System.out.println("4.- Eliminar Dato");
            System.out.println("5.- Imprimir");
            System.out.println("6.- Salir");
            System.out.println(" ");
            System.out.println("Eliga una Opción:");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    System.out.println("Ingrese la Info");
                    info = scanner.nextInt();
                    agregarAlInicio(info);
                    break;
                }
                case 2:
                {
                    System.out.println("Ingrese la Info");
                    info = scanner.nextInt();
                    agregarAlFinal(info);
                    break;
                }
                case 3:
                {
                    System.out.println("Escriba que Dato Desea Buscar");
                    info = scanner.nextInt();
                    BuscarContenido(info);
                    break;
                }
                case 4:
                {
                    System.out.println("Escriba el Dato a Eliminar:");
                    info = scanner.nextInt();
                    Eliminar(info);
                    break;
                }
                case 6:
                {
                    Imprimir();
                }
            }
        }
        while (op < 6);
    }

    public static void agregarAlFinal(int dato)
    {
        nodolista nuevo = new nodolista(dato, null);
        if(inicio == null)
        {
            inicio = nuevo;
        }
        else
        {
            nodolista aux = inicio;
            while (aux.getNext() != null)
            {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }
    }

    public static void agregarAlInicio(int dato)
    {
        nodolista nuevo = new nodolista(dato, null);
        if(inicio != null)
        {
            inicio = nuevo;
        }
        else
        {
            //nuevo elemento apunta al inicio
            nuevo.setNext(inicio);
            //inicio apunta al nuevo elemento
            inicio = nuevo;
        }
    }
    public static void Imprimir()
    {
        nodolista aux = inicio;
        while (aux != null)
        {
            System.out.println(aux.getData() + ";");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public static boolean BuscarContenido(int dato)
    {
        nodolista aux = inicio;

        while (aux != null)
        {
            if (dato == aux.getData())
            {
                aux = aux.getNext();
                return true;
            }
        }
        return false;
    }

    public static boolean Eliminar(int dato)
    {
        if (inicio != null)
        {
            if (inicio.getData() == dato)
            {
                inicio = inicio.getNext();
                return true;
            }
            else
            {
                nodolista aux = inicio;

                while (aux.getNext() != null)
                {
                    if (aux.getNext().getData() == dato)
                    {
                        aux.setNext(aux.getNext().getNext());
                        return true;
                    }
                    aux = aux.getNext();
                }
            }
        }
        return false;
    }
}
