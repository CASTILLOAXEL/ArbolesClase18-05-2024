package org.example.ArbolCadena;

import org.example.ArbolBinario.Nodo;
public class ArbolCadena {
    //nodo Raiz del arbol
    protected NodoCadena raiz;

    //Constructor de la clase arbol
    public ArbolCadena() {
        this.raiz = null;
    }

    //Insertar nodo con el valor dato, si el arbol esta vacio se inserta un nodo
    public void insertar(String dato) {
        if (this.raiz == null) {
            this.raiz = new NodoCadena(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    //si no tiene valor  nulo se inserta en un orden
    private void insertar(NodoCadena padre, String dato){
        if (dato.compareTo(dato)> 0){
            if (padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo(new NodoCadena(dato));
            }else {
                insertar(padre.GetSubarbolIzdo(), dato);
            }
        }else if (dato.compareTo(padre.valorNodo()) > 0){
            if (padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho(new NodoCadena(dato));
            }else {
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }
}


