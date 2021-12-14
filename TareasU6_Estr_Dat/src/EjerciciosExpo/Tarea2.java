package EjerciciosExpo;

public class Tarea2
{
    public static void main(String[] args)
    {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(SumaArrayDyV(0, Array.length-1, Array));
    }

    public static int SumaArrayDyV(int Inicio, int Fin, int [] Array)
    {
        int Suma = 0;
        int Mitad = (Inicio + Fin) / 2;

        if (Inicio == Fin)
        {
            Suma = Array[Inicio];
        }
        else
        {
            Suma = SumaArrayDyV(Inicio, Fin, Array) + SumaArrayDyV(Mitad + 1, Fin, Array);
        }

        return Suma;
    }
}