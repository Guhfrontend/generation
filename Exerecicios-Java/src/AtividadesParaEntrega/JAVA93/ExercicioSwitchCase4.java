package JAVA93;

import java.util.Scanner;

public class ExercicioSwitchCase4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = 1000,saque,deposito;
        int operacao;

        System.out.print("""
Código da Operação      Operação
1                       Saldo
2                       Saque
3                       Depósito
Escolha uma operação: """);
        operacao = scan.nextInt();

        switch (operacao){
            case 1: System.out.printf("Seu saldo atual é: %.2f", saldo); break;
            case 2: System.out.print("Digite o valor de saque: ");
                     saque = scan.nextDouble();
                    if (saldo >= saque){
                        saldo -= saque;
                        System.out.print("Saldo: "+ saldo);
                    }else {
                        System.out.print("Saldo inválido");
                    } break;
            case 3:System.out.print("Digite o valor de Deposito: ");
                    deposito = scan.nextDouble();
                    if (deposito > 0){
                        saldo += deposito;
                        System.out.print("Saldo: "+ saldo);
                } break;
            default: System.out.println("opção Inválida!");
        }

    }
}
