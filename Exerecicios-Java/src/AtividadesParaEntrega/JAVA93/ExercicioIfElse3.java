package JAVA93;

import java.util.Scanner;

public class ExercicioIfElse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int idade;
        boolean firstDonate;

        System.out.print("Digite o Nome do doador: ");
        name = scan.nextLine();


        System.out.print("Digite a idade do doador: ");
        idade = scan.nextInt();

        System.out.print("Primeira doação de sangue? ");
        firstDonate = scan.nextBoolean();

        if (idade < 18 && idade > 69){
            System.out.printf("%s não está apto para doar!", name);
        }else if (idade >= 60 && idade <= 69 && firstDonate == true) {
            System.out.printf("%s não está apto para doar!", name);
        }else {
            System.out.printf("%s está apto para doar!", name);
        }
    }
}
