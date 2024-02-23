public class Calculadora {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double) a / b; // Convertendo um dos operandos para double para obter resultado com casas decimais

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
