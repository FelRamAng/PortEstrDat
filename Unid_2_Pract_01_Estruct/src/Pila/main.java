package Pila;

import java.io.*;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner entrada = null;
        Scanner scanner = new Scanner(System.in);

        int op = 0;
        int Tam = 0, Indice = -1;

        System.out.println("Escriba el Tamaño de la Pila");
        Tam = scanner.nextInt();

        int Pila[] = new int[Tam];

        do
        {
            System.out.println("~~~~~~~~~~ Menu de Opciones ~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~ 1) Llenar Pila ~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~ 2) Sacar Elemento ~~~~~~~~~");
            System.out.println("~~~~~~~~~~~ 3) Mostrar Pila ~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~ 4) Salir ~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("Ingrese la Opcion deseada:");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    if (Indice < Tam)
                    {
                        try
                        {
                            String Linea;
                            String NuevaLinea;
                            int NumLinea = 1;
                            boolean Contiene = false;
                            String Ruta = "datos.txt";
                            File F = new File(Ruta);
                            entrada = new Scanner(F);
                            while (entrada.hasNext())
                            {
                                Linea = entrada.nextLine();
                                if (Linea.contains("/"))
                                {
                                    Contiene = true;
                                }
                                if (Contiene)
                                {
                                    NuevaLinea = Linea;
                                    while (NuevaLinea.length() > 0 && Indice < Tam - 1)
                                    {
                                        String[] Resultado = NuevaLinea.split("/", 2);
                                        String Primero = Resultado[0];
                                        String Resto = Resultado[1];

                                        if (Primero.contains("/"))
                                        {

                                        }
                                        else
                                        {
                                            Indice ++;
                                            Pila[Indice] = Integer.parseInt(Primero);
                                        }
                                        NuevaLinea = Resto;
                                    }
                                    NumLinea ++;
                                }
                                else
                                {
                                    System.out.println("No se Encontró el Texto");
                                }
                            }
                        }
                        catch (FileNotFoundException e)
                        {
                            System.out.println(e.toString());
                        }
                        catch (NullPointerException e)
                        {
                            System.out.println(e.toString() + "No se encontró el Archivo");
                        }
                        catch (Exception e)
                        {
                            System.out.println(e.toString());
                        }
                        finally
                        {
                            if (entrada != null)
                            {
                                entrada.close();
                            }
                        }
                    }
                    else
                    {
                        System.out.println("La Pila ya se Encuentra Llena");
                    }
                    break;
                }
                case 2:
                {
                    Pila[Indice] = 0;
                    Indice --;
                    break;
                }
                case 3:
                {
                    if (Indice != -1)
                    {
                        for (int i = Indice; i >= 0; i --)
                        {
                            System.out.println("| " + Pila[i] + " |");
                        }
                    }
                    else
                    {
                        System.out.println("La Pila Está Vacía");
                    }
                    break;
                }
            }
        }
        while (op != 4);
    }
}