import java.util.Random;

public class exercicio4{
    public static int gerarNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
}
public class TesteMatematica {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            int numeroAleatorio = Matematica.gerarNumeroAleatorio();
            System.out.println("Número aleatório #" + (i + 1) + ": " + numeroAleatorio);
        }
    }
}
