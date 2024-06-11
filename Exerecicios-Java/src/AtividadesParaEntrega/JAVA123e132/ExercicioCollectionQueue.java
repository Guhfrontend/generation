package JAVA123e132;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioCollectionQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue<String> fila = new LinkedList<>();
        int num1 = -1;

        System.out.print("""
*************************************************
        1 - Adicionar Cliente na Fila
        2 - Listar todos os Clientes
        3 - Retirar Cliente da Fila
        0 - Sair
*************************************************
""");
        while (num1 != 0){
            System.out.print("Entre com a opção desejada:");
            num1 = scan.nextInt();

            if (num1 == 1){
                System.out.print("Digite o nome:");
                fila.add(scan.next());
                System.out.println("\nFila " + fila);
                System.out.println("Cliente adicionado");

            }else if (num1 == 2){
                System.out.println(fila);

            }else if (num1 == 3){
                if (fila.isEmpty() == true){
                    System.out.println("\nFila Vazia!");
                }else {
                    System.out.println("\nFila " + fila);
                    System.out.println("\nO cliente foi chamado: " + fila.peek());
                    fila.poll();
                }
            }else {
                System.out.println("Programa finalizado!");
            }

        }
    }
}
