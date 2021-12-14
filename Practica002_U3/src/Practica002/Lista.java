package Practica002;

public class Lista 
{
	private Nodo inicio = null;
	private Nodo fin = null;
	
	private class Nodo
	{
		public Alumno alumno;
		public Nodo siguiente = null;
		
		public Nodo(Alumno alumno)
		{
			this.alumno = alumno;
		}
	}
	
	public void insertarInicio(Alumno alumno)
	{
		Nodo nodo = new Nodo(alumno);
		nodo.siguiente = inicio;
		inicio = nodo;
	}
	
	public void insertarFinal(Alumno alumno)
	{
		Nodo nodo = new Nodo(alumno);
		Nodo puntero = inicio;
		while(puntero.siguiente != null)
		{
			puntero = puntero.siguiente;
		}
		puntero.siguiente = nodo;
	}
	
	public boolean estaVacia()
	{
		return inicio == null;
	}
	
	public void buscarAlumno(int opc, String valor)
	{
		if(estaVacia())
		{
			System.out.println("No hay ningún Alumno.");
		}
		else
		{
			Nodo puntero = inicio;
			int cont = 0;
			while(puntero != null)
			{
				switch(opc)
				{
					case 1:
					{
						if(puntero.alumno.getNombre().equals(valor))
						{
							System.out.println("________________________________________");
							System.out.println("				Alumno Encontrado");
							System.out.println("Nombre: " + puntero.alumno.getNombre());
							System.out.println("Calificacion 1: " + puntero.alumno.getCalif1());
							System.out.println("Calificacion 2: " + puntero.alumno.getCalif2());
						}
						break;
					}
					case 2:
					{
						if(puntero.alumno.getCalif1() == Integer.parseInt(valor))
						{
							System.out.println("________________________________________");
							System.out.println("				Alumno Encontrado");
							System.out.println("Nombre: " + puntero.alumno.getNombre());
							System.out.println("Calificacion 1: " + puntero.alumno.getCalif1());
							System.out.println("Calificacion 2: " + puntero.alumno.getCalif2());
						}
						break;
					}
				}
				puntero = puntero.siguiente;
				cont++;
			}
		}
	}
	
	public void eliminar()
	{
		if(inicio != null)
		{
			if(inicio.siguiente == null)
			{
				inicio = null;
			}
			else
			{
				Nodo puntero = inicio;
				while(puntero.siguiente.siguiente != null)
				{
					puntero = puntero.siguiente;
				}
				puntero.siguiente = null;
			}
		}
	}
	
	public void verAlumnos()
	{
		Nodo n;
		n = inicio;
		while(n != null)
		{

			System.out.println("________________________________________");
			System.out.println("Nombre: " + n.alumno.getNombre());
			System.out.println("Calificacion 1: " + n.alumno.getCalif1());
			System.out.println("Calificacion 2: " + n.alumno.getCalif2());
			n = n.siguiente;
		}
	}
}
