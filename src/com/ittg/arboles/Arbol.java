package com.ittg.arboles;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz=null;
    }
    public void insertarNodo(int valorInsertar){
        if(raiz==null){
            raiz=new NodoArbol(valorInsertar);
        }
        else{
            raiz.insertar(valorInsertar);
        }
    }
    public  void preorden(NodoArbol r){
        if(r!=null){
            r.imprimir();
            preorden(r.subIzdo());
            preorden(r.subDcho());
        }
    }
    public Nodo nuevoArbol(
            Nodo ramaIzqda, int datos, Nodo ramaDrcha) {
        return new Nodo(ramaIzqda, datos, ramaDrcha);
    }
    public static void main(String [] args){
        Arbol arbol=new Arbol();
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();
        NodoArbol x;
        a1=arbol.nuevoArbol(null, 3, null);
        a2=arbol.nuevoArbol(null, 4, null);
        a=arbol.nuevoArbol(a1, 6, a2);
        try {
            pila.insertar(a);
            //Tarea imprimir los datos del arbol
            //investigar que es el recorrido inorden,
            //postorden y preorden
        } catch (Exception ex) {
            Logger.getLogger(Arbol.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
