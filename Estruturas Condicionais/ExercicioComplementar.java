/* Um escritório de contabilidade possui a rotina de cálculo de folha de pagamento de uma empresa. 
A empresa possui dois tipos de colaboradores: Junior e Sênior. O colaborador Junior se enquadra na faixa etária de 18 a 36 anos. 
O colaborador Sênior se enquadra na faixa etária de 37 a 70 anos. 
Os colaboradores Junior possuem um desconto de 11% de INSS e um adicional de 5% sobre o salário bruto. 
Já os colaboradores Sênior possuem um desconto de 11% de INSS e 7% de adicional sobre o salário bruto.

Com base nas informações acima, elabore um algoritmo em Java para realizar o cálculo do salário líquido. */



import java.util.Scanner;

public class ExercicioComplementar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do colaborador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double inss = 0.11 * salarioBruto; // 11% de desconto de INSS

        double adicional = 0;

        if (idade >= 18 && idade <= 36) {
            adicional = 0.05 * salarioBruto; // 5% de adicional para Junior
        } else if (idade >= 37 && idade <= 70) {
            adicional = 0.07 * salarioBruto; // 7% de adicional para Sênior
        } else {
            System.out.println("Idade fora da faixa permitida.");
            return;
        }

        double salarioLiquido = salarioBruto - inss + adicional;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto de INSS: R$" + inss);
        System.out.println("Adicional: R$" + adicional);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
