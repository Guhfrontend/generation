package JAVA93;

import java.util.Scanner;

public class ExercicioSwitchCase3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float num1,num2;
        int calc;

        System.out.print("Escreva um numero: ");
        num1 = scan.nextFloat();

        System.out.print("Escreva outro numero: ");
        num2 = scan.nextFloat();

        System.out.print("""
Código      Operação
1           Soma
2           Subtração
3           Multiplicação
4           Divisão
Digite uma operação:""");
        calc = scan.nextInt();

        switch (calc){
            case 1:System.out.printf("%.2f + %.2f = %.2f",num1,num2,(num1+num2)); break;
            case 2:System.out.printf("%.2f + %.2f = %.2f",num1,num2,(num1-num2)); break;
            case 3:System.out.printf("%.2f + %.2f = %.2f",num1,num2,(num1*num2)); break;
            case 4:System.out.printf("%.2f + %.2f = %.2f",num1,num2,(num1/num2)); break;
            default:System.out.println("Operação Inválida"); break;
        }


    }
}
