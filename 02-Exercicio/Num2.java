import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas coxinhas foram vendidas: ");
        int coxinha = sc.nextInt();
        System.out.print("Digite quantas empadas foram vendidas: ");
        int empada = sc.nextInt();
        System.out.print("Digite quantos pasteis foram vendidos: ");
        int pastel = sc.nextInt();

        float media = (coxinha+empada+pastel)/3f;

        System.out.println("Em 3hrs a média de salgados vendidos foram " + media);

        sc.close();
    }
    
}
