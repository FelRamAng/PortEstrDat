package Practica_05_Estruct;

import java.util.Scanner;

public class Clientes
{
    String Dato, Nombre[];
    int NumTel[];
    int Saldo[];
    int Index;
    int Tam;

    Scanner scanner = new Scanner(System.in);

    boolean Arreglo_Lleno()
    {
        if (Index == Tam - 1)
        {
            System.out.println("El Arreglo Está Lleno.");
            return true;
        } else
        {
            return false;
        }
    }

    void Inicializar_Arreglo()
    {
        System.out.println("Ingrese el Número de Clientes:");
        Tam = scanner.nextInt();

        String Aux[] = new String[Tam];
        int Aux1[] = new int[Tam];
        int Aux2[] = new int[Tam];
        for (int i = 0; i < Tam; i++) {
            Aux[i] = "";
            Aux1[i] = 0;
            Aux2[i] = 0;
        }
        Index = -1;
        Nombre = Aux;
        NumTel = Aux1;
        Saldo = Aux2;
        Mostrar_Menu();
    }

    void Insertar_Datos()
    {
        if(!Arreglo_Lleno())
        {
            Index ++;
            Nombre[Index] = Dato;
            while (Nombre[Index] == null)
            {
                System.out.println("Ingrese un Nombre Válido:");
                Nombre[Index] = scanner.next();
            }
            System.out.println("");
            System.out.println("Escriba el Número Telefónico del Cliente");
            NumTel[Index] = scanner.nextInt();
            while (NumTel[Index] <= 0)
            {
                System.out.println("Ingrese un Número Telefónico Válido:");
                NumTel[Index] = scanner.nextInt();
            }
            System.out.println("");
            System.out.println("Escriba el Saldo del Cliente");
            Saldo[Index] = scanner.nextInt();
            while (Saldo[Index] <= 0)
            {
                System.out.println("Ingrese un Saldo de Cliente Válido:");
                Saldo[Index] = scanner.nextInt();
            }
        }
    }

    void Mostrar_Datos()
    {
        for(int i = 0; i < Nombre.length; i++)
        {
            System.out.println("~~~~~~~~~~~~~ PERSONA " + (i+1) + " ~~~~~~~~~~~~~");
            System.out.println("Nombre: " + Nombre[i] + "   |   Telefono: " + NumTel[i] + "   |   Saldo: " + Saldo[i]);
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

                                auxEdad = NumTel[i];
                                NumTel[i] = NumTel[i - salto];
                                NumTel[i - salto] = auxEdad;

                                auxEst = Saldo[i];
                                Saldo[i] = Saldo[i - salto];
                                Saldo[i - salto] = auxEst;

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

                                auxEdad = NumTel[i];
                                NumTel[i] = NumTel[i - salto];
                                NumTel[i - salto] = auxEdad;

                                auxEst = Saldo[i];
                                Saldo[i] = Saldo[i - salto];
                                Saldo[i - salto] = auxEst;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 3:
            {
                for(salto = NumTel.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < NumTel.length; i++)
                        {
                            if(NumTel[i-salto] > NumTel[i])
                            {
                                auxEdad = NumTel[i];
                                NumTel[i] = NumTel[i - salto];
                                NumTel[i - salto] = auxEdad;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEst = Saldo[i];
                                Saldo[i] = Saldo[i - salto];
                                Saldo[i - salto] = auxEst;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 4:
            {
                for(salto = NumTel.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < NumTel.length; i++)
                        {
                            if(NumTel[i-salto] < NumTel[i])
                            {
                                auxEdad = NumTel[i];
                                NumTel[i] = NumTel[i - salto];
                                NumTel[i - salto] = auxEdad;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEst = Saldo[i];
                                Saldo[i] = Saldo[i - salto];
                                Saldo[i - salto] = auxEst;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
            case 5:
            {
                for(salto = NumTel.length / 2; salto != 0; salto /= 2)
                {
                    Cambios = true;
                    while(Cambios)
                    {
                        Cambios = false;
                        for(i = salto; i < NumTel.length; i++)
                        {
                            if(Saldo[i-salto] > Saldo[i])
                            {
                                auxEst = Saldo[i];
                                Saldo[i] = Saldo[i - salto];
                                Saldo[i - salto] = auxEst;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEdad = NumTel[i];
                                NumTel[i] = NumTel[i - salto];
                                NumTel[i - salto] = auxEdad;

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
                            if(Saldo[i-salto] < Saldo[i])
                            {
                                auxEst = Saldo[i];
                                Saldo[i] = Saldo[i - salto];
                                Saldo[i - salto] = auxEst;

                                auxS = Nombre[i];
                                Nombre[i] = Nombre[i - salto];
                                Nombre[i - salto] = auxS;

                                auxEdad = NumTel[i];
                                NumTel[i] = NumTel[i - salto];
                                NumTel[i - salto] = auxEdad;

                                Cambios = true;
                            }
                        }
                    }
                }
                break;
            }
        }
    }

    void Mostrar_Menu()
    {
        int op = 0;
        do
        {
            System.out.println("~~~~~~~~~~~~~ MENU DE OPCIONES ~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~ 1.- Insertar Datos ~~~~~~~~~~~~");
            System.out.println("~~ 2.- Ordenamiento Ascendente por Nombre ~~");
            System.out.println("~ 3.- Ordenamiento Descendente por Nombre ~");
            System.out.println("~ 4.- Ordenamiento Ascendente por Telefono ~");
            System.out.println("~ 5.- Ordenamiento Descendente por Telefono ~");
            System.out.println("~~~ 6.- Ordenamiento Ascendente por Saldo ~~~");
            System.out.println("~~ 7.- Ordenamiento Descendente por Saldo ~~");
            System.out.println("~~~~~ 8.- Mostrar Contenido del Arreglo ~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~ 9.- Salir ~~~~~~~~~~~~~~~~~");
            op = scanner.nextInt();

            switch(op)
            {
                case 1:
                {
                    System.out.println("Escriba el Nombre del Cliente:");
                    Dato = scanner.next();
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
                    Mostrar_Datos();
                    break;
                }
                case 9:
                {
                    System.exit(0);
                }
            }
        }while(op > 0);
    }
}
