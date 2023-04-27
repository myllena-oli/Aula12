// Faça um programa que receba 10 números inteiros, armazene-os e verifique quais numeros são pares,
// e exiba para o usuário apenas os números pares da lista.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro:");
            num[i] = ler.nextInt();
        }
        System.out.println("Os números pares são: ");
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0) {
                System.out.println(num[i]);
            }
        }
        ler.close();
    }
}