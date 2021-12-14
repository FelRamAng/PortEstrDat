package Practica001;

import java.util.Scanner;

public class main 
{
	public static String getInput()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void main(String[] args) 
	{
		int op = 0;
		Scanner read = new Scanner(System.in);
		Lista productos = new Lista();
		
		do
		{
			System.out.println("			MENU DE OPCIONES");
			System.out.println("	1) Insertar al Inicio.");
			System.out.println("	2) Insertar al Final.");
			System.out.println("	3) Eliminar al Inicio");
			System.out.println("	4) Eliminar al Final");
			System.out.println("	5) Buscar Producto por Precio.");
			System.out.println("	6) Buscar Producto por Cantidad.");
			System.out.println("	7) Buscar Producto por Descripción.");
			System.out.println("	8) Mostrar contenido de la lista.");
			System.out.println("	9) Salir.");
			op = read.nextInt();
			
			switch(op)
			{
				case 1:
				{
					System.out.println("");
					System.out.println("Ingrese la Descripción del Producto: ");
					String desc = getInput();
					System.out.println("Ingrese el Precio del Producto: ");
					float precio = read.nextFloat();
					System.out.println("Ingrese la cantidad del Producto: ");
					int cant = read.nextInt();
					productos.insertarAlInicio(new Producto(desc, precio, cant));
					break;
				}
				case 2:
				{
					System.out.println("");
					System.out.println("Ingrese la Descripción del Producto: ");
					String desc = getInput();
					System.out.println("Ingrese el Precio del Producto: ");
					float precio = read.nextFloat();
					System.out.println("Ingrese la cantidad del Producto: ");
					int cant = read.nextInt();
					productos.insertarAlFinal(new Producto(desc, precio, cant));
					break;
				}
				case 3:
				{
					productos.eliminarAlInicio();
					break;
				}
				case 4:
				{
					productos.eliminarFinal();
					break;
				}
				case 5:
				{
					System.out.println("Ingresa Precio a Buscar: ");
					String busc = getInput();
					productos.buscarProducto(2, busc);
					break;
				}
				case 6:
				{
					System.out.println("Ingresa Cantidad a Buscar: ");
					String busc = getInput();
					productos.buscarProducto(3, busc);
					break;
				}
				case 7:
				{
					System.out.println("Ingresa Descripción a Buscar: ");
					String busc = getInput();
					productos.buscarProducto(1, busc);
					break;
				}
				case 8:
				{
					productos.verProductos();
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
