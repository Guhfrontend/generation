import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1,n2,n3,n4;

        System.out.print("Digite o numero 1: ");
        n1 = scan.nextFloat();

        System.out.print("Digite o numero 2: ");
        n2 = scan.nextFloat();

        System.out.print("Digite o numero 3: ");
        n3 = scan.nextFloat();

        System.out.print("Digite o numero 4: ");
        n4 = scan.nextFloat();

        double diferenca = (n1*n2) - (n3*n4);

        System.out.println("Diferença : " + diferenca);
    }
}
