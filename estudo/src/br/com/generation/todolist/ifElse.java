package br.com.generation.todolist;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1,n2,media;

        System.out.println("Digite sua nota");
        n1 = scan.nextDouble();
        System.out.println("Digite sua nota");
        n2 = scan.nextDouble();

        media = (n1 + n2)/2;


        if (media >= 6){
            System.out.println("Parabéns");
        }else if (media >= 5){
            System.out.println("Exame");
        }else{
            System.out.println("Reprovade");
        }

    }
}
