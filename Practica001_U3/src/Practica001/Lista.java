package Practica001;

public class Lista 
{
	private Nodo head = null;
	
	private class Nodo
	{
		public Producto producto;
		public Nodo siguiente = null;
	
		public Nodo(Producto producto)
		{
			this.producto = producto;
		}
	}
	
	public void insertarAlInicio(Producto producto)
	{
		Nodo nodo = new Nodo(producto);
		nodo.siguiente = head;
		head = nodo;
	}
	
	public void insertarAlFinal(Producto producto)
	{
		Nodo nodo = new Nodo(producto);
		Nodo puntero = head;
		while(puntero.siguiente != null)
		{
			puntero = puntero.siguiente;
		}
		puntero.siguiente = nodo;
	}
	
	public void buscarProducto(int opc, String valor)
	{
		if(estaVacia())
		{
			System.out.println("No hay ningún producto.");
		}
		else
		{
			Nodo puntero = head;
			int cont = 0;
			while(puntero != null)
			{
				switch(opc)
				{
					case 1:
					{
						if(puntero.producto.getDescripcion().equals(valor))
						{
							System.out.println("________________________________________");
							System.out.println("				Producto Encontrado");
							System.out.println("Descripción: " + puntero.producto.getDescripcion());
							System.out.println("Precio: " + puntero.producto.getPrecio());
							System.out.println("Cantidad: " + puntero.producto.getCantidad());
						}
						break;
					}
					case 2:
					{
						if(puntero.producto.getPrecio() == Float.parseFloat(valor))
						{
							System.out.println("________________________________________");
							System.out.println("				Producto Encontrado");
							System.out.println("Descripción: " + puntero.producto.getDescripcion());
							System.out.println("Precio: " + puntero.producto.getPrecio());
							System.out.println("Cantidad: " + puntero.producto.getCantidad());
						}
						break;
					}
					case 3:
					{
						if(puntero.producto.getCantidad() == Integer.parseInt(valor))
						{
							System.out.println("________________________________________");
							System.out.println("				Producto Encontrado");
							System.out.println("Descripción: " + puntero.producto.getDescripcion());
							System.out.println("Precio: " + puntero.producto.getPrecio());
							System.out.println("Cantidad: " + puntero.producto.getCantidad());
						}
						break;
					}
				}
				puntero = puntero.siguiente;
				cont++;
			}
		}
	}
	
	public boolean estaVacia()
	{
		return head == null;
	}
	
	public void eliminarAlInicio()
	{
		if(head != null)
		{
			Nodo primer = head;
			head = head.siguiente;
			primer.siguiente = null;
		}
	}
	
	public void eliminarFinal()
	{
		if(head != null)
		{
			if(head.siguiente == null)
			{
				head = null;
			}
			else
			{
				Nodo puntero = head;
				while(puntero.siguiente.siguiente != null)
				{
					puntero = puntero.siguiente;
				}
				puntero.siguiente = null;
			}
		}
	}
	
	public void verProductos()
	{
		Nodo n;
		n = head;
		while(n != null)
		{
			System.out.println("Descripción: " + n.producto.getDescripcion());
			System.out.println("Precio: " + n.producto.getPrecio());
			System.out.println("Cantidad: " + n.producto.getCantidad());
			n = n.siguiente;
		}
	}
}
