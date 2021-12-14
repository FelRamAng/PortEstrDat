package EjerciciosExpo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un Número del 1 al 10: ");
        int n = scanner.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>();
        combinacionesSuma(n, numeros, 0);
    }

    public static void combinacionesSuma(int numero, ArrayList<Integer> numeros, int suma)
    {
        if (suma == numero)
        {
            System.out.println(numeros);
        } else
        {
            for (int i = 1; i <= numero; i++)
            {
                suma += i;
                if (suma <= numero) {
                    numeros.add(i);
                    combinacionesSuma(numero, numeros, suma);
                    numeros.remove(numeros.indexOf(i));
                }
                suma -= i;
            }
        }
    }
}
