package com.dio.lacos.java;

public class Exer_Interruptores1 {
    public static void main(String[] args) {

        int contador = 0;

        do {
            for (int y = 1; y <= 14; y++) {
                int multiplo = 2 * y;
                 contador++;
                  System.out.println(" " + multiplo);
                     if(multiplo == 12){
                       break;
                }
            }
        } while (contador > 14);
            System.out.println("Múltiplos de 2: " + contador);
    }
}
