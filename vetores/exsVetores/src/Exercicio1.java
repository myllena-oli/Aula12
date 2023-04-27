// Faça um programa que leia 5 valores inteiros, armazene-os em um vetor,
// calcule e apresente a soma destes valores.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int soma = 0;
        int vetor[] = new int[5];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro:");
            vetor[i] = ler.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println("A soma dos 5 valores é " + soma + " .");

        ler.close();
    }
}