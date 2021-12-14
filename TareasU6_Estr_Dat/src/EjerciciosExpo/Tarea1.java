package EjerciciosExpo;

import java.util.Scanner;

public class Tarea1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] Vector = new int[20];
        int Negativos = 0;
        int[] Posicion = new int[20];

        for (int i = 0; i < 5; i ++)
        {
            System.out.println("Escriba el Número " + (i + 1) + ":");
            Vector[i] = scanner.nextInt();

            if (Vector[i] < 0)
            {
                Negativos ++;
                Posicion[i] = 1;
            }
        }

        System.out.println("Hay " + Negativos + " Numeros Negativos");
        for (int i = 0; i < 5; i ++)
        {
            if (Posicion[i] != 0)
            {
                System.out.println("Numero: " + Vector[Posicion[i]] + " ¬¬¬ Posicion" + Posicion[i]);
            }
        }
    }
}