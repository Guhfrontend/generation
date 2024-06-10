import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {

        Set<String> setFrutas = new HashSet<>();
        setFrutas.add("Abacate");
        setFrutas.add("Banana");
        setFrutas.add("Jaboticaba");
        setFrutas.add("Kiwi");
        setFrutas.add("Maça");
        setFrutas.add("Morango");
        setFrutas.add("Pêra");
        setFrutas.add("Jaboticaba");
        setFrutas.add("Kiwi");

        System.out.println(setFrutas);
        System.out.println(setFrutas.contains("Kiwi"));

        setFrutas.remove("Kiwi");
        System.out.println(setFrutas.contains("Kiwi"));

        for (String fruta : setFrutas){
            if (fruta != null){
                System.out.println("Hashcode: " + fruta.hashCode());
            }
        }
        Iterator<String> isetFrutas = setFrutas.iterator();

        while (isetFrutas.hasNext()){
            System.out.println(isetFrutas);
        }
        System.out.println(setFrutas.isEmpty());
        setFrutas.clear();
        System.out.println(setFrutas.isEmpty());

    }
}
