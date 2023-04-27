// Faça um programa que permita que o usuário digite o nome de uma banda musical e
// insira o nome de 3 músicas dessa banda, as músicas deverão ser armazenadas e no final
// o programa deverá mostrar a seguinte mensagem:
//
//NomeDaBanda
//
//Musica1
//Musica2
//Musica3

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String musicas[] = new String[3];

        System.out.println("Digite o nome da banda: ");
        String banda = ler.nextLine();

        for (int i = 0; i < musicas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º música:");
            musicas[i] = ler.nextLine();
        }

        System.out.println(banda + "\n");
        for (int i = 0; i < musicas.length; i++) {
            System.out.println(musicas[i]);
        }
        ler.close();
    }
}