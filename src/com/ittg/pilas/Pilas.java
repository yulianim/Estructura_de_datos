/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ittg.pilas;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DellLatitude1
 */
public class Pilas {
    
    
    public void tamaño(){
      int  a[]=new int[5];
      for(int i=0; i<a.length; i++){
       a[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un numero"));
        }
      System.out.println(a.length);
    }
    
    public static void main(String [] args){
    Pilas x=new Pilas();
    x.tamaño();
    }
}
