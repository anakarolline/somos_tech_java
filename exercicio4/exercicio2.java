public class exercicio2 {
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN; 
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.somar(5.0, 3.0);
        System.out.println("Soma: " + resultadoSoma);

        double resultadoSubtracao = calculadora.subtrair(10.0, 4.0);
        System.out.println("Subtração: " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicar(6.0, 2.0);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.dividir(8.0, 2.0);
        System.out.println("Divisão: " + resultadoDivisao);

        double resultadoDivisaoPorZero = calculadora.dividir(6.0, 0.0);
        System.out.println("Divisão por zero: " + resultadoDivisaoPorZero);
    }
}
