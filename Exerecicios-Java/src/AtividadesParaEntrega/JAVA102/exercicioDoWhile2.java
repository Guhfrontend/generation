package JAVA102;

import java.util.Scanner;

public class exercicioDoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor1;
        double soma = 0;
        int i = 0;

        do {
            System.out.print("Digite um número: ");
            valor1 = scan.nextDouble();
                if (valor1 %3 == 0 && valor1 != 0){
                soma += valor1;
                i++;
                }
        }while (valor1 != 0);
            System.out.printf("A média de todos os números múltiplos de 3 é: %.2f\n", (soma/i));
    }
}
