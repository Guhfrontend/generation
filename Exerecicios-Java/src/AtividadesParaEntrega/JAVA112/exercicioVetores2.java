package JAVA112;

import java.util.Scanner;

public class exercicioVetores2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetores [] = new int[10];
        int i,soma = 0;

        for (i = 0; i <= 9; i++){
            System.out.printf("Digite o número %d do vetor: ", i);
            vetores[i] = scan.nextInt();
            soma += vetores[i];
        }
        System.out.print("Elementos nos índices ímpares:");
        for (i = 0; i <= 9; i++){
            if (vetores[i] % 2 != 0){
                System.out.print(vetores[i] + " ");
            }
        }

        System.out.print("\nElementos pares:");
        for (i = 0; i <= 9; i++){
            if (vetores[i] % 2 == 0){
                System.out.print(vetores[i] + " ");
            }
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + ((double)soma/10));

    }
}
