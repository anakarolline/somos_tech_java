import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {

        Random random = new Random();

        int tamanho = 10;

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Array de números inteiros aleatórios:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
