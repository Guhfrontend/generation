package JAVA112;

import java.util.Locale;
import java.util.Scanner;

public class exercicioMatriz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double matriz[][] = new double[10][4];
        double media[] = new double[10];
        int i,x;

        for (i = 0;i < 10; i++) {
            double soma = 0;
            for (x = 0; x < 4; x++) {
                System.out.printf("Digite sua %d notas: ",(x+1));
                matriz[i][x] = scan.nextDouble();
                soma += matriz[i][x];
            }
            System.out.println();
            media[i] = soma/4;
        }

        System.out.print("Vetor: ");
        for (i = 0; i < 10; i++){
            System.out.printf("%.2f |", media[i]);
        }

    }
}
