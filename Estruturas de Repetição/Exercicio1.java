/*
 Elabore um algoritmo em java que solicita ao usuário para adivinhar um número aleatório entre 1 e 100. 
 O algoritmo continuará pedindo ao usuário para tentar adivinhar até que ele acerte o número.  
 */

import java.util.Scanner;
import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        
        System.out.println("Adivinhe o número entre 1 e 100:");
        
        while (true) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            
            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        
        scanner.close();
    }
}
