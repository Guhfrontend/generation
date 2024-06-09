package JAVA93;

import java.util.Scanner;

public class ExercicioSwitchCase2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int cargo;
        double salario;

        System.out.println("""
Código do Cargo   Cargo          Percentual do Reajuste
1                 Gerente        10%
2                 Vendedor       7%
3                 Supervisor     9%
4                 Motorista      6%
5                 Estoquista     5%
6                 Técnico de TI  8%""");

        System.out.print("Nome do Colaborador: ");
        name = scan.nextLine();

        System.out.print("Cargo: ");
        cargo = scan.nextInt();

        System.out.print("Salário: ");
        salario = scan.nextDouble();

        switch (cargo){
            case 1: System.out.printf("Nome do colaborador: %s \n Cargo: Gerente \n Salário: %.2f", name,
                    salario+(salario*10/100)); break;
            case 2:  System.out.printf("Nome do colaborador: %s \n Cargo: Vendedor \n Salário: %.2f", name,
                    salario+(salario*7/100));  break;
            case 3:  System.out.printf("Nome do colaborador: %s \n Cargo: Supervisor \n Salário: %.2f", name,
                    salario+(salario*9/100));  break;
            case 4:  System.out.printf("Nome do colaborador: %s \n Cargo: Motorista \n Salário: %.2f", name,
                    salario+(salario*6/100));  break;
            case 5:  System.out.printf("Nome do colaborador: %s \n Cargo: Estoquista \n Salário: %.2f", name,
                    salario+(salario*5/100));  break;
            case 6:  System.out.printf("Nome do colaborador: %s \n Cargo: Técnico de TI \n Salário: %.2f", name,
                    salario+(salario*8/100));
            default: System.out.println("Cargo Inválido");  break;

        }
    }
}
