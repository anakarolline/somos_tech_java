import java.util.Scanner;

public class NumerosParesFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero <= 0) {
            System.out.println("O número não é positivo.");
            return;
        }

        System.out.println("Números pares de 1 a " + numero + " (usando for):");
        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero <= 0) {
            System.out.println("O número não é positivo.");
            return;
        }

        System.out.println("Números pares de 1 a " + numero + " (usando while):");
        int i = 2;
        while (i <= numero) {
            System.out.println(i);
            i += 2;
        }
    }
}


