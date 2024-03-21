/*
 Elabore um algoritmo que imprime os primeiros 10 números da sequência de Fibonacci.
 */

public class Exercicio3 {
    public static void main(String[] args) {
        int n = 10;
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");
            
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}

