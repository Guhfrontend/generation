package JAVA112;

import java.util.Scanner;

public class exercicioVetores1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vet [] = new int [] {2,5,1,3,4,9,7,8,10,6};
        int num1,num2 = -1;
        int i;

        System.out.print("Digite o numero que voce deseja encontrar: ");
        num1 = scan.nextInt();

        for (i = 0; i < vet.length; i++){
            if (vet[i] == num1){
                System.out.printf("O número %d está localizado na posição: %d \n", num1, i);
                num2 = i;
                break;
            }
        }
        if (num2 == -1){
            System.out.printf("O número %d não foi encontrado!", num1);
        }







    }
}
