import java.util.Random;
import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
         // Instanciando classes
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
 
         int num = rand.nextInt(10) + 1;

         int x;
 
         System.out.println("Tente adivinhar o numero de 1 a 10");
         x = sc.nextInt();
 
         do{
            if(x > num)
            {
                System.out.print("\nO valor que você digitou é maior!\nTente um numero menor: ");
                x = sc.nextInt();
            } 
            else
            {
                System.out.print("\nO valor que você digitou é menor!\nTente um numero maior: ");
                x = sc.nextInt();
            }
 
         } while(!(num == x));
 
         System.out.println("\nParabens, você acertou!\nO numero era " + num);
 
         // Fechando entrada de dados
         sc.close();
    }
    
}
