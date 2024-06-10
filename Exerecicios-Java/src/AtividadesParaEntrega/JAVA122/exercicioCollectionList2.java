import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercicioCollectionList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));

        System.out.print("Digite o número que você deseja encontrar:");
        Integer num1 = Integer.valueOf(scan.nextInt());

        if (list.contains(num1) == true){
            System.out.println("O número " + num1 + " está localizado na posição: " + list.indexOf(num1));
        }else{
            System.out.printf("O número %d não foi encontrado!", num1);
        }
    }
}
