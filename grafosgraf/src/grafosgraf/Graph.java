/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosgraf;
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author raidentrance
 *
 */
public class Graph {
 
    private List<Nodo> nodes;
 
    public void addNode(Nodo node) {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
    }
 
    public List<Nodo> getNodes() {
        return nodes;
    }
 
    @Override
    public String toString() {
        return "Graph [nodes=" + nodes + "]";
    }
 
}
