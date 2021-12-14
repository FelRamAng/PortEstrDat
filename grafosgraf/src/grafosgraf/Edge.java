/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosgraf;

public class Edge {
    private Nodo origin;
    private Nodo destination;
    private double distance;
 
    public Edge(Nodo origin, Nodo destination, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    Edge(Nodo puebla, Nodo tlaxcala, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public Nodo getOrigin() {
        return origin;
    }
 
    public void setOrigin(Nodo origin) {
        this.origin = origin;
    }
 
    public Nodo getDestination() {
        return destination;
    }
 
    public void setDestination(Nodo destination) {
        this.destination = destination;
    }
 
    public double getDistance() {
        return distance;
    }
 
    public void setDistance(double distance) {
        this.distance = distance;
    }
 
    @Override
    public String toString() {
        return "\n Edge [origin=" + origin.getCity() + ", destination=" + destination.getCity() + ", distance="
                + distance + "]";
    }
 
}