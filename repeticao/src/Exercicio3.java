// Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100
public class Exercicio3 {
    public static void main(String[] args) {

        int i = 0, num = 100;
        do {
            num++;
            System.out.println(num);
            i++;
        } while (i < 10);
    }
}