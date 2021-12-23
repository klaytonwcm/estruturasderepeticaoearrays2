package com.dio.estrutura;

/* Crie um programa que leia 5 numeros
e informe o maior e
a media desses numeros.
 */

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;


        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count = count +1;

        }while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
