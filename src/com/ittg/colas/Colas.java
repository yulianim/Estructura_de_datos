package com.ittg.colas;

import javax.swing.JOptionPane;

public class Colas implements IColas{
    private int tam=5;
    private int frente;
    private int fin;
    private int [] Cola;

    public Colas() {
        frente=0;
        fin=-1;
        Cola=new int[tam];
    }
    @Override
    public void insertar() {
        if(fin==tam-1){
            JOptionPane.showMessageDialog(null,"Cola llena");
        }else{
            int item=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            Cola[++fin]=item;
        }
    }
    @Override
    public int quitar() {
          if(!(fin==tam-1)){
             return Cola[frente++];
             
          }
          else{
              return 0;
          }
    }

    @Override
    public void menu() {
        Colas c=new Colas();
        do{
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Colas \n"
                + "1.- Insertar\n"
                + "2.- Imprimir\n"
                + "3.- Quitar elemento\n"
                + "4.- Esta vacia\n"
                + "5.- Eliminar cola\n"
                + "6.- Salir\n "
                + "Seleccione opcion: "));
                switch(opcion){
                    case 1:c.insertar();
                    break;
                    case 2:c.imprimir();
                    break;
                    case 3:c.quitar();
                    break;
                    case 4:
                    break;
                    case 5:
                    break;
                    case 6: System.exit(0);
                    break;

                    
                }
        }
        while(true);
    }
    public static void main(String [] args){
    Colas c=new Colas();
        c.menu();
    }

    @Override
    public void imprimir() {
          if(!(fin==tam-1)){
              System.out.println("La cola de tamaño: "+tam+""
                      + " contiene: "+(fin+1)+" elementos");
              for(int i=frente; i<=fin;i++){
                  System.out.println("Elemento ["+i+"]="+Cola[i]);
              }
          }
          else{
           JOptionPane.showMessageDialog(null, "Cola vacia");
          }
    }
    
}
