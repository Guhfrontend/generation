package JAVA102;

import java.util.Scanner;

public class exercicioWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade =1;
        int idadeMenor = 0;
        int idadeMaior = 0;

        while (idade >= 0){
            System.out.print("Digite uma idade: ");
            idade = scan.nextInt();
            if (idade < 21 && idade >= 0){
                idadeMenor++;
            }else if (idade > 50){
                idadeMaior++;
            }
        }
        System.out.printf("Total de pessoas menores de 21: %d \n", idadeMenor);
        System.out.printf("Total de pessoas maiores de 50: %d", idadeMaior);
    }
}
