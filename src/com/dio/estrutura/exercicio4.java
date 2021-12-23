package com.dio.estrutura;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantimp = 0, quantpar = 0;

        System.out.print("Quantidade de Numeros: ");
        quantNumeros = scan.nextInt();

        int contador = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantpar++;
            else quantimp++;
            contador++;


        }while (contador < quantNumeros);

        System.out.println("Quantidade numeros Impares: " + quantimp);
        System.out.println("Quantidade numeros Pares: " + quantpar);
    }

}
