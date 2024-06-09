package JAVA93;

import java.util.Scanner;

public class ExercicioIfElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero: ");
        numero = scan.nextInt();

        if (numero%2 == 0 && numero < 0){
            System.out.printf("O numero %d é par e negativo", numero);
        } else if (numero%2 == 0 && numero > 0) {
            System.out.printf("O numero %d é par e positivo", numero);
        } else if (numero%2 != 0 && numero > 0) {
            System.out.printf("O numero %d é impar e positivo", numero);
        }else {
            System.out.printf("O numero %d é impar e negativo", numero);
        }
    }
}
