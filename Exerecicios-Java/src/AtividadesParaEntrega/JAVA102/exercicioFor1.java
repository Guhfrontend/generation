package JAVA102;

import java.util.Scanner;

public class exercicioFor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1,valor2;
        System.out.println("Primeiro número tem que ser menor do que o segundo\n");

        System.out.print("Digite o primeiro número do intervalo: ");
        valor1 = scan.nextInt();
        System.out.print("Digite o segundo número do intervalo: ");
        valor2 = scan.nextInt();

        if (valor1 < valor2){
            for (valor1 = valor1;valor1 < valor2;valor1++){
                if (valor1 % 3 == 0 && valor1 % 5 == 1){
                    System.out.printf("%d é múltiplo de 3 e 5\n", valor1);
                }
            }
        }else{
            System.out.println("Intervalo inválido!");
        }
    }
}
