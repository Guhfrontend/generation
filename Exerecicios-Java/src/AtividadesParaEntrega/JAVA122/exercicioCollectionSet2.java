import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicioCollectionSet2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> setlist = new HashSet<>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));

        System.out.print("Digite um número: ");
        Integer num1 = scan.nextInt();

        if (setlist.contains(num1)){
            System.out.printf("O número %d foi encontrado!", num1);
        }else {
            System.out.printf("O número %d não foi encontrado!", num1);
        }
    }
}
