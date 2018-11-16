package com.ittg.arbolModificado;

public class Nodo {

    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(Object valor) {
        dato = valor;
        izdo = dcho = null;
    }

    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        dato = valor; // this(dato);
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }
// operaciones de acceso

    public Object valorNodo() {
        return dato; //return valor;
    }

    public Nodo subarbolIzdo() {
        return izdo;
    }

    public Nodo subarbolDcho() {
        return dcho;
    }

    public void nuevoValor(Object d) {
        dato = d;
    }

    public void ramaIzdo(Nodo n) {
        izdo = n;
    }

    public void ramaDcho(Nodo n) {
        dcho = n;
    }

    void imprimir() {
        System.out.println(dato + " ");
    }
}
