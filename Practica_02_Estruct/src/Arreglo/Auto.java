package Arreglo;

import java.util.Scanner;

public class Auto {
    Scanner scanner = new Scanner(System.in);

    int Tam;
    int Dato;
    int Cont;
    int Placa[];
    String Color[];
    String Modelo[];

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
        System.out.println("Escriba la Cantidad de Autos que Resgistrará:");
        Tam = scanner.nextInt();
        int Aux[] = new int[Tam];
        String Aux1[] = new String[Tam];
        String Aux2[] = new String[Tam];

        for(int i = 0; i < Tam; i ++)
        {
            Aux[i] = 0;
            Aux1[i] = "";
            Aux2[i] = "";
        }
        Placa = Aux;
        Color = Aux1;
        Modelo = Aux2;
        Cont = -1;
        Menu();
    }

    void Insertar_Dato() {
        if (!Arreglo_Lleno()) {
            Cont++;
            Placa[Cont] = Dato;
            while (Dato <= -1) {
                System.out.println("Ingrese un Valor Valido.");
                Dato = scanner.nextInt();
                Placa[Cont] = Dato;
            }
            System.out.println("");
            System.out.println("Escriba el Color del Auto:");
            Color[Cont] = scanner.next();
            while (Color[Cont] == null) {
                System.out.println("Ingrese un Valor Valido.");
                Color[Cont] = scanner.next();
            }
            System.out.println("");
            System.out.println("Escriba el Modelo del Auto:");
            Modelo[Cont] = scanner.next();
            while (Color[Cont] == null) {
                System.out.println("Ingrese un Valor Valido.");
                Color[Cont] = scanner.next();
            }
            System.out.println("");
        }
    }

    void Ordenar_Arreglo(int caso) {
        int Aux;
        String AuxS;
        switch (caso) {
            case 1:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Placa[i] >= Placa[j]) {
                            Aux = Placa[i];
                            Placa[i] = Placa[j];
                            Placa[j] = Aux;

                            AuxS = Color[i];
                            Color[i] = Color[j];
                            Color[j] = AuxS;

                            AuxS = Modelo[i];
                            Modelo[i] = Modelo[j];
                            Modelo[j] = AuxS;
                        }
                    }
                }
                break;
            }
            case 2:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Placa[i] <= Placa[j]) {
                            Aux = Placa[i];
                            Placa[i] = Placa[j];
                            Placa[j] = Aux;

                            AuxS = Color[i];
                            Color[i] = Color[j];
                            Color[j] = AuxS;

                            AuxS = Modelo[i];
                            Modelo[i] = Modelo[j];
                            Modelo[j] = AuxS;
                        }
                    }
                }
                break;
            }
            case 3:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Color[j].compareTo(Color[i]) < 0) {
                            Aux = Placa[i];
                            Placa[i] = Placa[j];
                            Placa[j] = Aux;

                            AuxS = Color[i];
                            Color[i] = Color[j];
                            Color[j] = AuxS;

                            AuxS = Modelo[i];
                            Modelo[i] = Modelo[j];
                            Modelo[j] = AuxS;
                        }
                    }
                }
                break;
            }
            case 4:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Color[j].compareTo(Color[i]) > 0) {
                            Aux = Placa[i];
                            Placa[i] = Placa[j];
                            Placa[j] = Aux;

                            AuxS = Color[i];
                            Color[i] = Color[j];
                            Color[j] = AuxS;

                            AuxS = Modelo[i];
                            Modelo[i] = Modelo[j];
                            Modelo[j] = AuxS;
                        }
                    }
                }
                break;
            }
            case 5:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Modelo[j].compareTo(Modelo[i]) < 0) {
                            Aux = Placa[i];
                            Placa[i] = Placa[j];
                            Placa[j] = Aux;

                            AuxS = Color[i];
                            Color[i] = Color[j];
                            Color[j] = AuxS;

                            AuxS = Modelo[i];
                            Modelo[i] = Modelo[j];
                            Modelo[j] = AuxS;
                        }
                    }
                }
                break;
            }
            case 6:
            {
                for (int i = 0; i < Tam -1; i ++) {
                    for (int j = i + 1; j < Tam; j ++) {
                        if (Modelo[j].compareTo(Modelo[i]) > 0) {
                            Aux = Placa[i];
                            Placa[i] = Placa[j];
                            Placa[j] = Aux;

                            AuxS = Color[i];
                            Color[i] = Color[j];
                            Color[j] = AuxS;

                            AuxS = Modelo[i];
                            Modelo[i] = Modelo[j];
                            Modelo[j] = AuxS;
                        }
                    }
                }
                break;
            }
        }
    }

    void Mostrar_Arreglo() {
        for (int i = 0; i <= Cont; i++) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Numero: " + (Placa[i]) + " Color: " + (Color[i]) + " Modelo : " + (Modelo[i]) + " Posición en la Lista: " + (i + 1));
        }
    }

    void Menu() {
        int op = 0;
        do {
            System.out.println("------------- Menú -------------");
            System.out.println("----------- 0) Salir -----------");
            System.out.println("------- 1) Crear Arreglo -------");
            System.out.println("------- 2) Insertar Dato -------");
            System.out.println("------- 3) Ordenar Datos -------");
            System.out.println("---------- 4) Valores ----------");
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
                        System.out.println("Digíte el Número que Placa que Desea Insertar:");
                        Dato = scanner.nextInt();
                        Insertar_Dato();
                    }
                    break;
                }
                case 3: {
                    Menu_Ord();
                    break;
                }
                case 4: {
                    Mostrar_Arreglo();
                    break;
                }
            }
        } while (op > 0);
    }

    void Menu_Ord() {
        int op = 0;
        do {
            System.out.println("------ Menú de Ordenamiento ------");
            System.out.println("------------ 0) Salir ------------");
            System.out.println("-- 1) Ordenar Placas Ascendente --");
            System.out.println("-- 2) Ordenar Placas Descendente --");
            System.out.println("--- 3) Ordenar Color Ascendente ---");
            System.out.println("-- 4) Ordenar Color Descendente --");
            System.out.println("-- 5) Ordenar Modelo Ascendente --");
            System.out.println("-- 6) Ordenar Modelo Descendente --");
            System.out.println("----------- 7) Valores -----------");
            System.out.println("------ Seleccione una Opción ------");
            op = scanner.nextInt();

            switch (op) {
                case 1: {
                    Ordenar_Arreglo(1);
                    break;
                }
                case 2: {
                    Ordenar_Arreglo(2);
                    break;
                }
                case 3: {
                    Ordenar_Arreglo(3);
                    break;
                }
                case 4: {
                    Ordenar_Arreglo(4);
                    break;
                }
                case 5: {
                    Ordenar_Arreglo(5);
                    break;
                }
                case 6: {
                    Ordenar_Arreglo(6);
                    break;
                }
                case 7: {
                    Mostrar_Arreglo();
                    break;
                }
            }
        } while (op > 0);
    }
}