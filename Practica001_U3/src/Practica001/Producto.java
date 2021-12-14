package Practica001;

public class Producto 
{
	private String descripcion;
	private float precio;
	private int cantidad;
	
	public Producto(String Desc, float Precio, int Cant)
	{
		this.descripcion = Desc;
		this.precio = Precio;
		this.cantidad = Cant;
	}
	
	public String getDescripcion() 
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}
	
	public float getPrecio() 
	{
		return precio;
	}
	
	public void setPrecio(float precio) 
	{
		this.precio = precio;
	}
	
	public int getCantidad() 
	{
		return cantidad;
	}
	
	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}
}
