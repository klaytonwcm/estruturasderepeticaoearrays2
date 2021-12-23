package com.dio.estrutura;

public class exercicio7 {
    public static void main(String[] args) {

        //Vetor com 5 elementos
        int[] vetor = {-7,-5,17,34,3};

        System.out.print("Vetor: ");

        //Repetição Inversa com -- para exibir vetor Invertido.
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
