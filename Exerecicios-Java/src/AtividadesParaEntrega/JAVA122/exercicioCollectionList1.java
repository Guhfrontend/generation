import java.util.ArrayList;
import java.util.Scanner;

public class exercicioCollectionList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i <5; i++){
            System.out.printf("Digite uma cor: ");
            list.add(scan.nextLine());
        }

        System.out.println("Listar todas as cores:");
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

        list.sort(null);
        System.out.println("Ordenar as cores:");
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
