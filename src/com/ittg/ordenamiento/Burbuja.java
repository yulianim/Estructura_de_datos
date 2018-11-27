package com.ittg.ordenamiento;

public class Burbuja {

    public void burbuja() {
        int A[] = {5, 4, 3, 2, 1};
        int aux;
        int j;
        for (int i = 1; i < A.length; i++) {
            for (j = 0; j < A.length-1; j++) {
                if (A[j] > A[j + 1]) {
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                     
                    }
             
              
                 }System.out.println("\n");
        }
    }
   
        public static void main(String[] args) {
        Burbuja b = new Burbuja();
        b.burbuja();
    }

}
