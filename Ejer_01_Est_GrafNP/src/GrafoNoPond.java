import java.util.Scanner;

public class GrafoNoPond
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N;
        System.out.println("Escriba el Número de Nodos del Grafo:");
        N = scanner.nextInt();
        int [][] Arreglo = new int [N][N];
        int [][] Adyacencia = new int [N][N];

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
                System.out.println("Si no Existe = 0");
                System.out.println("Si Existe = 1");
                Adyacencia [i][j] = scanner.nextInt();
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Matriz de Adyacencias");
        System.out.println("");

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(Adyacencia [i][j] + " ");
            }
            System.out.println();
        }
    }
}
