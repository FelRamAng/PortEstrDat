package nuevapila;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nuevapila
{
    public static void main(String[] args)
    {
        int tope;
        int[] mipila;
        int maximo;
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Ingrese el tamaño de la pila:");
        maximo = sc.nextInt();
        mipila = new int[maximo];
        opcion = 0;
        tope = -1;

        while (opcion != 4)
        {
            System.out.println("Opciones");
            System.out.println("1.- Agregar");
            System.out.println("2.- Sacar");
            System.out.println("3.- Mostrar Pila");
            System.out.println("4.- Salir");
            System.out.println("");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    if (tope == maximo)
                    {
                        System.out.println("La pila está llena");
                    }
                    else
                    {
                        tope ++;
                        System.out.println("Ingrese el valor:");
                        mipila[tope] = sc.nextInt();
                        System.out.println(tope);
                    }
                    break;
                }
                case 2:
                {
                    if (tope == -1)
                    {
                        System.out.println("La pila esta vacia");
                    }
                    else
                    {
                        mipila[tope] = 0;
                        tope --;
                    }
                    break;
                }
                case 3:
                {
                    if (tope != -1)
                    {
                        System.out.println("La pila esta vacia");
                    }
                    else
                    {
                        for (int i = 0; i <= tope; i ++)
                        {
                            System.out.println(mipila[i]    );
                        }
                    }
                    break;
                }
            }
        }
    }
}
