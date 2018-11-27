package com.ittg.ordenamiento;

public class Ordenamiento {
    public void burbuja(int A[]) {
        int aux;
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j] > A[j + 1]) {
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
                System.out.print("Iteracion "+ j+":");
                imprimir(A);
                System.out.println();
            }
        }
    }
    public void imprimir(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
    }
    public void quickSort(){
        
    }
    public static void main(String[] args) {
        int A[] = {5, 4, 3, 2, 1};
        Ordenamiento x = new Ordenamiento();
        x.burbuja(A);
    }

}
