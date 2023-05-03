import java.util.Random;

public class Zombie {
    Random r = new Random();
    String nome;
    int vida;
    boolean comeu;

    public void zombie_alimentado()
    {
        if (vida >= 100)
        {
            comeu = true;
            System.out.println("Zombie alimentado (" + comeu + ")");
        }
        else
            comeu = false;

    }
    public void alimentar(int food)
    {
        vida += food;
        System.out.println("Vida = " + vida);
        zombie_alimentado();
    }

    public void perderVida (int lose)
    {
        vida -= lose;
        if(vida <= 0)
        {
            vida = 0;
            System.out.println("O Zombie morreu");
        }
        else {
            System.out.println("Zombie danificado");
            System.out.println("Vida = " + vida);
        }
    }

}
