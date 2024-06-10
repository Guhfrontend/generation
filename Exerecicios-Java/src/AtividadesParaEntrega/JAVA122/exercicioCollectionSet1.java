import java.util.*;

public class exercicioCollectionSet1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> setlist = new HashSet<>();

        for (Integer i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            setlist.add(scan.nextInt());
        }

        Iterator<Integer> isetlist = setlist.iterator();

        System.out.println("Listar dados do Set:");
        while (isetlist.hasNext()){
            System.out.println(isetlist.next());
        }
    }
}
