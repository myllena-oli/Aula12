// Faça um programa que receba de lista de compras sendo que o usuário irá inserir a quantidade
// de itens que quer adicionar na lista de compras e após inserir a quantidade o programa deverá
// permitir que o usuário insira os produtos nessa lista.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String compras[];

        System.out.println("Quantos itens você quer adicionar na lista de compras?");
        int itens = ler.nextInt();
        ler.nextLine();

        compras = new String[itens];

        for (int i = 0; i < compras.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º item:");
            compras[i] = ler.nextLine();
        }
        System.out.println("A lista completa é: ");

        for (int i = 0; i < compras.length; i++) {
            System.out.println(compras[i]);
        }
        ler.close();
    }
}