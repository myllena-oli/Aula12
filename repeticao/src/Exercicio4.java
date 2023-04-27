// Imprimir todos os valores pares entre 1 (inclusive) e N (o valor de N é
// de sua escolha). Considere que o N será sempre maior que ZERO

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha um número maior que zero:");
        int n = ler.nextInt();
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < n);

        ler.close();

    }
}