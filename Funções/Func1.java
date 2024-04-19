import java.util.Scanner;

public class Func1{


   String emailbd = "teste@teste.com";
   String senhabd = "123";
  


   public boolean login(String email, String senha){

        if(email.equals(emailbd) && senha.equals(senhabd)){            
            return true;
        }else{         
            return false;
        }

     }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String usuario, senha;

      Func1 ex = new Func1();

       System.out.println("Digite o e-mail:");
       usuario = sc.next();
       System.out.println("Digite a senha:");
       senha = sc.next();
      
       boolean resultado = ex.login(usuario, senha);

       System.out.println(resultado);

   }
}