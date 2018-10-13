package com.ittg.pilas;

import javax.swing.JOptionPane;

public class Pilas {

    private int tope, max;
    private int pila[];

    public Pilas() {

    }

    public Pilas(int m) {
        max = m;
        pila = new int[max];
        tope = 0;
        JOptionPane.showMessageDialog(null, "Se creo pila de: "
                + max + " elementos");
    }

    private void agregarElemento(int n) {
        if (this.tope < this.max) {
            pila[tope] = n;
            tope++;
            JOptionPane.showMessageDialog(null, "Dato agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No hay espacio disponible");
        }
    }

    private void menu() {
        int opcion;
        Pilas p = new Pilas(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Escribe el tamaño de la pila: ")));
        do {//inicia el do
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                    + "1.- Insertar elemento\n"
                    + "2.- Quitar elemento\n"
                    + "3.- Imprimir pila\n"
                    + "4.- Salir\n"));
            switch (opcion) {
                case 1:
                    p.agregarElemento(Integer.parseInt(JOptionPane.showInputDialog("Ingresa elemento")));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opcion invalida");
            }
        }//Finaliza el do
        while (true);

    }

    public static void main(String[] args) {
        Pilas p = new Pilas();
        p.menu();
    }
}
