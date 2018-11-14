package com.ittg.arboles;

public class NodoArbol {

    NodoArbol nodoIzq;
    int datos;
    NodoArbol nodoDer;

    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null;
    }

    public void insertar(int valorInsertar) {
        //rama izquierda
        if (valorInsertar < datos) {
            if (nodoIzq == null) {
                nodoIzq = new NodoArbol(valorInsertar);
            } else {
                nodoIzq.insertar(valorInsertar);
            }
        } else if (valorInsertar > datos) {
            if (nodoDer == null) {
                nodoDer = new NodoArbol(valorInsertar);
            } else {
                nodoDer.insertar(valorInsertar);
            }
        }
    }

    public void imprimir() {
        System.out.println(datos + " ");
    }

    public NodoArbol subIzdo() {
        return nodoIzq;
    }

    public NodoArbol subDcho() {
        return nodoDer;
    }

    

}
