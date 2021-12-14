package Arreglo;

import java.util.Scanner;

public class Articulos {
    Scanner scanner = new Scanner(System.in);

    int Tam, Cont;
    String  Dato;
    String Descrip[];
    Double Prec[];

    boolean Arreglo_Lleno()
    {
        if (Cont == Tam - 1)
        {
            System.out.println("El Arreglo Está Lleno.");
            return true;
        } else
        {
            return false;
        }
    }

    void Crear_Arreglo()
    {
        System.out.println("Escriba la Cantidad de Artículos que Registrará:");
        Tam = scanner.nextInt();

        String Aux[] = new String[Tam];
        Double Aux1[] = new Double[Tam];

        for (int i = 0; i < Tam; i ++)
        {
            Aux[i] = "";
            Aux1[i] = 0.0;
        }

        Descrip = Aux;
        Prec = Aux1;
        Cont = -1;
        Menu();
    }

    void Insertar_Dato()
    {
        if(!Arreglo_Lleno())
        {
            Cont ++;
            Descrip[Cont] = Dato;
            while (Descrip[Cont] == null)
            {
                System.out.println("Ingrese un Nombre Válido:");
                Descrip[Cont] = scanner.next();
            }
            System.out.println("");
            System.out.println("Escriba el Precio del Artículo");
            Prec[Cont] = scanner.nextDouble();
            while (Prec[Cont] <= 0)
            {
                System.out.println("Ingrese un Valor Válido:");
                Prec[Cont] = scanner.nextDouble();
            }

        }
    }

    void Mostrar_Arreglo()
    {
        for (int i = 0; i <= Cont; i ++)
        {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Descripción del Articulo: " + Descrip[i] + " Precio: " + Prec[i]);
        }
    }

    void Ordenar_Arreglo(int opcion)
    {
        int Valida = 0;
        String ValorString = "";
        double ValorDouble = 0.0;

        switch (opcion)
        {
            case 1: // Ascendente Descripcion
            {
                for (int i = 0; i < Cont - 1; i ++)
                {
                    for (int j = i + 1; j < Cont; j ++)
                    {
                        if (Descrip[j].compareTo(Descrip[i]) < 0)
                        {
                            ValorString = Descrip[i];
                            Descrip[i] = Descrip[j];
                            Descrip[j] = ValorString;

                            ValorDouble = Prec[i];
                            Prec[i] = Prec[j];
                            Prec[j] = ValorDouble;
                        }
                    }
                }
                break;
            }
            case 2:
            {
                for (int i = 0; i < Cont - 1; i ++)
                {
                    for (int j = i + 1; j < Cont; j ++)
                    {
                        if (Descrip[j].compareTo(Descrip[i]) > 0)
                        {
                            ValorString = Descrip[i];
                            Descrip[i] = Descrip[j];
                            Descrip[j] = ValorString;

                            ValorDouble = Prec[i];
                            Prec[i] = Prec[j];
                            Prec[j] = ValorDouble;
                        }
                    }
                }
                break;
            }
            case 3: //Ascendente Precio
            {
                for (int i = 0; i < Cont - 1; i ++)
                {
                    for (int j = i + 1; j < Cont; j ++)
                    {
                        if (Prec[i] >= Prec[j])
                        {
                            ValorString = Descrip[i];
                            Descrip[i] = Descrip[j];
                            Descrip[j] = ValorString;

                            ValorDouble = Prec[i];
                            Prec[i] = Prec[j];
                            Prec[j] = ValorDouble;
                        }
                    }
                }
                break;
            }
            case 4:
            {
                for (int i = 0; i < Cont - 1; i ++)
                {
                    for (int j = i + 1; j < Cont; j ++)
                    {
                        if (Prec[i] < Prec[j])
                        {
                            ValorString = Descrip[i];
                            Descrip[i] = Descrip[j];
                            Descrip[j] = ValorString;

                            ValorDouble = Prec[i];
                            Prec[i] = Prec[j];
                            Prec[j] = ValorDouble;
                        }
                    }
                }
                break;
            }
        }
    }

    void Menu()
    {
        int op = 0;
        do
        {
            System.out.println("------------- Menú -------------");
            System.out.println("----------- 0) Salir -----------");
            System.out.println("------- 1) Crear Arreglo -------");
            System.out.println("------- 2) Insertar Dato -------");
            System.out.println("------- 3) Ordenar Datos -------");
            System.out.println("---------- 4) Valores ----------");
            System.out.println("----- Seleccione Una Opción -----");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    Crear_Arreglo();
                    break;
                }
                case 2:
                {
                    if(Cont == Tam -1)
                    {
                        Arreglo_Lleno();
                    }
                    else
                    {
                        System.out.println("Escriba la Descripción del Objeto a Insertar:");
                        Dato = scanner.next();
                        Insertar_Dato();
                    }
                    break;
                }
                case 3:
                {
                    Menu_Ord();
                    break;
                }
                case 4:
                {
                    Mostrar_Arreglo();
                    break;
                }
            }
        } while (op > 0);
    }

    void Menu_Ord() {
        int op = 0;
        do {
            System.out.println("--------- Menú de Ordenamiento ---------");
            System.out.println("--------------- 0) Salir ---------------");
            System.out.println("-- 1) Ordenar Descripción Ascendente --");
            System.out.println("-- 2) Ordenar Descripción Descendente --");
            System.out.println("----- 3) Ordenar Precio Ascendente -----");
            System.out.println("---- 4) Ordenar Precio Descendente ----");
            System.out.println("-------------- 5) Valores --------------");
            System.out.println("-------- Seleccione una Opción --------");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    Ordenar_Arreglo(1);
                    break;
                }
                case 2:
                {
                    Ordenar_Arreglo(2);
                    break;
                }
                case 3:
                {
                    Ordenar_Arreglo(3);
                    break;
                }
                case 4:
                {
                    Ordenar_Arreglo(4);
                    break;
                }
                case 5:
                {
                    Mostrar_Arreglo();
                    break;
                }
            }
        } while (op > 0);
    }
}