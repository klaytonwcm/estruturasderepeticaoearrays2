package com.dio.estrutura;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicador = 1;
        System.out.print(fatorial +"! = ");

        for(int i = fatorial; i >= 1; i--){
            multiplicador = multiplicador * i;
        }
        System.out.println(multiplicador);
    }

}
