import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Zombie z = new Zombie();

        System.out.print("Digite o nome do zombie: ");
        z.nome = sc.next();
        z.vida = 50;

        boolean flag = true;

        while (flag)
        {
            System.out.println("\n-----------------------");
            System.out.println("0 - Sair");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Perder vida");
            System.out.print("Digite uma opção: ");
            int menu = sc.nextInt();
            switch (menu)
            {
                case 0:
                    System.out.println("\n-----------------------");
                    System.out.println("Você saiu!");
                    System.out.println("-----------------------");
                    flag = false;
                    break;
                case 1:
                    System.out.println("\n-----------------------");
                    System.out.print("Alimente o Zombie: ");
                    int comida = sc.nextInt();
                    z.alimentar(comida);
                    break;
                case 2:
                    System.out.println("\n-----------------------");
                    System.out.println("Tire vida do Zombie (entre com um numero positivo): ");
                    int perder = sc.nextInt();
                    if (perder < 0)
                    {
                        perder = perder*-1;
                        z.perderVida(perder);
                    }
                    else
                        z.perderVida(perder);
                    break;
                default:
                    System.out.println("\n-----------------------");
                    System.out.println("Opção inválida! Tente novamente.");
                    break;

            }
        }
    }
}