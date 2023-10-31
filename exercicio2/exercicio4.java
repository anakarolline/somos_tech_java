import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        scanner.close();

        double media = (nota1 + nota2) / 2;

        if (media >= 6.0) {
            System.out.println("Média: " + media);
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Média: " + media);
            System.out.println("Aluno Reprovado.");
        }
    }
}
