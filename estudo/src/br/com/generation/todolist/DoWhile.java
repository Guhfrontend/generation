package br.com.generation.todolist;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1,num2,soma = 0;


        do {
            System.out.print("Digite um numero: ");
            num1 = scan.nextInt();

            num1 *=5;
            System.out.println(num1);
            soma++;

        }while (soma != 3);
            System.out.println("Finalizado");


    }
}
