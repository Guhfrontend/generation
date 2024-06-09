package JAVA102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class execicioWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        int genero;
        int dev;
        int devBackend = 0;
        int mulher = 0;
        int homem = 0;
        int naobi = 0;
        int i = 0;
        float somaIdade = 0;
        char cont = 'S';


        System.out.println("""
                
                Identidade de Gênero:
                1 – Mulher Cis
                2 – Homem Cis
                3 – Não Binário
                4 – Mulher Trans
                5 – Homem Trans
                6 – Outros
                Pessoa Desenvolvedora:
                1 – Backend
                2 – Frontend
                3 – Mobile
                4 – FullStack
                """);

        while (cont != 'N'){

            System.out.println("Digite suas informações:");
            System.out.print("Idade: ");
            idade = scan.nextInt();


            System.out.print("Pessoas de Gênero: ");
            genero = scan.nextInt();

            System.out.print("Pessoas Desenvolvedora: ");
            dev = scan.nextInt();

            System.out.print("Deseja continuar(S/N)");
            cont = Character.toUpperCase(scan.next().charAt(0));
                if(cont != 'N' && cont != 'S'){
                    System.out.println("Opção Inválida"); break;
                }
            i++;
            somaIdade += idade;
            System.out.println();
            if (dev == 1){
                devBackend++;
            }if (genero == 1 || genero == 4 && dev == 2){
                mulher++;
            }if (genero == 2 || genero == 5 && idade > 40){
                homem++;
            }if (genero == 3 && dev == 4 && idade < 30){
                naobi++;
            }
        }
        System.out.printf("Total de pessoas desenvolvedoras Backend: %d \n", devBackend);
        System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d \n", mulher);
        System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n", homem);
        System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d\n", naobi);
        System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", i);
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", somaIdade/i);




    }
}
