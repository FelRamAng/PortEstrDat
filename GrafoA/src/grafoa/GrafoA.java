package grafoa;
import java.util.*;

public class GrafoA 
{
private int A[][];
	private int B[][];
 
    public GrafoA(int N) {
    	this.A= new int [N][N];
    	this.B= new int [N][N];
    }
 
    public void Introducir()
    {
    	Scanner valores = new Scanner(System.in);
    	int tam=0;
 
    	for (int i=1;i<=5;i++)
    	{
    		System.out.println("Da el numero de vertices adyasentes al vertice "+i+" :");
    		tam = valores.nextInt();
 
 
    		if(tam!=0 && tam<=5)
    		{
    			System.out.println("Da los vertices adyasentes: ");
    			for(int j=1;j<=tam;j++)
    			{
    				int dato=valores.nextInt();
    				A[i][dato]=1;
    			}
    		}
    		else
    		{
    			if(tam>5)
    				System.out.println("No pueden ser el numero dado");
    		}
 
 
    	}
    }
 
    public void Muestra()
    {
    	System.out.println("\nEsta es la matriz de adyacencia");
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=1;j<=5;j++)
    		{
    			System.out.print(" "+A[i][j]);
    		}
    		System.out.print("\n");
    	}
    }
 
    public void Conexo()
    {
    	//El grafo será conexo si existe un camino desde cualquier nodo del grafo hasta cualquier otro.
    	boolean ban;
    	int cont=0;
    	for(int i=1;i<=5;i++)
    	{
    		ban=false;
    		for(int j=1;j<=5;j++)
    		{
    			if (A[i][j]==1)
    			ban=true;
     		}
 
     		if (ban==true)
     			cont=cont+1;
    	}
 
    	if (cont==5)
    		System.out.println("\nEl grafo SI es Conexo");
    	else
    		System.out.println("\nEL grafo NO es Conexo");
    }
 
    public void Grado()
    {
     	int c[]=new int  [6];
    	int cont=0;
 
    	for(int i=1;i<=5;i++)
    	{
    		cont=0;
    		for(int j=1;j<=5;j++)
    		{
    			if (A[i][j]==1 || A[j][i]==1)
    			cont=cont+1;
     		}
		c[i]=cont;
    	}
 
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("grado total del vertice "+i+" es: "+c[i]);
    	}
    }
 
    public void Multiplica(int x)
    {
    		int c[][]=new int[6][6];
    		int j, i, k;
    	if (x<=2)
    	{
    		for(i=1; i<=5; i++)
		      {
		          for(j=1; j<=5;j++)
		             {
		                for(k=1; k<=5; k++)
		                   {
		                         B[i][j]=B[i][j]+(A[i][k]*A[k][j]);
		                   }
		              }
		      }
	    }
	    else
	    {
		    for(i=1; i<=5; i++)
		      {
		          for(j=1; j<=5;j++)
		             {
		                for(k=1; k<=5; k++)
		                   {
		                         c[i][j]=c[i][j]+(A[i][k]*B[k][j]);
		                   }
		              }
		      }
		      this.B=c;
	    }
    }
 
    public void Camino(int i, int j)
    {
    	boolean ban=false;
    	int cont=0;
 
    	while(ban==false && cont<5)
    	{
    		cont=cont+1;
    		if (cont==1)
    		{
    			if(A[i][j]==1)
    			{
    				System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
    				ban=true;
    			}
    		}
    		else
    		{
    			Multiplica(cont);
    			if(B[i][j]!=0)
    			{
    				System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
    				ban=true;
    			}
    		}
    	}
    	if (ban==false)
    		System.out.println("NO existe camino de "+i+" a "+j);
    }
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    	int o=0;
 
	    do
	  	{
			System.out.println("Ingrese el tamaño del Nodo: ");
			int N=scan.nextInt();
			GrafoA G=new GrafoA(N);
			G.Introducir();
			G.Muestra();
			G.Conexo();
			G.Grado();
			System.out.println("Desea buscar un camino en este grafo \n1.-SI\n2.-NO");
			int op=scan.nextInt();
			if(op==1)
			{
				System.out.println("De el vertice de partida");
				int i=scan.nextInt();
				System.out.println("De el vertice a llegar");
				int j=scan.nextInt();
				G.Camino(i,j);
			}
	
			System.out.println("^*****GRAFO EVALUADO*****");
			System.out.println("\nDesea introducir otro grafo \n1.-SI\n2.-NO");
			o=scan.nextInt();
		}while(o==1);
    }
    
}
