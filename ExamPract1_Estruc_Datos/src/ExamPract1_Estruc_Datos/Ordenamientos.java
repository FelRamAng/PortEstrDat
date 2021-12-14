package ExamPract1_Estruc_Datos;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Ordenamientos
{
    private String Nombre[];
    private int Edad[];
    private int Estatura[];
    private int Index;

    Scanner scanner = new Scanner(System.in);

    void Inicializar_Arreglo()
    {
        String Aux[] = new String[200];
        int Aux1[] = new int[200];
        int Aux2[] = new int[200];
        for(int i = 0; i < 200; i++)
        {
            Aux[i] = "";
            Aux1[i] = 0;
            Aux2[i] = 0;
        }
        Index = -1;
        Nombre = Aux;
        Edad = Aux1;
        Estatura = Aux2;
        Mostrar_Menu();
    }

    void Insertar_Datos()
    {
        String linea;
        try
        {
            InputStream fileInputStream = new FileInputStream("datos.txt");
            InputStreamReader reader = new InputStreamReader(fileInputStream, Charset.forName("UTF-8"));

            BufferedReader br = new BufferedReader(reader);
            while((linea = br.readLine()) != null)
            {
                Index++;
                String[] Valor = linea.split(",");
                Nombre[Index] = Valor[0];
                Edad[Index] = Integer.parseInt(Valor[1]);
                Estatura[Index] = Integer.parseInt(Valor[2]);
            }
            System.out.println("");
            System.out.println("Se Guardaron los Datos.");
            System.out.println("");
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("No se Encontró el Archivo.");
        }
        catch (IOException exception)
        {
            System.out.println("No se Pudo Abrir el Archivo.");
        }
    }

    void Mostrar_Datos()
    {
        for(int i = 0; i < Nombre.length; i++)
        {
            System.out.println("~~~~~~~~~~~~~ PERSONA " + (i+1) + " ~~~~~~~~~~~~~");
            System.out.println("Nombre: " + Nombre[i] + "   |   Edad: " + Edad[i] + "   |   Estatura: " + Estatura[i]);
        }
    }

    void Mostrar_Menu()
    {
        int op = 0;
        do
        {
            System.out.println("~~~~~~~~~~~~~ MENU DE OPCIONES ~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 1.- Llenar Arreglo ~~~~~~~~~~~~");
            System.out.println("~~ 2.- Ordenamiento Ascendente por Nombre ~~");
            System.out.println("~~ 3.- Ordenamiento Descendente por Nombre ~~");
            System.out.println("~~~ 4.- Ordenamiento Ascendente por Edad ~~~");
            System.out.println("~~ 5.- Ordenamiento Descendente por Edad ~~");
            System.out.println("~ 6.- Ordenamiento Ascendente por Estatura ~");
            System.out.println("~ 7.- Ordenamiento Descendente por Estatura ~");
            System.out.println("~~~~~~~~~~ 8.- Busqueda por Nombre ~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~ 9.- Busqueda por Edad ~~~~~~~~~~~");
            System.out.println("~~~~~~~~ 10.- Busqueda por Estatura ~~~~~~~~");
            System.out.println("~~~~ 11.- Mostrar Contenido del Arreglo ~~~~");
            System.out.println("~~~~~~~~~~~~~~~ 12.- Terminar ~~~~~~~~~~~~~~~");
            op = scanner.nextInt();

            switch(op)
            {
                case 1:
                {
                    Insertar_Datos();
                    break;
                }
                case 2:
                {
                    Ordenar_Arreglo(1);
                    break;
                }
                case 3:
                {
                    Ordenar_Arreglo(2);
                    break;
                }
                case 4:
                {
                    Ordenar_Arreglo(3);
                    break;
                }
                case 5:
                {
                    Ordenar_Arreglo(4);
                    break;
                }
                case 6:
                {
                    Ordenar_Arreglo(5);
                    break;
                }
                case 7:
                {
                    Ordenar_Arreglo(6);
                    break;
                }
                case 8:
                {
                    Busqueda_Secuencial(1);
                    break;
                }
                case 9:
                {
                    Busqueda_Secuencial(2);
                    break;
                }
                case 10:
                {
                    Busqueda_Secuencial(3);
                    break;
                }
                case 11:
                {
                    Mostrar_Datos();
                    break;
                }
                case 12:
                {
                    System.exit(0);
                }
            }
        }while(op > 0);
    }

    String getInputText()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    void Busqueda_Secuencial(int opcion)
    {
        boolean Buscar = false;
        switch(opcion)
        {
            case 1:
            {
                System.out.println("Ingrese el Nombre que desea buscar: ");
                String name = getInputText();

                for(int i = 0; i < Nombre.length; i++)
                {
                    if(name.equals(Nombre[i]))
                    {
                        System.out.println("~~~~~~~~~~~~~ Persona " + (i+1) +" ~~~~~~~~~~~~~");
                        System.out.println("Nombre: " + Nombre[i] + "   |   Edad: " + Edad[i] + "   |   Estatura: " + Estatura[i]);
                        Buscar = true;
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println("Ingrese la Edad que desea buscar: ");
                int Edad = scanner.nextInt();

                for(int i = 0; i < this.Edad.length; i++)
                {
                    if(Edad == this.Edad[i])
                    {
                        System.out.println("~~~~~~~~~~~~~ PERSONA " + (i+1) +" ~~~~~~~~~~~~~");
                        System.out.println("Nombre: " + Nombre[i] + "   |   Edad: " + this.Edad[i] + "   |   Estatura: " + Estatura[i]);
                        Buscar = true;
                    }
                }
                break;
            }
            case 3:
            {
                System.out.println("Ingrese la Estatura que desea buscar: ");
                int Estatura = scanner.nextInt();

                for(int i = 0; i < this.Estatura.length; i++)
                {
                    if(Estatura == this.Estatura[i])
                    {
                        System.out.println("~~~~~~~~~~~~~ PERSONA " + (i+1) +" ~~~~~~~~~~~~~");
                        System.out.println("Nombre: " + Nombre[i] + "   |   Edad: " + Edad[i] + "   |   Estatura: " + this.Estatura[i]);
                        Buscar = true;
                    }
                }
                break;
            }
        }
        if(Buscar == false)
        {
            System.out.println("No se Encontró el Elemento a Buscar.");
        }
    }

    void Ordenar_Arreglo(int opcion)
    {
        String auxS = "";
        int auxEdad = 0;
        int auxEst = 0;
        int salto, aux, i;
        boolean Cambios;

        switch(opcion)
        {
            case 1:
            {
                for(salto = Nombre.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < Nombre.length; i++)
                        {
                            if(Nombre[i-salto].compareTo(Nombre[i]) > 0)
                            {
                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEdad = Edad[i];
                                Edad[i] = Edad[i - salto];
                                Edad[i - salto] = auxEdad;

                                auxEst = Estatura[i];
                                Estatura[i] = Estatura[i - salto];
                                Estatura[i - salto] = auxEst;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 2:
            {
                for(salto = Nombre.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < Nombre.length; i++)
                        {
                            if(Nombre[i-salto].compareTo(Nombre[i]) < 0)
                            {
                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEdad = Edad[i];
                                Edad[i] = Edad[i - salto];
                                Edad[i - salto] = auxEdad;

                                auxEst = Estatura[i];
                                Estatura[i] = Estatura[i - salto];
                                Estatura[i - salto] = auxEst;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 3:
            {
                for(salto = Edad.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < Edad.length; i++)
                        {
                            if(Edad[i-salto] > Edad[i])
                            {
                                auxEdad = Edad[i];
                                Edad[i] = Edad[i - salto];
                                Edad[i - salto] = auxEdad;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEst = Estatura[i];
                                Estatura[i] = Estatura[i - salto];
                                Estatura[i - salto] = auxEst;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 4:
            {
                for(salto = Edad.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < Edad.length; i++)
                        {
                            if(Edad[i-salto] < Edad[i])
                            {
                                auxEdad = Edad[i];
                                Edad[i] = Edad[i - salto];
                                Edad[i - salto] = auxEdad;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEst = Estatura[i];
                                Estatura[i] = Estatura[i - salto];
                                Estatura[i - salto] = auxEst;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 5:
            {
                for(salto = Edad.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < Edad.length; i++)
                        {
                            if(Estatura[i-salto] > Estatura[i])
                            {
                                auxEst = Estatura[i];
                                Estatura[i] = Estatura[i - salto];
                                Estatura[i - salto] = auxEst;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEdad = Edad[i];
                                Edad[i] = Edad[i - salto];
                                Edad[i - salto] = auxEdad;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 6:
            {
                for(salto = Nombre.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < Nombre.length; i++)
                        {
                            if(Estatura[i-salto] < Estatura[i])
                            {
                                auxEst = Estatura[i];
                                Estatura[i] = Estatura[i - salto];
                                Estatura[i - salto] = auxEst;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEdad = Edad[i];
                                Edad[i] = Edad[i - salto];
                                Edad[i - salto] = auxEdad;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
        }
    }
}