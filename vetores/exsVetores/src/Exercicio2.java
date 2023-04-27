// Faça um programa de lista de chamada que armazene o nome de
//10 alunos e apresente a lista completa para o usuário

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String chamada[] = new String[10];

        for (int i = 0; i < chamada.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome da chamada:");
            chamada[i] = ler.nextLine();
        }
        System.out.println("A lista completa é: ");
        for (int i = 0; i < chamada.length; i++) {
            System.out.println(chamada[i]);
        }
        ler.close();
    }
}