package com.dio.estrutura;

/*Faça um programa que leia 20 números aleastórios (entre 0 e 100) armaezenando no vetor e
* no final mostre os números e seus sucessores*/

import java.util.Random;
import java.util.Scanner;

public class exercicio9 {

    //Variaveis e Funções de Entrada de dados
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randm = new Random();

        //Array com 20 elementos
        int[] nAleatorios = new int[20];

        //laço que gera o número aleatório e armazena na variavel numero
        for (int i = 0; i < nAleatorios.length; i++) {
            int numero = randm.nextInt(100);
            nAleatorios[i] = numero;
        }
        //Imprime na Tela o número aleatório e seu sucessor em apenas um laço
        System.out.println("Numeros Aleatórios & Sucessores: ");
        for (int numero : nAleatorios) {
            System.out.println("O Número " + (numero) +  " Tem por seu Sucessor o Número: " + (numero + 1));
        }
    }
}
