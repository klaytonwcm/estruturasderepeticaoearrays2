package com.dio.estrutura;

// Faça um programa que leia 6 letras e informe o número de consoantes digitadas
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// Variáveis do programa
        String[] consoantes = new String[6];
        int quantconso = 0;
        int contador = 0;
    //Estrutura de Repetição Do-While (Faça - Quando)
        //Faça
        do {
            System.out.println("Digite a Letra: ");
            String letra = scan.next();
        //Condição que ignora  o valor ao contador quando a letra digitada não é uma consoante
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){

                //Iniciallização do contador com entradas da variavel consoantes e adicionado a variavel letra
                //que adiciona o numero de entrada ao contador
                consoantes[contador] = letra;

                //incremento do contador quantidade
                quantconso++;
             }

            //incrementação do contador de consoantes
                contador++;

            }//Quando
                while (contador < consoantes.length);

// Imprimir o valor da quantidade de consoantes armazenados no contador
        System.out.println("A quantidade de consoantes é: " + quantconso);
        }
    }
