package Arreglo;

import java.util.Scanner;

public class Arreglo {
    Scanner scanner = new Scanner(System.in);

    int Tam;
    int Dato;
    int Cont;
    int Num[];

    boolean Arreglo_Vacio() {
        if (Cont == -1) {
            System.out.println("El Arreglo Está Vacío.");
            return true;
        }
            else {
                return false;
            }
    }

    boolean Arreglo_Lleno() {
        if (Cont == Tam - 1) {
            System.out.println("El Arreglo Está Lleno.");
            return true;
        } else {
            return false;
        }
    }

    void Crear_Arreglo() {
        System.out.println("Escriba la Cantidad de Valores que Ingresará:");
        Tam = scanner.nextInt();
        int Aux[] = new int[Tam];
        for(int i = 0; i < Tam; i ++)
        {
            Aux[i] = 0;
        }
        Num = Aux;
        Cont = -1;
        Menu();
    }

    void Insertar_Dato() {
        if (!Arreglo_Lleno()) {
            Cont++;
            Num[Cont] = Dato;
        }
    }

    void Ordenar_Arreglo(int caso) {
        int Aux;

        switch (caso) {
            case 1:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Num[i] >= Num[j]) {
                            Aux = Num[i];
                            Num[i] = Num[j];
                            Num[j] = Aux;
                        }
                    }
                }
                break;
            }
            case 2:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Num[i] <= Num[j]) {
                            Aux = Num[i];
                            Num[i] = Num[j];
                            Num[j] = Aux;
                        }
                    }
                }
                break;
            }
        }
    }

    void Mostrar_Arreglo() {
        for (int i = 0; i <= Cont; i++) {
            System.out.println("----------------------------------");
            System.out.println("Numero: " + (Num[i]) + " Posición en la Lista: " + (i + 1));
        }
    }

    void Menu() {
        int op = 0;
        do {
            System.out.println("------------- Menú -------------");
            System.out.println("----------- 0) Salir -----------");
            System.out.println("------- 1) Crear Arreglo -------");
            System.out.println("------- 2) Insertar Dato -------");
            System.out.println("-- 3) Ordenar Ascendentemente --");
            System.out.println("-- 4) Ordenar Descendentemente --");
            System.out.println("---------- 5) Valores ----------");
            System.out.println("----- Seleccione Una Opción -----");
            op = scanner.nextInt();

            switch (op) {
                case 1: {
                    Crear_Arreglo();
                    break;
                }
                case 2: {
                    if(Cont == Tam -1) {
                        Arreglo_Lleno();
                    }
                    else {
                        System.out.println("Digíte el Número que Desea Insertar:");
                        Dato = scanner.nextInt();
                        Insertar_Dato();
                    }
                    break;
                }
                case 3: {
                    Ordenar_Arreglo(1);
                    break;
                }
                case 4: {
                    Ordenar_Arreglo(2);
                    break;
                }
                case 5: {
                    Mostrar_Arreglo();
                    break;
                }
            }
        } while (op > 0);
    }
}