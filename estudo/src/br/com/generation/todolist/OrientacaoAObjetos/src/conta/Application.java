package conta;

import conta.Conta;

import java.util.Scanner;

public class Application extends Conta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.visualiza();

        c1.setSaldo(20000.0f);
        c1.setTitular("Lourenço Silva");
        c1.visualiza();

    }
}
