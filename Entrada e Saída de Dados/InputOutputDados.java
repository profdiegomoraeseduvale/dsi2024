import java.util.Scanner;
public class InputOutputDados {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);        
        
        System.out.println("Digite sua idade");
        String idadeTxt = scan.nextLine();
        int idade = Integer.parseInt(idadeTxt);
        
        System.out.println("A idade é: "+idadeTxt);
        System.out.println("A idade no próximo ano será: "+(idade+1));
        
    }
}
