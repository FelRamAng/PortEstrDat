package Practica_06_Estruct;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Ordenamiento
{
    private int Valores[];
    private int Cont;
    private int Tam;

    Scanner scanner = new Scanner(System.in);

    void Inicializar_Arreglo()
    {
        System.out.println("Ingrese de que Tamaño es el Arreglo:");
        Tam = scanner.nextInt();

        int Aux[] = new int[Tam];
        for(int i = 0; i < Tam; i++)
        {
            Aux[i] = 0;
        }
        Cont = -1;
        Valores = Aux;
        Mostrar_Menu();
    }

    void Insertar_Datos()
    {
        String linea;
        try
        {
            InputStream fileInputStream = new FileInputStream("datos.txt");
            InputStreamReader reader = new InputStreamReader(fileInputStream, Charset.forName("UTF-8"));

            BufferedReader br = new BufferedReader(reader);
            while((linea = br.readLine()) != null)
            {
                Cont++;
                String[] Valor = linea.split(",");
                Valores[Cont] = Integer.parseInt(Valor[1]);
            }
            System.out.println("");
            System.out.println("Se Guardaron los Datos.");
            System.out.println("");
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("No se Encontró el Archivo.");
        }
        catch (IOException exception)
        {
            System.out.println("No se Pudo Abrir el Archivo.");
        }
    }

    void Mostrar_Datos()
    {
        for(int i = 0; i < Valores[Cont]; i++)
        {
            System.out.println("~~~~~~~~~~~~~ DATO " + (i+1) + " ~~~~~~~~~~~~~");
            System.out.println("           Valor: " + Valores[i] + "           ");
        }
    }

    void Mostrar_Menu()
    {
        int op = 0;
        do
        {
            System.out.println("~~~~~~~~~~~~~ MENU DE OPCIONES ~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 1.- Llenar Arreglo ~~~~~~~~~~~~");
            System.out.println("~~ 2.- Ordenamiento Ascendente los Valores ~~");
            System.out.println("~ 3.- Ordenamiento Descendente los Valores ~");
            System.out.println("~~~~~ 4.- Mostrar Contenido del Arreglo ~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~ 5.- Salir ~~~~~~~~~~~~~~~~~");
            op = scanner.nextInt();

            switch(op)
            {
                case 1:
                {
                    Insertar_Datos();
                    break;
                }
                case 2:
                {
                    QuickSortAs(Valores,);
                    break;
                }
                case 3:
                {
                    QuickSortDes();
                    break;
                }

                case 4:
                {
                    Mostrar_Datos();
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
            }
        }while(op > 0);
    }

    int Particion(int[] Valores, int Izq, int Der)
    {
        int Pivote = Valores[Izq];
        while (true)
        {
            while (Valores[Izq] < Pivote)
            {
                Izq ++;
            }
            while (Valores[Der] > Pivote)
            {
                Der --;
            }
            if (Izq >= Der)
            {
                return Der;
            }
            else
            {
                int Temporal = Valores[Izq];
                Valores[Izq] = Valores[Der];
                Valores[Der] = Temporal;

                Izq ++;
                Der --;
            }
        }
    }

    void QuickSortAs(int Valores[], int Izq, int Der)
    {

        if (Izq < Der)
        {
            int IndiceParticion = Particion(Valores, Izq, Der);
            QuickSortAs(Valores, Izq, IndiceParticion);
            QuickSortAs(Valores, IndiceParticion + 1, Der);
        }
    }

    void QuickSortDes(int Valores[], int Izq, int Der)
    {

        if (Izq > Der)
        {
            int IndiceParticion = Particion(Valores, Izq, Der);
            QuickSortDes(Valores, IndiceParticion, Izq);
            QuickSortDes(Valores, Der, IndiceParticion + 1);
        }
    }
}
