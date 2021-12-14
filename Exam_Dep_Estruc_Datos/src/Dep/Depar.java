package Dep;

public class Depar
{
    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(10);
        arbol.insertar(75);
        arbol.insertar(34);
        arbol.insertar(22);
        arbol.insertar(64);
        arbol.insertar(53);
        arbol.insertar(41);
        arbol.insertar(5);
        arbol.insertar(25);
        arbol.insertar(74);
        arbol.insertar(20);
        arbol.insertar(15);
        arbol.insertar(90);

        System.out.println("Hojas del arbol");
        arbol.imprimirHojas();
        System.out.println("Terminales del arbol");
        arbol.imprimirTerminales();
    }
}

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (this.raiz == null) {
            this.raiz = nuevo;
        } else {
            Nodo aux = this.raiz;
            Nodo padre = null;
            while (aux != null) {
                padre = aux;
                if (nuevo.getDato() < aux.getDato()) {
                    aux = aux.getIzquierdo();
                } else {
                    aux = aux.getDerecho();
                }
            }
            if (nuevo.getDato() < padre.getDato()) {
                padre.setIzquierdo(nuevo);
            } else {
                padre.setDerecho(nuevo);
            }
        }
    }

    public void imprimirHojas() {
        imprimirHojas(this.raiz);
    }

    private void imprimirHojas(Nodo nodo) {
        if (nodo != null) {
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                System.out.println(nodo.getDato());
            }
            imprimirHojas(nodo.getIzquierdo());
            imprimirHojas(nodo.getDerecho());
        }
    }

    public void imprimirTerminales() {
        imprimirTerminales(this.raiz);
    }

    private void imprimirTerminales(Nodo nodo) {
        if (nodo != null) {
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                System.out.println(nodo.getDato());
            }
            imprimirTerminales(nodo.getIzquierdo());
            imprimirTerminales(nodo.getDerecho());
        }
    }
}
