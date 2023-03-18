import java.util.Scanner;

public class Sala
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean aux = true;

        while (aux)
        {
            System.out.println("Quantidade de alunos (10, 20 ou 30): ");
            int alunos = sc.nextInt();

            if(alunos == 10 || alunos == 20)
            {
                System.out.println("Sala 16");
                System.out.println("------------------------------");
                aux = false;
            }
            else if (alunos == 30)
            {
                System.out.println("Sala 22");
                System.out.println("------------------------------");
                aux = false;
            }
            else
            {
                System.out.println("Numero invalido");
                System.out.println("------------------------------");
            }


        }
    }
}
