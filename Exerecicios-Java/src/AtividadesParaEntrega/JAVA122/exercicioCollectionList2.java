import java.util.ArrayList;
import java.util.Scanner;

public class exercicioCollectionList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(6);

        System.out.print("Digite o número que você deseja encontrar:");
        Integer num1 = Integer.valueOf(scan.nextInt());

        if (list.contains(num1) == true){
            System.out.println("O número " + num1 + " está localizado na posição: " + list.indexOf(num1));
        }else{
            System.out.printf("O número %d não foi encontrado!", num1);
        }
    }
}
