package JAVA123e132;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioCollectionStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int num1 = -1;

        System.out.print("""
***********************************************
        1 - Adicionar Livro na pilha
        2 - Listar todos os livros
        3 - retirar livro da pilha
        0 - sair
**********************************************
""");

        while (num1 != 0){
            System.out.print("Entre com a opção desejada:");
            num1 = scan.nextInt();

            if (num1 == 1){
                System.out.print("Digite o nome:");
                stack.push(scan.next());
                System.out.println("\npilha: " +stack);
                System.out.println("Livro adicionado!");

            }else if (num1 == 2){
                System.out.println(stack);

            }else if (num1 == 3){
                if (stack.isEmpty() == true){
                    System.out.println("\nA Pilha está Vazia!");
                }else {
                    System.out.println("\npilha: " +stack);
                    System.out.println("\nUm livro foi retirado da Pilha!");
                    stack.pop();
                }
            }else if ( num1 < 0 || num1 > 3){
                System.out.println("Código Inválido");
            }
        }
        System.out.println("Programa finalizado!");
    }
}
