package br.com.generation.todolist.EstruturaDeDados.Aula01.src;

import java.util.*;

public class QueueList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue<Integer> fila = new LinkedList<>(Arrays.asList(2,5,1,3,4,6,8,10,7,9));

        System.out.println(fila.remove());
        System.out.println(fila);
        System.out.println(fila.add(11));
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila);
        System.out.println(fila.size());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);
        //pool | remove - se a fila estiver vazia o remove retorna erro, pool retorna null

        Iterator<Integer> ifila = fila.iterator();

        while (ifila.hasNext()){
            System.out.println(ifila.next());
        }


    }
}