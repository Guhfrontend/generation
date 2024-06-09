package br.com.generation.todolist;

import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valorInteiro []= new int [] {1,2,3,4,5};
        int indice;

        for(indice = 0;indice<5; indice++){
            System.out.print("Digite o "+ (indice+1) + " Número: ");
            valorInteiro[indice] = scan.nextInt();

        }

        System.out.println("Os número digitados foram: ");
        for (indice = 0; indice <5; indice++){
            System.out.println(indice + " Número: "+ valorInteiro[indice]);
        }

    }
}
