package com.ittg.arboles;
public class Nodo {
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;
    public Nodo(Object valor){
        dato=valor;
        izdo=dcho=null;
    }
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho){
    dato=valor;
    izdo=ramaIzdo;
    dcho=ramaDcho;
    
    }
    
    
}
