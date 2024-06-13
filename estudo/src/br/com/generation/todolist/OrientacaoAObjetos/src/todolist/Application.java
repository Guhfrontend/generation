package todolist;

import todolist.model.terrestre.Automovel;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Automovel aut1 = new Automovel(5,3,0.0f,"Verde",4,"EBN-0301", 0);

        aut1.visualizar();

    }
}
