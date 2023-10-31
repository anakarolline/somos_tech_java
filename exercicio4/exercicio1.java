public class exericio1 {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimePessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        System.out.println("Informações da Pessoa 1:");
        pessoa1.imprimePessoa();

        System.out.println("\nInformações da Pessoa 2:");
        pessoa2.imprimePessoa();
    }
}
