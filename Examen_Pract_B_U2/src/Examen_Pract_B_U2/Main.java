package Examen_Pract_B_U2;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        int op = 0;
        int Tam = 0;
        int tope = -1;

        System.out.println("Escriba el Tamaño de la Cola:");
        Tam = scanner.nextInt();
        int Cola[][] = new int[Tam][2];

        do {
            System.out.println("~~~~~~~~~~ Menú de Opciones ~~~~~~~~~~");
            System.out.println("~~~~~~~~~~ 1.- Llenar Cola ~~~~~~~~~~~");
            System.out.println("~~~~ 2.- Atender Prioridad Precio ~~~~");
            System.out.println("~~~ 3.- Atender Prioridad Cantidad ~~~~");
            System.out.println("~~~~~~~~~ 4.- Atender Normal ~~~~~~~~~");
            System.out.println("~~~~~~~~~~ 5.- MOSTRAR COLA ~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~ 0.- SALIR ~~~~~~~~~~~~~");
            System.out.println("");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    if (tope < Tam)
                    {
                        try
                        {

                            try (Scanner leerArchivo = new Scanner(new File("datos.txt")))
                            {
                                leerArchivo.useDelimiter("[|,]");
                                while (leer.hasNext() && tope < Tam - 1)
                                {
                                    tope++;
                                    Cola[tope][0] = leer.nextInt();
                                    Cola[tope][1] = leer.nextInt();
                                }
                            }
                        }
                        catch (IOException e)
                        {
                            e.printStackTrace();
                        }
                    }
                    else
                    {
                        System.out.println("La Pila ya Está Llena");
                    }
                    break;
                }
                case 2:
                {
                    for (int i = 0; i < Tam - 1; i++)
                    {
                        for (int j = i + 1; j < Tam; j++)
                        {
                            if (Cola[i][1] >= Cola[j][1])
                            {
                                int auxPrecio = Cola[i][1];
                                int auxCant = Cola[i][0];
                                Cola[i][0] = Cola[j][0];
                                Cola[i][1] = Cola[j][1];
                                Cola[j][0] = auxCant;
                                Cola[j][1] = auxPrecio;
                            }
                        }
                    }
                    break;
                }
                case 3:
                {
                    for (int i = 0; i < Tam - 1; i++)
                    {
                        for (int j = i + 1; j < Tam; j++)
                        {
                            if (Cola[i][0] >= Cola[j][0])
                            {
                                int AuxPrecio = Cola[i][1];
                                int AuxCant = Cola[i][0];
                                Cola[i][0] = Cola[j][0];
                                Cola[i][1] = Cola[j][1];
                                Cola[j][0] = AuxCant;
                                Cola[j][1] = AuxPrecio;
                            }
                        }
                    }
                    break;
                }
                case 4:
                {
                    break;
                }
                case 5:
                {
                    for (int i = 0; i < Cola.length; i++)
                    {
                        System.out.println("Cantidad de Articulos: " + Cola[i][0] + " | Precio de Artículos: $" + Cola[i][1]);
                    }
                }

            }
        }
        while (op <= 0);
    }
}
