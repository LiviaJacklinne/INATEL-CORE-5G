import java.util.Scanner;

public class Nota
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (0-100): ");
        float nota = sc.nextFloat();

        if (nota >= 60)
        {
            System.out.println("Parabens você foi aprovado! \nNota " + nota);
        }
        else if(nota <30)
        {
            System.out.println("Você foi reprovado! \nNota " + nota);
        }
        else
        {
            System.out.println("Fazer NP3");
            System.out.println("Você precisa de " + (100-nota) + " para passar");

            System.out.print("\nDigite a nota da NP3 (0-100): ");
            float NP3 = sc.nextFloat();

            float NPA = (NP3+nota)/2;

            if (NPA >= 50)
            {
                System.out.println("Parabens você foi aprovado! \nNota " + NPA);
            }
            else
                System.out.println("Você foi reprovado! \nNota " + NPA);

        }


    }
}
