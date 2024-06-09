package JAVA93;

import java.util.Scanner;

public class ExercicioIfElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome1, nome2, nome3;

        System.out.println("Vertebrado ou Invertebrado: ");
        nome1 = scan.nextLine();

        if (nome1.equalsIgnoreCase("Vertebrado")){
            System.out.println("Ave ou Mamífero: ");
            nome1 = scan.nextLine();
            if (nome1.equalsIgnoreCase("Ave")){
                System.out.println("Carnívoro ou Onívoro: ");
                nome1 = scan.nextLine();
                if (nome1.equalsIgnoreCase("Carnívoro")){
                    System.out.println("Águia");
                }else{
                    System.out.println("Pomba");
                }
            }else if (nome1.equalsIgnoreCase("Mamifero")) {
                System.out.println("Carnívoro ou Onívoro: ");
                nome1 = scan.nextLine();
                }if (nome1.equalsIgnoreCase("Onívoro")){
                System.out.println("Homem");
                }else {
                System.out.println("Vaca");
            }
        } else if (nome1.equalsIgnoreCase("Invertebrado")) {
            System.out.println("Inseto ou Anélídeo: ");
            nome1 = scan.nextLine();
            if (nome1.equalsIgnoreCase("Inseto")) {
                System.out.println("Hematófago ou Herbivoro: ");
                nome1 = scan.nextLine();
                if (nome1.equalsIgnoreCase("Hematófago")) {
                    System.out.println("Pulga");
                    }else {
                    System.out.println("Lagarta");
                    }
            } else if (nome1.equalsIgnoreCase("Anélídeo")) {
                System.out.println("Carnívoro ou Onívoro: ");
                nome1 = scan.nextLine();
            }if (nome1.equalsIgnoreCase("Onívoro")) {
                System.out.println("Sanguessuga");
                } else {
                System.out.println("Minhoca");
                }


        }
    }
}
