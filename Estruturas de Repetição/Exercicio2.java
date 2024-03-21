/* 
 Elabore um algoritmo em Java que solicita ao usuário para digitar números até que ele insira um número negativo. O programa calculará a soma dos números digitados.
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        
        System.out.println("Digite números para somar (insira um número negativo para terminar):");
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);
        
        System.out.println("A soma dos números digitados é: " + soma);
        
        scanner.close();
    }
}


