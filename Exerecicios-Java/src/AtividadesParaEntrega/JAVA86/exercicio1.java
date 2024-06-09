package JAVA86;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        float salario = scan.nextFloat();

        System.out.println("Digite o abono: ");
        float abono = scan.nextFloat();

        float novoSalario = salario + abono;


    }
}
