package EjerciciosExpo;

import java.util.Scanner;

public class Tarea4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int Monedas = 0;
        int Cambio = 0;

        System.out.println("Escriba el Número de Monedas de Cada Tipo:");
        System.out.println("1. $1");
        System.out.println("2. $5");
        System.out.println("3. $10");
        System.out.println("4. $25");
        System.out.println("5. $50");
        System.out.println("6. $100");
        Monedas = scanner.nextInt();
        System.out.println("Escriba el Cambio a Regresar: ");
        Cambio = scanner.nextInt();

        if(Cambio == 0)
        {
            System.out.println("No se Puede Devolver el Cambio");
        }
        else
        {
            if(Cambio >= 100)
            {
                int monedas100 = Cambio / 100;
                Cambio = Cambio % 100;
                System.out.println("Se Devolverán " + monedas100 + " Monedas de $100");
            }
            if(Cambio >= 50)
            {
                int monedas50 = Cambio / 50;
                Cambio = Cambio % 50;
                System.out.println("Se Devolverán " + monedas50 + " Monedas de $50");
            }
            if(Cambio >= 25)
            {
                int monedas25 = Cambio / 25;
                Cambio = Cambio % 25;
                System.out.println("Se Devolverán " + monedas25 + " Monedas de $25");
            }
            if(Cambio >= 10)
            {
                int monedas10 = Cambio / 10;
                Cambio = Cambio % 10;
                System.out.println("Se Devolverán " + monedas10 + " Monedas de $10");
            }
            if(Cambio >= 5)
            {
                int monedas5 = Cambio / 5;
                Cambio = Cambio % 5;
                System.out.println("Se Devolverán " + monedas5 + " Monedas de $5");
            }
            if(Cambio >= 1)
            {
                int monedas1 = Cambio / 1;
                Cambio = Cambio % 1;
                System.out.println("Se Devolverán " + monedas1 + " Monedas de $1");
            }
        }
    }
}
