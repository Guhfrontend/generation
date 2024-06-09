package JAVA102;

import java.util.Scanner;

public class exercicioFor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i,valor1, somapar = 0, somaimpar = 0;
        for (i = 0;i <10;i++){
            System.out.printf("Digite o %dº número: ", i+1);
            valor1 = scan.nextInt();
            if (valor1%2 == 0){
                somapar++;

            }else {
                somaimpar++;
            }
        }
        System.out.printf("Total de números pares: %d \n", somapar);
        System.out.printf("Total de números impares: %d \n", somaimpar);
    }
}
