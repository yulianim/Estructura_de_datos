package com.ittg.listas;
public class Lista {
    //puntero que indica el inicio de la lista 
    private Nodo inicio;
    //Variable para el tamaño de la lista
    private int tamanio;

    public Lista() {
        inicio=null;
        tamanio=0;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    public int getTamanio(){
        return tamanio;
    }
    public void agregarAlFinal(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (estaVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea ua copia de la lista.
            Nodo aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }
    public void imprimir(){
        if(!estaVacia()){
            Nodo aux=inicio;
            int i=0;
            while(aux!=null){
                //imprime en pantalla el valor del nodo
                System.out.print(i + ".["+aux.getValor()+"]--->");
                //avanza al siguiente nodo
                aux=aux.getSiguiente();
                i++;
                
            }
        }
    }
    
    
    
}
