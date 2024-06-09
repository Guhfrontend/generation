package JAVA86;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1,nota2,nota3,nota4;

        System.out.println("Digite uma nota");
        nota1 = scan.nextDouble();
        System.out.println("Digite uma nota");
        nota2 = scan.nextDouble();
        System.out.println("Digite uma nota");
        nota3 = scan.nextDouble();
        System.out.println("Digite uma nota");
        nota4 = scan.nextDouble();

        double calculoMedia = nota1+nota2+nota3+nota4/4;

        System.out.println("Total do cauculo é: " + calculoMedia);

    }
}
