package listaenlazada;

import java.util.Scanner;

public class ListaEnlazada extends ListaOperacion
{
    public static void main(String [] args) throws Exception {
        ListaOperacion MetListOper = new ListaOperacion();

        Scanner scanner = new Scanner(System.in);
        int op;
        int info;

        do
        {
            System.out.println("Opciones");
            System.out.println("1.- Agregar al Inicio");
            System.out.println("2.- Agregar al Final");
            System.out.println("3.- Buscar");
            System.out.println("4.- Eliminar");
            System.out.println("5.- Ordenar");
            System.out.println("6.- Visualizar");
            System.out.println("7.- Salir");
            System.out.println(" ");
            System.out.println("Eliga una Opción:");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    int Valor = scanner.nextInt();
                    MetListOper.InsertaralInicio(Valor);
                    break;
                }
                case 2:
                {
                    int Valor = scanner.nextInt();
                    MetListOper.InsertaFin(Valor);
                    break;
                }
                case 3:
                {
                    int Valor = scanner.nextInt();
                    MetListOper.Buscar(Valor);
                    break;
                }
                case 4:
                {
                    System.out.println("Escriba el Valor que Desea Eliminar:");
                    int entrada = scanner.nextInt();
                    MetListOper.Eliminar(entrada);
                    break;
                }
                case 5:
                {
                    MetListOper.Ordenar();
                }
                case 6:
                {
                    MetListOper.Verlista();
                }
            }
        }
        while (op <6);
    }
}
