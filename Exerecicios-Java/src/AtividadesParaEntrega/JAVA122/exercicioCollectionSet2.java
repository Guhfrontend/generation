import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicioCollectionSet2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> setlist = new HashSet<>();

        setlist.add(2);
        setlist.add(5);
        setlist.add(1);
        setlist.add(3);
        setlist.add(4);
        setlist.add(9);
        setlist.add(7);
        setlist.add(8);
        setlist.add(10);
        setlist.add(6);

        System.out.print("Digite um número: ");
        Integer num1 = scan.nextInt();

        if (setlist.contains(num1)){
            System.out.printf("O número %d foi encontrado!", num1);
        }else {
            System.out.printf("O número %d não foi encontrado!", num1);
        }
    }
}
