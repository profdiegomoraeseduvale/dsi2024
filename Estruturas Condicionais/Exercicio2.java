//Elabore um programa em Java que solicita ao usuário os três lados de um triângulo e verifica se é um triângulo equilátero, isósceles ou escaleno

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 3: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É um triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("É um triângulo isósceles.");
        } else {
            System.out.println("É um triângulo escaleno.");
        }
    }
}

