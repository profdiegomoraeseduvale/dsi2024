import java.util.Scanner;

public class Func2 {

    public double media(double n1, double n2){

        double resultado = (n1+n2)/2;

        return resultado;
    }

    public void verifica(double media){
        if(media>=7){
            System.out.println("Aprovado");
        }else if(media<4){
            System.out.println("Reprovado");
        }else{
            System.out.println("Exame");
        }
    }


    public static void main(String[] args) {

        double n1, n2, resultado;

        Scanner sc = new Scanner(System.in);

        Func2 ex = new Func2();

        System.out.println("Digite o valor da nota 1:");
        n1 = sc.nextDouble();

        System.out.println("Digite o valor da nota 2:");
        n2 = sc.nextDouble();

        resultado = ex.media(n1, n2);

        System.out.println("A média é: "+resultado);

        ex.verifica(resultado);
        
    }
    
}
