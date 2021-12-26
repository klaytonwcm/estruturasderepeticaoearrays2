package com.dio.estrutura;

import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];

        for (int x = 0; x < M.length; x++) {
            for (int y = 0; y < M[x].length; y++) {
                M[x][y] = random.nextInt(9);
            }
        }
        System.out.println("Matriz 4x4: ");
        for (int[] linha : M){
            for (int coluna : linha){
                System.out.print(coluna + " ");
                   }
            System.out.println();
                }
    }
}
