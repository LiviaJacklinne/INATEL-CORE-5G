import java.util.Random;
import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {

        // Instanciando classes
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(10);
        int x;

        System.out.println("Tente adivinhar o numero de 0 a 10");
        x = sc.nextInt();

        do{
            System.out.print("\nNumero incorreto :(\nTente novamente ");
            x = sc.nextInt();

        } while(!(num == x));

        System.out.println("\nParabens, você acertou!\nO numero era " + num);

        // Fechando entrada de dados
        sc.close();
    }
    
}
