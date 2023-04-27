import java.util.Scanner;

// Faça um programa que mostre a tabuada a partir da sua escolha
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i = 0;

        System.out.println("Qual tabuada você deseja?");
        int tabuada = ler.nextInt();

        while (i <= 10) {
            System.out.println(tabuada + " x " + i + " = " + tabuada * i);
            i++;
        }
        ler.close();
    }
}