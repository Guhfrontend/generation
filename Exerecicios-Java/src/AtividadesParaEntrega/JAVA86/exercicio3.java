package JAVA86;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioBruto, adNoturno, horasEx, desc;

        System.out.print("Escreva seu salário: ");
        salarioBruto = scan.nextDouble();
        System.out.print("Escreva seu adicional noturno: ");
        adNoturno = scan.nextDouble();
        System.out.print("Escreva as horas extras: ");
        horasEx = scan.nextDouble();
        System.out.print("Descntos: ");
        desc = scan.nextDouble();

        double total = salarioBruto + adNoturno + (horasEx*5) - desc;

        System.out.println("Salário total de: " + total);

    }
}
