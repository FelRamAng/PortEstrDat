package Pract001_U3_Estr_Datos;

import java.util.Scanner;

public class Main
{
    public static String getInput()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args)
    {
        int op = 0;
        Scanner scanner1 = new Scanner(System.in);
        Lista productos = new Lista();

        do
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~ Menú de Opciones ~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 1) Insertar al Inicio ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~ 2) Insertar al Final ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 3) Eliminar al Inicio ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 4) Eliminar al Final ~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~ 5) Buscar Producto por Precio ~~~~~~~~");
            System.out.println("~~~~~~~ 6) Buscar Producto por Cantidad ~~~~~~~");
            System.out.println("~~~~~~ 7) Buscar Producto por Descripción ~~~~~");
            System.out.println("~~~~~~~ 8) Mostrar contenido de la lista ~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~ 9) Salir ~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println("Escriba una Opcion:");
            op = scanner1.nextInt();

            switch(op)
            {
                case 1:
                {
                    System.out.println("");
                    System.out.println("Escriba la Descripción del Producto: ");
                    String Desc = getInput();
                    System.out.println("Escriba el Precio del Producto: ");
                    float Precio = scanner1.nextFloat();
                    System.out.println("Escriba la Cantidad del Producto: ");
                    int Cant = scanner1.nextInt();
                    productos.InsertarAlInicio(new Producto(Desc, Precio, Cant));
                    break;
                }
                case 2:
                {
                    System.out.println("");
                    System.out.println("Escriba la Descripción del Producto: ");
                    String Desc = getInput();
                    System.out.println("Escriba el Precio del Producto: ");
                    float Precio = scanner1.nextFloat();
                    System.out.println("Escriba la Cantidad del Producto: ");
                    int Cant = scanner1.nextInt();
                    productos.InsertarAlFinal(new Producto(Desc, Precio, Cant));
                    break;
                }
                case 3:
                {
                    productos.EliminarAlInicio();
                    break;
                }
                case 4:
                {
                    productos.EliminarAlFinal();
                    break;
                }
                case 5:
                {
                    System.out.println("");
                    System.out.println("Escriba el Precio a Buscar: ");
                    String Buscar = getInput();
                    productos.BuscarProducto(2, Buscar);
                    break;
                }
                case 6:
                {
                    System.out.println("");
                    System.out.println("Escriba la Cantidad a Buscar: ");
                    String Buscar = getInput();
                    productos.BuscarProducto(3, Buscar);
                    break;
                }
                case 7:
                {
                    System.out.println("");
                    System.out.println("Escriba la Descripción a Buscar: ");
                    String Buscar = getInput();
                    productos.BuscarProducto(1, Buscar);
                    break;
                }
                case 8:
                {
                    productos.MostrarProductos();
                    break;
                }
                case 9:
                {
                    System.exit(0);
                    break;
                }
            }
        }while(op < 9);
    }
}
