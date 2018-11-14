package com.ittg.listas;
public class Nodo {
    //Variable para guardar un valor entero
    private int valor;
    //Variable para enlazar los nodos
    private Nodo siguiente;

    public Nodo() {
        this.valor=0;
        this.siguiente=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
