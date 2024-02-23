//Crie um programa em Java que solicita ao usuário que digite um número inteiro e, em seguida, classifica o número como positivo, negativo ou zero.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}

