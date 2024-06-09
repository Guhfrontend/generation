package JAVA93;

import java.util.Scanner;

public class ExercicioSwitchCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codProdut;
        int quant;


        System.out.println("""
Código do Produto       Produto             Preço Unitário
1                       Cachorro Quente     R$ 10.00
2                       X-Salada            R$ 15.00
3                       X-Bacon             R$ 18.00
4                       Bauru               R$ 12.00
5                       Refrigerante        R$ 8.00
6                       Suco de laranja     R$ 13.00 """);

        System.out.print("Código do produto: ");
        codProdut = scan.nextInt();
        System.out.print("Quantidade: ");
        quant = scan.nextInt();

        switch (codProdut){
            case 1: System.out.printf("Produto: Cachorro-Quente Valor total:%.2f", quant*10.00); break;
            case 2: System.out.printf("Produto: X-salada \n Valor total: %.2f", quant*15.00); break;
            case 3: System.out.printf("Produto: X-Bacon \n Valor total: %.2f", quant*18.00); break;
            case 4: System.out.printf("Produto: Bauru \n Valor total: %.2f", quant*12.00); break;
            case 5: System.out.printf("Produto: Refrigente \n Valor total: %.2f", quant*8.00); break;
            case 6: System.out.printf("Produto:Suco de \n Laranja Valor total: %.2f", quant*13.00); break;
            default: System.out.printf("Código inválido"); break;

        }


    }
}
