package Pract002_U3_Estr_Datos;

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
        Lista alumnos = new Lista();

        do
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~ Menú de Opciones ~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 1) Insertar al Inicio ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~ 2) Insertar al Final ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~ 3) Eliminar  ~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~ 4) Buscar Alumno por Calificacion 1 ~~~~~");
            System.out.println("~~~~~~~~~ 5) Buscar Alumno por Nombre ~~~~~~~~~");
            System.out.println("~~~~~~~ 6) Mostrar contenido de la lista ~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~ 7) Salir ~~~~~~~~~~~~~~~~~~~");
            op = scanner1.nextInt();

            switch(op)
            {
                case 1:
                {
                    System.out.println("Escriba el Nombre del Alumno: ");
                    String nombre = getInput();
                    System.out.println("Escriba la Calificación 1: ");
                    int c1 = scanner1.nextInt();
                    System.out.println("Escriba la Calificación 2: ");
                    int c2 = scanner1.nextInt();
                    alumnos.insertarInicio(new Alumno(nombre, c1, c2));
                    break;
                }
                case 2:
                {
                    System.out.println("Escriba el Nombre del Alumno: ");
                    String nombre = getInput();
                    System.out.println("Escriba la Calificación 1: ");
                    int c1 = scanner1.nextInt();
                    System.out.println("Escriba la Calificación 2: ");
                    int c2 = scanner1.nextInt();
                    alumnos.insertarFinal(new Alumno(nombre, c1, c2));
                    break;
                }
                case 3:
                {
                    alumnos.eliminar();
                    break;
                }
                case 4:
                {
                    System.out.println("Escriba la Calificación 1 a Buscar: ");
                    String busc = getInput();
                    alumnos.buscarAlumno(2, busc);
                    break;
                }
                case 5:
                {
                    System.out.println("Escriba el Nombre a Buscar: ");
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
                    System.exit(0);
                    break;
                }
            }
        }while(op < 7);
    }
}
