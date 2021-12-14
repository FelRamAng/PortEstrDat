package Practica002;

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
		Lista alumnos = new Lista();
		
		do
		{
			System.out.println("			MENU DE OPCIONES");
			System.out.println("	1) Insertar al Inicio.");
			System.out.println("	2) Insertar al Final.");
			System.out.println("	3) Eliminar.");
			System.out.println("	4) Buscar Alumno por Calificacion 1.");
			System.out.println("	5) Buscar Alumno por Nombre.");
			System.out.println("	6) Mostrar contenido de la lista.");
			System.out.println("	7) Salir.");
			op = read.nextInt();
			
			switch(op)
			{
				case 1:
				{
					System.out.println("Ingrese el nombre del Alumno: ");
					String nombre = getInput();
					System.out.println("Ingrese la calificación 1: ");
					int c1 = read.nextInt();
					System.out.println("Ingrese la calificación 2: ");
					int c2 = read.nextInt();
					alumnos.insertarInicio(new Alumno(nombre, c1, c2));
					break;
				}
				case 2:
				{
					System.out.println("Ingrese el nombre del Alumno: ");
					String nombre = getInput();
					System.out.println("Ingrese la calificación 1: ");
					int c1 = read.nextInt();
					System.out.println("Ingrese la calificación 2: ");
					int c2 = read.nextInt();
					alumnos.insertarFinal(new Alumno(nombre, c1, c2));
					break;
				}
				case 3:
				{
					alumnos.eliminar();
					System.out.println("Alumno Eliminado.");
					break;
				}
				case 4:
				{
					System.out.println("Ingresa la Calificación 1 a Buscar: ");
					String busc = getInput();
					alumnos.buscarAlumno(2, busc);
					break;
				}
				case 5:
				{
					System.out.println("Ingresa el Nombre a Buscar: ");
					String busc = getInput();
					alumnos.buscarAlumno(1, busc);
					break;
				}
				case 6:
				{
					alumnos.verAlumnos();
					break;
				}
				case 7:
				{
					System.out.println("Cerrando programa...");
					System.exit(0);
					break;
				}
			}
		}while(op < 7);
	}
}
