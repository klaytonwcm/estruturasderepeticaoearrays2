package com.dio.estrutura;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numer;

        System.out.println("Digite um numero: ");
        numer = scan.nextInt();

        //Tabuada da Adição
        System.out.println("A Tabuada de Adição de " + numer + " é: ");

        for(int i = 1; i <=10; i++){

            System.out.println(numer + " + " + i + " = " + (numer+i));
        }

        //Tabuada da Subtração
        System.out.println("A Tabuada de Subtração de " + numer + " é: ");

        for(int i = 1; i <=10; i++){

            System.out.println(numer + " - " + i + " = " + (numer-i));
        }

        //Tabuada da Multiplicação
        System.out.println("A Tabuada de Multiplicação de " + numer + " é: ");

        for(int i = 1; i <=10; i++){

            System.out.println(numer + " x " + i + " = " + (numer*i));
        }

        //Tabuada da Divisão
        System.out.println("A Tabuada de Divisão de " + numer + " é: ");

        for(int i = 1; i <=10; i++) {

            System.out.println(numer + " / " + i + " = " + (numer / i));
        }
    }
}
