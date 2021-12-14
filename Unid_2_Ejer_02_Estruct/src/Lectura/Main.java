package Lectura;

import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Main
{
    public static void main(String [] args)
    {
        Scanner entrada = null;
        String linea;
        String nuevalinea;
        int numerodelinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);

        JFileChooser jn =  new JFileChooser();
        jn.showOpenDialog(jn);

        String texto;
        System.out.println("Introduzca el texto a buscar: ");
        texto = sc.nextLine();

        try
        {
            String ruta = jn.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            entrada = new Scanner(f);
            System.out.println("Nombre del Archivo: " + f.getName());

            while (entrada.hasNext())
            {
                linea = entrada.nextLine();
                if (linea.contains(texto))
                {
                    System.out.println("Numero de linea: " + numerodelinea);
                    contiene = true;
                }
                if (contiene)
                {
                    nuevalinea = linea;
                    while (nuevalinea.length() > 0)
                    {
                        String[] resultado = nuevalinea.split(texto, 2);
                        String primero = resultado[0];
                        String resto = resultado[1];
                        if (primero.contains(texto))
                        {

                        }
                        else
                        {
                            System.out.println("Valor: " + primero);
                        }
                        System.out.println("Resto: " + resto);
                        nuevalinea = resto;
                    }
                    numerodelinea ++;
                }
                else
                {
                    System.out.println("No se encontró el texto");
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.toString() + " No se ha seleccionado el Archivo");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            if (entrada != null)
            {
                entrada.close();
            }
        }
    }
}
