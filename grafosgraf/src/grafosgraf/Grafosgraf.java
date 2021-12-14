/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosgraf;

/**
 *
 * @author Administrador
 */
public class Grafosgraf {
   public static Graph getCities() {
        Nodo df = new Nodo("DF");
        Nodo toluca = new Nodo("Toluca");
        Nodo cuernavaca = new Nodo("Cuernavaca");
        Nodo puebla = new Nodo("Puebla");
        Nodo tlaxcala = new Nodo("Tlaxcala");
 
        df.addEdge(new Edge(df, toluca, 100));
        df.addEdge(new Edge(df, cuernavaca, 90));
 
        toluca.addEdge(new Edge(toluca, cuernavaca, 150));
        toluca.addEdge(new Edge(toluca, puebla, 350));
        toluca.addEdge(new Edge(toluca, tlaxcala, 340));
 
        cuernavaca.addEdge(new Edge(cuernavaca, puebla, 100));
 
        puebla.addEdge(new Edge(puebla, tlaxcala, 20));
 
        Graph graph = new Graph();
        graph.addNode(df);
        graph.addNode(toluca);
        graph.addNode(cuernavaca);
        graph.addNode(puebla);
        return graph;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph graph = getCities();
        System.out.println(graph);
    }
    
}
