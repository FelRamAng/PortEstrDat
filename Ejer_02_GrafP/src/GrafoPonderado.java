import java.util.Scanner;

public class GrafoPonderado
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N;
        System.out.println("Escriba el Número de los Nodos del Grafo:");
        N = scanner.nextInt();
        int [][] Arreglo = new int [N][N];
        int [][] Adyacencias = new int [N][N];
        int [][] Pesos = new int [N][N];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.println("Escriba el Valor del Arreglo [" + i + "][" + j + "]: ");
                Arreglo [i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                System.out.println("Adyacencia en el Nodo [" + i + "][" + j + "]: ");
                System.out.println("Si No existe = 0");
                System.out.println("Si Existe = 1");

                Adyacencias [i][j] = scanner.nextInt();
                if(Adyacencias [i][j] == 1)
                {
                    System.out.println("Escriba el Peso del Enlace:");
                    Pesos [i][j] = scanner.nextInt();
                }
                else
                {
                    Pesos [i][j] = 0;
                }
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Matriz Original");
        System.out.println("");

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(Arreglo [i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Matriz de Adyacencias");
        System.out.println("");

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(Adyacencias [i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Matriz de Pesos:");
        System.out.println("");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(Pesos [i][j] + " ");
            }
            System.out.println();
        }
    }
}
