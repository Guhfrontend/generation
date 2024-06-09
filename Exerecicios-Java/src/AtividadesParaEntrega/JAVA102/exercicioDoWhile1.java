package JAVA102;

import java.util.Scanner;

public class exercicioDoWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            valor1 = scan.nextInt();
            if (valor1 > 0){
                soma += valor1;
            }
        }while (valor1 != 0);
            System.out.printf("A soma dos números é: %d", soma);

    }
}
