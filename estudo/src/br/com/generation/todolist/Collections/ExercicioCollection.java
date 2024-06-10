import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ExercicioCollection {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();

        Double y = Double.valueOf(9);
        notas.add(y);
        notas.add(7.0);
        notas.add(5.0);
        notas.add(10.0);
        notas.add(4.0);
        notas.add(6.5);

        System.out.println(notas);
        //existencia de 2 notas na list
        System.out.println(notas.indexOf(5d));
        // mostra se uma determinada nota existe na lista
        System.out.println(notas.contains(5d));
        // mostra a nota inserida em uma determinada posição
        System.out.println(notas.get(2));
        notas.set(notas.indexOf(5d), 10d);
        System.out.println(notas.get(2));
        System.out.println(notas);
        notas.remove(notas.indexOf(4d));
        System.out.println(notas);

        for (Double nota : notas){
            System.out.println(nota);
        }
        Iterator<Double> iNotas = notas.iterator();

        while (iNotas.hasNext()){
            System.out.println(iNotas.next());
        }

    }
}
