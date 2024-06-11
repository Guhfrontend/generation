package br.com.generation.todolist.EstruturaDeDados.Aula01.src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        stack.push("Prato verde");
        stack.push("Prato Azul");
        stack.push("Prato Branco");
        stack.push("Prato Amarelo");
        stack.push("Prato Vermelho");

        System.out.println(stack);
        System.out.println();


    }
}
