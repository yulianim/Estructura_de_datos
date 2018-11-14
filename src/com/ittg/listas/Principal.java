package com.ittg.listas;
public class Principal {
    public static void main(String [] args){
        Lista x=new Lista();
        x.agregarAlFinal(9);
        x.agregarAlFinal(10);
        x.imprimir();
        System.out.println();
        x.agregarAlFinal(7);
        x.imprimir();
        System.out.println("\nEl tamaño de la lista es: "+x.getTamanio());
        
    }
    
}
