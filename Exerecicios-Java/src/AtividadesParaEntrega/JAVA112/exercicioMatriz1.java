package JAVA112;

import java.util.Scanner;

public class exercicioMatriz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //linha [1] coluna [2]

        int matriz [][] = new int[3][3];
        int i,x;
        int somaDiPri = 0,somaDiSec = 0;

        for (i = 0; i < 3; i++){
            for (x = 0; x < 3; x++){
                System.out.print("Digite os números da matriz: ");
                matriz[i][x] = scan.nextInt();
            }
        }
        System.out.print("Elementos da Diagonal Principal:");
        for (i = 0; i < 3; i++){
            System.out.print(matriz[i][i] + " ");
            somaDiPri += matriz[i][i];
        }
        System.out.print("\nElementos da Diagonal secundária:");
        for (i = 0; i < 3; i++){
            System.out.print(matriz[i][2-i] + " ");
            somaDiSec += matriz[i][2-i];
        }

        System.out.printf("\nSoma dos elementos da diagonal principal: %d", somaDiPri);
        System.out.printf("\nSoma dos elementos da diagonal secundária: %d", somaDiSec);

    }
}
