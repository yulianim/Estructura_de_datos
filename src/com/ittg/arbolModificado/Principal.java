package com.ittg.arbolModificado;

public class Principal {

    public static void main(String[] args) throws Exception {
        ArbolBinario arbol;
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();
        a1 = ArbolBinario.nuevoArbol(null, "B", null);
        a2 = ArbolBinario.nuevoArbol(null, "C", null);
        a = ArbolBinario.nuevoArbol(a1, "A", a2);
        pila.insertar(a);
        //Se creó arbol con 1 nivel teniendo como raiz=A
        //subarbolizquierdo=B y subarbolDerecho=C
        arbol = new ArbolBinario(a);
        System.out.println("Recorrido preorden\n");
        
       
    }

}
