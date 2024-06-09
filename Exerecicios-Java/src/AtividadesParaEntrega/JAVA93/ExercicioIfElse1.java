package JAVA93;

import java.util.Scanner;

public class ExercicioIfElse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1,n2,n3;

        System.out.print("Digite o numero A: ");
        n1 = scan.nextInt();

        System.out.print("Digite o numero B: ");
        n2 = scan.nextInt();

        System.out.print("Digite o numero C: ");
        n3 = scan.nextInt();

        int soma = n1 +n2;

        if (soma > n3){
            System.out.println("A soma de A + B é maior do que C");
        }else if (soma == n3){
            System.out.println("A soma de A + B é igual do que C");
        }else {
            System.out.println("A soma de A + B é menor do que C");
        }

    }
}
