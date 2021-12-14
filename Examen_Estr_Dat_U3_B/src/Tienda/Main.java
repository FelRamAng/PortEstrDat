package Tienda;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Lista clientes = new Lista();
        Scanner scanner = new Scanner(System.in);

        int op = 0;

        do
        {
            System.out.println("~~~~~~~~~~~~~~~ Menú de Opciones ~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 1) Llegada de Cliente ~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 2) Atiende Caja Rápida ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~ 3) Atiende Caja General ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~ 4) Mostrar Fila ~~~~~~~~~~~~~~~");
            System.out.println(" ~~~~~~~~~~~~~~~~~~ 5) Salir ~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("Escriba una Opción:");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    System.out.println("");
                    System.out.println("Escriba la Cantidad de Articulos del Cliente: ");
                    int CantArt = scanner.nextInt();
                    System.out.println("Escriba el Total a Pagar del Cliente: $");
                    int CantPag = scanner.nextInt();

                    clientes.InsertarCliente(new Cliente(CantArt, CantPag, false));
                    break;
                }
                case 2:
                {
                    clientes.CajaRapida();
                    break;
                }
                case 3:
                {
                    clientes.CajaGeneral();
                    break;
                }
                case 4:
                {
                    clientes.VerFila();
                    break;
                }
                case 5:
                {
                    System.exit(0);
                    break;
                }
            }
        }
        while (op < 6);
    }
}
