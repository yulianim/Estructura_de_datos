package com.ittg.arbolModificado;

public class ArbolBinario {

    protected Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo raizArbol() {
        return raiz;
    }
// Comprueba el estatus del árbol

    boolean esVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(
            Nodo ramaIzqda, Object dato, Nodo ramaDrcha) {
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }

    public void preorden(Nodo r) {
        if (r != null) {
            r.imprimir();
            preorden(r.subarbolIzdo());
            preorden(r.subarbolDcho());

        }
    }

   }
